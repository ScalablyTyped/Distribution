package typings.remoteOriginUrl

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[js.UndefOr[String]]]
  @scala.inline
  def apply(callback: Callback): Unit = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(options: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  @scala.inline
  def apply(options: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(options: Options): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  @scala.inline
  def apply(options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("remote-origin-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def promise(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promise")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  @scala.inline
  def promise(options: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promise")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  @scala.inline
  def promise(options: Options): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promise")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  @scala.inline
  def sync(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def sync(options: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def sync(options: Options): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  type Callback = js.Function2[/* error */ Error | Null, /* url */ js.UndefOr[String], Unit]
  
  trait Options extends StObject {
    
    var path: js.UndefOr[String] = js.undefined
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
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
