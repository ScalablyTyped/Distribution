package typings.rimraf

import typings.glob.mod.IOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import typings.rimraf.anon.Fn0
import typings.rimraf.anon.FnCall
import typings.rimraf.anon.FnCallPathOptions
import typings.rimraf.anon.Typeofchmod
import typings.rimraf.anon.Typeoflstat
import typings.rimraf.anon.Typeofreaddir
import typings.rimraf.anon.Typeofrmdir
import typings.rimraf.anon.Typeofstat
import typings.rimraf.anon.Typeofunlink
import typings.rimraf.rimrafBooleans.`false`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rimraf", JSImport.Namespace)
  @js.native
  def apply(path: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  @JSImport("rimraf", JSImport.Namespace)
  @js.native
  def apply(path: String, options: Options, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  
  /**
    * It can remove stuff synchronously, too.
    * But that's not so good. Use the async API.
    * It's better.
    */
  @JSImport("rimraf", "sync")
  @js.native
  def sync(path: String): Unit = js.native
  @JSImport("rimraf", "sync")
  @js.native
  def sync(path: String, options: Options): Unit = js.native
  
  /**
    * see {@link https://github.com/isaacs/rimraf/blob/79b933fb362b2c51bedfa448be848e1d7ed32d7e/README.md#options}
    */
  @js.native
  trait Options extends StObject {
    
    var chmod: js.UndefOr[Typeofchmod] = js.native
    
    var chmodSync: js.UndefOr[js.Function2[/* path */ PathLike, /* mode */ Mode, Unit]] = js.native
    
    /** @default false */
    var disableGlob: js.UndefOr[Boolean] = js.native
    
    var emfileWait: js.UndefOr[Double] = js.native
    
    var glob: js.UndefOr[IOptions | `false`] = js.native
    
    var lstat: js.UndefOr[Typeoflstat] = js.native
    
    var lstatSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.native
    
    var maxBusyTries: js.UndefOr[Double] = js.native
    
    var readdir: js.UndefOr[Typeofreaddir] = js.native
    
    var readdirSync: js.UndefOr[Fn0] = js.native
    
    var rmdir: js.UndefOr[Typeofrmdir] = js.native
    
    var rmdirSync: js.UndefOr[FnCallPathOptions] = js.native
    
    var stat: js.UndefOr[Typeofstat] = js.native
    
    var statSync: js.UndefOr[FnCall] = js.native
    
    var unlink: js.UndefOr[Typeofunlink] = js.native
    
    var unlinkSync: js.UndefOr[js.Function1[/* path */ PathLike, Unit]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChmod(value: Typeofchmod): Self = StObject.set(x, "chmod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChmodSync(value: (/* path */ PathLike, /* mode */ Mode) => Unit): Self = StObject.set(x, "chmodSync", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChmodSyncUndefined: Self = StObject.set(x, "chmodSync", js.undefined)
      
      @scala.inline
      def setChmodUndefined: Self = StObject.set(x, "chmod", js.undefined)
      
      @scala.inline
      def setDisableGlob(value: Boolean): Self = StObject.set(x, "disableGlob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableGlobUndefined: Self = StObject.set(x, "disableGlob", js.undefined)
      
      @scala.inline
      def setEmfileWait(value: Double): Self = StObject.set(x, "emfileWait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmfileWaitUndefined: Self = StObject.set(x, "emfileWait", js.undefined)
      
      @scala.inline
      def setGlob(value: IOptions | `false`): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
      
      @scala.inline
      def setLstat(value: Typeoflstat): Self = StObject.set(x, "lstat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLstatSync(value: /* path */ PathLike => Stats): Self = StObject.set(x, "lstatSync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLstatSyncUndefined: Self = StObject.set(x, "lstatSync", js.undefined)
      
      @scala.inline
      def setLstatUndefined: Self = StObject.set(x, "lstat", js.undefined)
      
      @scala.inline
      def setMaxBusyTries(value: Double): Self = StObject.set(x, "maxBusyTries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBusyTriesUndefined: Self = StObject.set(x, "maxBusyTries", js.undefined)
      
      @scala.inline
      def setReaddir(value: Typeofreaddir): Self = StObject.set(x, "readdir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReaddirSync(value: Fn0): Self = StObject.set(x, "readdirSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReaddirSyncUndefined: Self = StObject.set(x, "readdirSync", js.undefined)
      
      @scala.inline
      def setReaddirUndefined: Self = StObject.set(x, "readdir", js.undefined)
      
      @scala.inline
      def setRmdir(value: Typeofrmdir): Self = StObject.set(x, "rmdir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRmdirSync(value: FnCallPathOptions): Self = StObject.set(x, "rmdirSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRmdirSyncUndefined: Self = StObject.set(x, "rmdirSync", js.undefined)
      
      @scala.inline
      def setRmdirUndefined: Self = StObject.set(x, "rmdir", js.undefined)
      
      @scala.inline
      def setStat(value: Typeofstat): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatSync(value: FnCall): Self = StObject.set(x, "statSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatSyncUndefined: Self = StObject.set(x, "statSync", js.undefined)
      
      @scala.inline
      def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
      
      @scala.inline
      def setUnlink(value: Typeofunlink): Self = StObject.set(x, "unlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnlinkSync(value: /* path */ PathLike => Unit): Self = StObject.set(x, "unlinkSync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnlinkSyncUndefined: Self = StObject.set(x, "unlinkSync", js.undefined)
      
      @scala.inline
      def setUnlinkUndefined: Self = StObject.set(x, "unlink", js.undefined)
    }
  }
}
