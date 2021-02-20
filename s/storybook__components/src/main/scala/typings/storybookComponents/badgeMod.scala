package typings.storybookComponents

import typings.react.mod.FunctionComponent
import typings.storybookComponents.storybookComponentsStrings.critical
import typings.storybookComponents.storybookComponentsStrings.negative
import typings.storybookComponents.storybookComponentsStrings.neutral
import typings.storybookComponents.storybookComponentsStrings.positive
import typings.storybookComponents.storybookComponentsStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeMod {
  
  @JSImport("@storybook/components/dist/Badge/Badge", "Badge")
  @js.native
  val Badge: FunctionComponent[BadgeProps] = js.native
  
  @js.native
  trait BadgeProps extends StObject {
    
    var status: positive | negative | neutral | warning | critical = js.native
  }
  object BadgeProps {
    
    @scala.inline
    def apply(status: positive | negative | neutral | warning | critical): BadgeProps = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeProps]
    }
    
    @scala.inline
    implicit class BadgePropsMutableBuilder[Self <: BadgeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: positive | negative | neutral | warning | critical): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
