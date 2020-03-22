package typings.storybookUi.sidebarHeadingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentProps</ * Inlined react.react.ForwardRefExoticComponent<@storybook/components.@storybook/components/dist/Button/Button.ButtonProps & react.react.RefAttributes<any>> & {  defaultProps  :{  isLink  :boolean}} * /
{  defaultProps ? :@storybook/components.PartialButtonPropsRefAttr,   propTypes ? :@storybook/components.WeakValidationMapButtonPr,   displayName ? :string,  readonly $$typeof  :symbol, None (props : @storybook/components.@storybook/components/dist/Button/Button.ButtonProps & react.react.RefAttributes<any>): react.react.ReactElement | null,   defaultProps  :@storybook/components.AnonIsLink}> & react.react.ComponentProps<'button'> & {  highlighted  :boolean} */
trait MenuButtonProps extends js.Object {
  var highlighted: Boolean
}

object MenuButtonProps {
  @scala.inline
  def apply(highlighted: Boolean): MenuButtonProps = {
    val __obj = js.Dynamic.literal(highlighted = highlighted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MenuButtonProps]
  }
}

