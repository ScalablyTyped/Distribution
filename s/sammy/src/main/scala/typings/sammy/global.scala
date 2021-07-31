package typings.sammy

import typings.sammy.Sammy.Application
import typings.sammy.Sammy.DataLocationProxy
import typings.sammy.Sammy.FormBuilder
import typings.sammy.Sammy.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Sammy {
    
    @scala.inline
    def apply(): Application = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Application]
    @scala.inline
    def apply(handler: js.Function): Application = ^.asInstanceOf[js.Dynamic].apply(handler.asInstanceOf[js.Any]).asInstanceOf[Application]
    @scala.inline
    def apply(selector: String): Application = ^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any]).asInstanceOf[Application]
    @scala.inline
    def apply(selector: String, handler: js.Function): Application = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Application]
    
    @JSGlobal("Sammy")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def Cache(app: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Cache")(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def DataCacheProxy(initial: js.Any, $element: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("DataCacheProxy")(initial.asInstanceOf[js.Any], $element.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @JSGlobal("Sammy.DataLocationProxy")
    @js.native
    def DataLocationProxy: typings.sammy.Sammy.DataLocationProxy = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Sammy.DataLocationProxy")
    @js.native
    class DataLocationProxyCls protected ()
      extends StObject
         with DataLocationProxy {
      def this(app: js.Any) = this()
      def this(app: js.Any, run_interval_every: js.Any) = this()
      def this(app: js.Any, data_name: js.Any, href_attribute: js.Any) = this()
    }
    
    @scala.inline
    def DataLocationProxy_=(x: DataLocationProxy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataLocationProxy")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def DefaultLocationProxy(app: js.Any, run_interval_every: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("DefaultLocationProxy")(app.asInstanceOf[js.Any], run_interval_every.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def EJS(app: js.Any, method_alias: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("EJS")(app.asInstanceOf[js.Any], method_alias.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def Exceptional(app: js.Any, errorReporter: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Exceptional")(app.asInstanceOf[js.Any], errorReporter.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def Flash(app: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Flash")(app.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def Form(app: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Form")(app.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @JSGlobal("Sammy.FormBuilder")
    @js.native
    def FormBuilder: typings.sammy.Sammy.FormBuilder = js.native
    @scala.inline
    def FormBuilder_=(x: FormBuilder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FormBuilder")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Haml(app: js.Any, method_alias: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Haml")(app.asInstanceOf[js.Any], method_alias.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def Handlebars(app: js.Any, method_alias: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Handlebars")(app.asInstanceOf[js.Any], method_alias.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def Hogan(app: js.Any, method_alias: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Hogan")(app.asInstanceOf[js.Any], method_alias.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def Hoptoad(app: js.Any, errorReporter: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Hoptoad")(app.asInstanceOf[js.Any], errorReporter.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def JSON(app: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("JSON")(app.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def Meld(app: js.Any, method_alias: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Meld")(app.asInstanceOf[js.Any], method_alias.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def MemoryCacheProxy(initial: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("MemoryCacheProxy")(initial.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def Mustache(app: js.Any, method_alias: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Mustache")(app.asInstanceOf[js.Any], method_alias.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def NestedParams(app: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("NestedParams")(app.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def OAuth2(app: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("OAuth2")(app.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @JSGlobal("Sammy.Object")
    @js.native
    class Object protected ()
      extends StObject
         with typings.sammy.Sammy.Object {
      def this(obj: js.Any) = this()
    }
    
    @scala.inline
    def PathLocationProxy(app: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("PathLocationProxy")(app.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def Pure(app: js.Any, method_alias: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Pure")(app.asInstanceOf[js.Any], method_alias.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def PushLocationProxy(app: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("PushLocationProxy")(app.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def Session(app: js.Any, options: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Session")(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def Storage(app: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Storage")(app.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @JSGlobal("Sammy.Store")
    @js.native
    def Store: typings.sammy.Sammy.Store = js.native
    @scala.inline
    def Store_=(x: Store): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Store")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Template(app: js.Any, method_alias: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Template")(app.asInstanceOf[js.Any], method_alias.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def Title(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Title")().asInstanceOf[js.Any]
    
    @scala.inline
    def Tmpl(app: js.Any, method_alias: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Tmpl")(app.asInstanceOf[js.Any], method_alias.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def addLogger(logger: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addLogger")(logger.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def log(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}
