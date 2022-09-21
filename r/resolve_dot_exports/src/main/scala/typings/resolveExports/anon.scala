package typings.resolveExports

import typings.resolveExports.mod.Options
import typings.resolveExports.resolveExportsBooleans.`false`
import typings.resolveExports.resolveExportsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var browser: `false`
    
    var fields: js.UndefOr[js.Array[String]] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(browser = false)
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setBrowser(value: `false`): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    }
  }
  
  trait `1` extends StObject {
    
    var browser: js.UndefOr[Boolean | String] = js.undefined
    
    var fields: js.UndefOr[js.Array[String]] = js.undefined
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setBrowser(value: Boolean | String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    }
  }
  
  trait Browser
    extends StObject
       with Options {
    
    var browser: js.UndefOr[Boolean] = js.undefined
    
    var conditions: js.UndefOr[js.Array[String]] = js.undefined
    
    var require: js.UndefOr[Boolean] = js.undefined
    
    var unsafe: js.UndefOr[`false`] = js.undefined
  }
  object Browser {
    
    inline def apply(): Browser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Browser]
    }
    
    extension [Self <: Browser](x: Self) {
      
      inline def setBrowser(value: Boolean): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setConditions(value: js.Array[String]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setConditionsVarargs(value: String*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setRequire(value: Boolean): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      inline def setUnsafe(value: `false`): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
      
      inline def setUnsafeUndefined: Self = StObject.set(x, "unsafe", js.undefined)
    }
  }
  
  trait BrowserFields extends StObject {
    
    var browser: String
    
    var fields: js.UndefOr[js.Array[String]] = js.undefined
  }
  object BrowserFields {
    
    inline def apply(browser: String): BrowserFields = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserFields]
    }
    
    extension [Self <: BrowserFields](x: Self) {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    }
  }
  
  trait Conditions
    extends StObject
       with Options {
    
    var conditions: js.UndefOr[js.Array[String]] = js.undefined
    
    var unsafe: js.UndefOr[`true`] = js.undefined
  }
  object Conditions {
    
    inline def apply(): Conditions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Conditions]
    }
    
    extension [Self <: Conditions](x: Self) {
      
      inline def setConditions(value: js.Array[String]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setConditionsVarargs(value: String*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setUnsafe(value: `true`): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
      
      inline def setUnsafeUndefined: Self = StObject.set(x, "unsafe", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    var browser: `true`
    
    var fields: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Fields {
    
    inline def apply(): Fields = {
      val __obj = js.Dynamic.literal(browser = true)
      __obj.asInstanceOf[Fields]
    }
    
    extension [Self <: Fields](x: Self) {
      
      inline def setBrowser(value: `true`): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    }
  }
}
