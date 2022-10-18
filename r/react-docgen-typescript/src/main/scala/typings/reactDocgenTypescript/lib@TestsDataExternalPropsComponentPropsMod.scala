package typings.reactDocgenTypescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `lib@TestsDataExternalPropsComponentPropsMod` {
  
  trait ExternalOptionalComponentProps extends StObject {
    
    /** prop1 description */
    var prop1: js.UndefOr[String] = js.undefined
  }
  object ExternalOptionalComponentProps {
    
    inline def apply(): ExternalOptionalComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExternalOptionalComponentProps]
    }
    
    extension [Self <: ExternalOptionalComponentProps](x: Self) {
      
      inline def setProp1(value: String): Self = StObject.set(x, "prop1", value.asInstanceOf[js.Any])
      
      inline def setProp1Undefined: Self = StObject.set(x, "prop1", js.undefined)
    }
  }
  
  trait ExternalPropsComponentProps extends StObject {
    
    /** prop1 description */
    var prop1: String
  }
  object ExternalPropsComponentProps {
    
    inline def apply(prop1: String): ExternalPropsComponentProps = {
      val __obj = js.Dynamic.literal(prop1 = prop1.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalPropsComponentProps]
    }
    
    extension [Self <: ExternalPropsComponentProps](x: Self) {
      
      inline def setProp1(value: String): Self = StObject.set(x, "prop1", value.asInstanceOf[js.Any])
    }
  }
}
