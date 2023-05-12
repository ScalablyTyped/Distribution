package typings.resolveExports

import typings.resolveExports.resolveExportsBooleans.`false`
import typings.resolveExports.resolveExportsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var browser: js.UndefOr[Boolean | String] = js.undefined
    
    var fields: js.UndefOr[js.Array[String]] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: Boolean | String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    }
  }
  
  trait Browser extends StObject {
    
    var browser: `true`
    
    var fields: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Browser {
    
    inline def apply(): Browser = {
      val __obj = js.Dynamic.literal(browser = true)
      __obj.asInstanceOf[Browser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Browser] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: `true`): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    }
  }
  
  trait BrowserFields extends StObject {
    
    var browser: `false`
    
    var fields: js.UndefOr[js.Array[String]] = js.undefined
  }
  object BrowserFields {
    
    inline def apply(): BrowserFields = {
      val __obj = js.Dynamic.literal(browser = false)
      __obj.asInstanceOf[BrowserFields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BrowserFields] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: `false`): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    }
  }
  
  trait Fields extends StObject {
    
    var browser: String
    
    var fields: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Fields {
    
    inline def apply(browser: String): Fields = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    }
  }
}
