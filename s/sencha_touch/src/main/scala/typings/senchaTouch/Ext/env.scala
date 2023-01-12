package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object env {
  
  trait IBrowser
    extends StObject
       with IBase {
    
    /** [Property] (String) */
    var engineName: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Property] (Ext.Version) */
    var engineVersion: js.UndefOr[IVersion] = js.undefined
    
    /** [Method] A hybrid property can be either accessed as a method call for example  if Ext browser is IE
      * @param value String The OS name to check.
      * @returns Boolean
      */
    var is: js.UndefOr[js.Function1[/* value */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
    
    /** [Property] (Boolean) */
    var isSecure: js.UndefOr[Boolean] = js.undefined
    
    /** [Property] (Boolean) */
    var isStrict: js.UndefOr[Boolean] = js.undefined
    
    /** [Property] (String) */
    var name: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Property] (String) */
    var userAgent: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Property] (Ext.Version) */
    var version: js.UndefOr[IVersion] = js.undefined
  }
  object IBrowser {
    
    inline def apply(): typings.senchaTouch.Ext.env.IBrowser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.env.IBrowser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.senchaTouch.Ext.env.IBrowser] (val x: Self) extends AnyVal {
      
      inline def setEngineName(value: java.lang.String): Self = StObject.set(x, "engineName", value.asInstanceOf[js.Any])
      
      inline def setEngineNameUndefined: Self = StObject.set(x, "engineName", js.undefined)
      
      inline def setEngineVersion(value: IVersion): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      inline def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      inline def setIs(value: /* value */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
      
      inline def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
      
      inline def setIsSecureUndefined: Self = StObject.set(x, "isSecure", js.undefined)
      
      inline def setIsStrict(value: Boolean): Self = StObject.set(x, "isStrict", value.asInstanceOf[js.Any])
      
      inline def setIsStrictUndefined: Self = StObject.set(x, "isStrict", js.undefined)
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setUserAgent(value: java.lang.String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      inline def setVersion(value: IVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type IFeature = IBase
  
  trait IOS
    extends StObject
       with IBase {
    
    /** [Method] A hybrid property can be either accessed as a method call i e  if Ext os is Android
      * @param value String The OS name to check.
      * @returns Boolean
      */
    var is: js.UndefOr[js.Function1[/* value */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
    
    /** [Property] (String) */
    var name: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Property] (Ext.Version) */
    var version: js.UndefOr[IVersion] = js.undefined
  }
  object IOS {
    
    inline def apply(): IOS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOS]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOS] (val x: Self) extends AnyVal {
      
      inline def setIs(value: /* value */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setVersion(value: IVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
