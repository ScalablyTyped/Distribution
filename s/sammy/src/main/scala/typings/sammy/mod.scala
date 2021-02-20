package typings.sammy

import typings.sammy.Sammy.Application
import typings.sammy.Sammy.DataLocationProxy
import typings.sammy.Sammy.FormBuilder
import typings.sammy.Sammy.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sammy", JSImport.Namespace)
  @js.native
  def apply(): Application = js.native
  @JSImport("sammy", JSImport.Namespace)
  @js.native
  def apply(handler: js.Function): Application = js.native
  @JSImport("sammy", JSImport.Namespace)
  @js.native
  def apply(selector: String): Application = js.native
  @JSImport("sammy", JSImport.Namespace)
  @js.native
  def apply(selector: String, handler: js.Function): Application = js.native
  
  @JSImport("sammy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sammy", "Cache")
  @js.native
  def Cache(app: js.Any, options: js.Any): js.Any = js.native
  
  @JSImport("sammy", "DataCacheProxy")
  @js.native
  def DataCacheProxy(initial: js.Any, $element: js.Any): js.Any = js.native
  
  @JSImport("sammy", "DataLocationProxy")
  @js.native
  def DataLocationProxy: typings.sammy.Sammy.DataLocationProxy = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("sammy", "DataLocationProxy")
  @js.native
  class DataLocationProxyCls protected () extends DataLocationProxy {
    def this(app: js.Any) = this()
    def this(app: js.Any, run_interval_every: js.Any) = this()
    def this(app: js.Any, data_name: js.Any, href_attribute: js.Any) = this()
  }
  
  @scala.inline
  def DataLocationProxy_=(x: DataLocationProxy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataLocationProxy")(x.asInstanceOf[js.Any])
  
  @JSImport("sammy", "DefaultLocationProxy")
  @js.native
  def DefaultLocationProxy(app: js.Any, run_interval_every: js.Any): js.Any = js.native
  
  @JSImport("sammy", "EJS")
  @js.native
  def EJS(app: js.Any, method_alias: js.Any): js.Any = js.native
  
  @JSImport("sammy", "Exceptional")
  @js.native
  def Exceptional(app: js.Any, errorReporter: js.Any): js.Any = js.native
  
  @JSImport("sammy", "Flash")
  @js.native
  def Flash(app: js.Any): js.Any = js.native
  
  @JSImport("sammy", "Form")
  @js.native
  def Form(app: js.Any): js.Any = js.native
  
  @JSImport("sammy", "FormBuilder")
  @js.native
  def FormBuilder: typings.sammy.Sammy.FormBuilder = js.native
  @scala.inline
  def FormBuilder_=(x: FormBuilder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FormBuilder")(x.asInstanceOf[js.Any])
  
  @JSImport("sammy", "Haml")
  @js.native
  def Haml(app: js.Any, method_alias: js.Any): js.Any = js.native
  
  @JSImport("sammy", "Handlebars")
  @js.native
  def Handlebars(app: js.Any, method_alias: js.Any): js.Any = js.native
  
  @JSImport("sammy", "Hogan")
  @js.native
  def Hogan(app: js.Any, method_alias: js.Any): js.Any = js.native
  
  @JSImport("sammy", "Hoptoad")
  @js.native
  def Hoptoad(app: js.Any, errorReporter: js.Any): js.Any = js.native
  
  @JSImport("sammy", "JSON")
  @js.native
  def JSON(app: js.Any): js.Any = js.native
  
  @JSImport("sammy", "Meld")
  @js.native
  def Meld(app: js.Any, method_alias: js.Any): js.Any = js.native
  
  @JSImport("sammy", "MemoryCacheProxy")
  @js.native
  def MemoryCacheProxy(initial: js.Any): js.Any = js.native
  
  @JSImport("sammy", "Mustache")
  @js.native
  def Mustache(app: js.Any, method_alias: js.Any): js.Any = js.native
  
  @JSImport("sammy", "NestedParams")
  @js.native
  def NestedParams(app: js.Any): js.Any = js.native
  
  @JSImport("sammy", "OAuth2")
  @js.native
  def OAuth2(app: js.Any): js.Any = js.native
  
  @JSImport("sammy", "Object")
  @js.native
  class Object protected ()
    extends typings.sammy.Sammy.Object {
    def this(obj: js.Any) = this()
  }
  
  @JSImport("sammy", "PathLocationProxy")
  @js.native
  def PathLocationProxy(app: js.Any): js.Any = js.native
  
  @JSImport("sammy", "Pure")
  @js.native
  def Pure(app: js.Any, method_alias: js.Any): js.Any = js.native
  
  @JSImport("sammy", "PushLocationProxy")
  @js.native
  def PushLocationProxy(app: js.Any): js.Any = js.native
  
  @JSImport("sammy", "Session")
  @js.native
  def Session(app: js.Any, options: js.Any): js.Any = js.native
  
  @JSImport("sammy", "Storage")
  @js.native
  def Storage(app: js.Any): js.Any = js.native
  
  @JSImport("sammy", "Store")
  @js.native
  def Store: typings.sammy.Sammy.Store = js.native
  @scala.inline
  def Store_=(x: Store): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Store")(x.asInstanceOf[js.Any])
  
  @JSImport("sammy", "Template")
  @js.native
  def Template(app: js.Any, method_alias: js.Any): js.Any = js.native
  
  @JSImport("sammy", "Title")
  @js.native
  def Title(): js.Any = js.native
  
  @JSImport("sammy", "Tmpl")
  @js.native
  def Tmpl(app: js.Any, method_alias: js.Any): js.Any = js.native
  
  @JSImport("sammy", "addLogger")
  @js.native
  def addLogger(logger: js.Any): js.Any = js.native
  
  @JSImport("sammy", "log")
  @js.native
  def log(args: js.Any*): js.Any = js.native
}
