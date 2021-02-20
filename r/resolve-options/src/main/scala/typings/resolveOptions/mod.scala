package typings.resolveOptions

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("resolve-options", JSImport.Namespace)
  @js.native
  def apply(config: Config, options: Options): Resolver = js.native
  
  type Config = StringDictionary[ConfigItem]
  
  @js.native
  trait ConfigItem extends StObject {
    
    var default: js.UndefOr[js.Any] = js.native
    
    var `type`: String | js.Array[String] = js.native
  }
  object ConfigItem {
    
    @scala.inline
    def apply(`type`: String | js.Array[String]): ConfigItem = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigItem]
    }
    
    @scala.inline
    implicit class ConfigItemMutableBuilder[Self <: ConfigItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var allowEmpty: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.native
    
    var base: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, String])] = js.native
    
    var buffer: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.native
    
    var cwd: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, String])] = js.native
    
    var deep: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.native
    
    var dirMode: js.UndefOr[String | Double | (js.Function1[/* repeated */ js.Any, String | Double])] = js.native
    
    var mode: js.UndefOr[String | Double | (js.Function1[/* repeated */ js.Any, String | Double])] = js.native
    
    var overwrite: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.native
    
    var passthrough: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.native
    
    var read: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, Boolean])] = js.native
    
    var since: js.UndefOr[Date | Double | (js.Function1[/* repeated */ js.Any, Date | Double])] = js.native
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
      def setAllowEmpty(value: Boolean | (js.Function1[/* repeated */ js.Any, Boolean])): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyFunction1(value: /* repeated */ js.Any => Boolean): Self = StObject.set(x, "allowEmpty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      @scala.inline
      def setBase(value: String | (js.Function1[/* repeated */ js.Any, String])): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseFunction1(value: /* repeated */ js.Any => String): Self = StObject.set(x, "base", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setBuffer(value: Boolean | (js.Function1[/* repeated */ js.Any, Boolean])): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferFunction1(value: /* repeated */ js.Any => Boolean): Self = StObject.set(x, "buffer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setCwd(value: String | (js.Function1[/* repeated */ js.Any, String])): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdFunction1(value: /* repeated */ js.Any => String): Self = StObject.set(x, "cwd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDeep(value: Boolean | (js.Function1[/* repeated */ js.Any, Boolean])): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepFunction1(value: /* repeated */ js.Any => Boolean): Self = StObject.set(x, "deep", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      @scala.inline
      def setDirMode(value: String | Double | (js.Function1[/* repeated */ js.Any, String | Double])): Self = StObject.set(x, "dirMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirModeFunction1(value: /* repeated */ js.Any => String | Double): Self = StObject.set(x, "dirMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDirModeUndefined: Self = StObject.set(x, "dirMode", js.undefined)
      
      @scala.inline
      def setMode(value: String | Double | (js.Function1[/* repeated */ js.Any, String | Double])): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeFunction1(value: /* repeated */ js.Any => String | Double): Self = StObject.set(x, "mode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOverwrite(value: Boolean | (js.Function1[/* repeated */ js.Any, Boolean])): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteFunction1(value: /* repeated */ js.Any => Boolean): Self = StObject.set(x, "overwrite", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      @scala.inline
      def setPassthrough(value: Boolean | (js.Function1[/* repeated */ js.Any, Boolean])): Self = StObject.set(x, "passthrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassthroughFunction1(value: /* repeated */ js.Any => Boolean): Self = StObject.set(x, "passthrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPassthroughUndefined: Self = StObject.set(x, "passthrough", js.undefined)
      
      @scala.inline
      def setRead(value: Boolean | (js.Function1[/* repeated */ js.Any, Boolean])): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadFunction1(value: /* repeated */ js.Any => Boolean): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setSince(value: Date | Double | (js.Function1[/* repeated */ js.Any, Date | Double])): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSinceFunction1(value: /* repeated */ js.Any => Date | Double): Self = StObject.set(x, "since", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    }
  }
  
  @js.native
  trait Resolver extends StObject {
    
    def resolve(key: String): js.UndefOr[Double | String | Boolean | Date | Null] = js.native
  }
  object Resolver {
    
    @scala.inline
    def apply(resolve: String => js.UndefOr[Double | String | Boolean | Date | Null]): Resolver = {
      val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[Resolver]
    }
    
    @scala.inline
    implicit class ResolverMutableBuilder[Self <: Resolver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResolve(value: String => js.UndefOr[Double | String | Boolean | Date | Null]): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
}
