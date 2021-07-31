package typings.storybookAddonJest

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultMod {
  
  @JSImport("@storybook/addon-jest/dist/components/Result", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: ResultProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def Result(props: ResultProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Result")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ResultProps extends StObject {
    
    var failureMessages: js.Any
    
    var fullName: js.UndefOr[String] = js.undefined
    
    var status: String
    
    var title: js.UndefOr[String] = js.undefined
  }
  object ResultProps {
    
    @scala.inline
    def apply(failureMessages: js.Any, status: String): ResultProps = {
      val __obj = js.Dynamic.literal(failureMessages = failureMessages.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultProps]
    }
    
    @scala.inline
    implicit class ResultPropsMutableBuilder[Self <: ResultProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailureMessages(value: js.Any): Self = StObject.set(x, "failureMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
