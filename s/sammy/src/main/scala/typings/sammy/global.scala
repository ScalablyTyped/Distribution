package typings.sammy

import typings.sammy.Sammy.Application
import typings.sammy.Sammy.DataLocationProxy
import typings.sammy.Sammy.FormBuilder
import typings.sammy.Sammy.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Sammy {
    
    @JSGlobal("Sammy")
    @js.native
    def apply(): Application = js.native
    @JSGlobal("Sammy")
    @js.native
    def apply(handler: js.Function): Application = js.native
    @JSGlobal("Sammy")
    @js.native
    def apply(selector: String): Application = js.native
    @JSGlobal("Sammy")
    @js.native
    def apply(selector: String, handler: js.Function): Application = js.native
    @JSGlobal("Sammy")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Sammy.Cache")
    @js.native
    def Cache(app: js.Any, options: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.DataCacheProxy")
    @js.native
    def DataCacheProxy(initial: js.Any, $element: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.DataLocationProxy")
    @js.native
    def DataLocationProxy: typings.sammy.Sammy.DataLocationProxy = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Sammy.DataLocationProxy")
    @js.native
    class DataLocationProxyCls protected () extends DataLocationProxy {
      def this(app: js.Any) = this()
      def this(app: js.Any, run_interval_every: js.Any) = this()
      def this(app: js.Any, data_name: js.Any, href_attribute: js.Any) = this()
    }
    
    @scala.inline
    def DataLocationProxy_=(x: DataLocationProxy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataLocationProxy")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Sammy.DefaultLocationProxy")
    @js.native
    def DefaultLocationProxy(app: js.Any, run_interval_every: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.EJS")
    @js.native
    def EJS(app: js.Any, method_alias: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.Exceptional")
    @js.native
    def Exceptional(app: js.Any, errorReporter: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.Flash")
    @js.native
    def Flash(app: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.Form")
    @js.native
    def Form(app: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.FormBuilder")
    @js.native
    def FormBuilder: typings.sammy.Sammy.FormBuilder = js.native
    @scala.inline
    def FormBuilder_=(x: FormBuilder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FormBuilder")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Sammy.Haml")
    @js.native
    def Haml(app: js.Any, method_alias: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.Handlebars")
    @js.native
    def Handlebars(app: js.Any, method_alias: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.Hogan")
    @js.native
    def Hogan(app: js.Any, method_alias: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.Hoptoad")
    @js.native
    def Hoptoad(app: js.Any, errorReporter: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.JSON")
    @js.native
    def JSON(app: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.Meld")
    @js.native
    def Meld(app: js.Any, method_alias: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.MemoryCacheProxy")
    @js.native
    def MemoryCacheProxy(initial: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.Mustache")
    @js.native
    def Mustache(app: js.Any, method_alias: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.NestedParams")
    @js.native
    def NestedParams(app: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.OAuth2")
    @js.native
    def OAuth2(app: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.Object")
    @js.native
    class Object protected ()
      extends typings.sammy.Sammy.Object {
      def this(obj: js.Any) = this()
    }
    
    @JSGlobal("Sammy.PathLocationProxy")
    @js.native
    def PathLocationProxy(app: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.Pure")
    @js.native
    def Pure(app: js.Any, method_alias: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.PushLocationProxy")
    @js.native
    def PushLocationProxy(app: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.Session")
    @js.native
    def Session(app: js.Any, options: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.Storage")
    @js.native
    def Storage(app: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.Store")
    @js.native
    def Store: typings.sammy.Sammy.Store = js.native
    @scala.inline
    def Store_=(x: Store): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Store")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Sammy.Template")
    @js.native
    def Template(app: js.Any, method_alias: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.Title")
    @js.native
    def Title(): js.Any = js.native
    
    @JSGlobal("Sammy.Tmpl")
    @js.native
    def Tmpl(app: js.Any, method_alias: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.addLogger")
    @js.native
    def addLogger(logger: js.Any): js.Any = js.native
    
    @JSGlobal("Sammy.log")
    @js.native
    def log(args: js.Any*): js.Any = js.native
  }
}
