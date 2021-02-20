package typings.storybookAddonJest

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultMod {
  
  @JSImport("@storybook/addon-jest/dist/components/Result", JSImport.Default)
  @js.native
  def default(props: ResultProps): Element = js.native
  
  @JSImport("@storybook/addon-jest/dist/components/Result", "Result")
  @js.native
  def Result(props: ResultProps): Element = js.native
  
  @js.native
  trait ResultProps extends StObject {
    
    var failureMessages: js.Any = js.native
    
    var fullName: js.UndefOr[String] = js.native
    
    var status: String = js.native
    
    var title: js.UndefOr[String] = js.native
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
