package typings.resx

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("resx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def js2resx(resources: ObjectOfStrings): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("js2resx")(resources.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def js2resx(resources: ObjectOfStrings, cb: js.Function2[/* error */ js.Error, /* result */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("js2resx")(resources.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def js2resx(resources: ObjectOfStrings, opt: Js2ResxOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("js2resx")(resources.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def js2resx(
    resources: ObjectOfStrings,
    opt: Js2ResxOptions,
    cb: js.Function2[/* error */ js.Error, /* result */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("js2resx")(resources.asInstanceOf[js.Any], opt.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resx2js(str: String): js.Promise[ObjectOfStrings] = ^.asInstanceOf[js.Dynamic].applyDynamic("resx2js")(str.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ObjectOfStrings]]
  inline def resx2js(str: String, cb: js.Function2[/* error */ js.Error, /* result */ ObjectOfStrings, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resx2js")(str.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resx2js(str: String, withComments: Boolean): js.Promise[ObjectOfStrings] = (^.asInstanceOf[js.Dynamic].applyDynamic("resx2js")(str.asInstanceOf[js.Any], withComments.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ObjectOfStrings]]
  inline def resx2js(
    str: String,
    withComments: Boolean,
    cb: js.Function2[/* error */ js.Error, /* result */ ObjectOfStrings, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resx2js")(str.asInstanceOf[js.Any], withComments.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Js2ResxOptions extends StObject {
    
    var indent: js.UndefOr[String] = js.undefined
    
    var newline: js.UndefOr[String] = js.undefined
    
    var pretty: js.UndefOr[Boolean] = js.undefined
  }
  object Js2ResxOptions {
    
    inline def apply(): Js2ResxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Js2ResxOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Js2ResxOptions] (val x: Self) extends AnyVal {
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    }
  }
  
  type ObjectOfStrings = StringDictionary[String]
}
