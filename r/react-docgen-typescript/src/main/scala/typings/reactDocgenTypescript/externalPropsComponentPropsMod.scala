package typings.reactDocgenTypescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalPropsComponentPropsMod {
  
  @js.native
  trait ExternalOptionalComponentProps extends StObject {
    
    /** prop1 description */
    var prop1: js.UndefOr[String] = js.native
  }
  object ExternalOptionalComponentProps {
    
    @scala.inline
    def apply(): ExternalOptionalComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExternalOptionalComponentProps]
    }
    
    @scala.inline
    implicit class ExternalOptionalComponentPropsMutableBuilder[Self <: ExternalOptionalComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProp1(value: String): Self = StObject.set(x, "prop1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProp1Undefined: Self = StObject.set(x, "prop1", js.undefined)
    }
  }
  
  @js.native
  trait ExternalPropsComponentProps extends StObject {
    
    /** prop1 description */
    var prop1: String = js.native
  }
  object ExternalPropsComponentProps {
    
    @scala.inline
    def apply(prop1: String): ExternalPropsComponentProps = {
      val __obj = js.Dynamic.literal(prop1 = prop1.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalPropsComponentProps]
    }
    
    @scala.inline
    implicit class ExternalPropsComponentPropsMutableBuilder[Self <: ExternalPropsComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProp1(value: String): Self = StObject.set(x, "prop1", value.asInstanceOf[js.Any])
    }
  }
}
