package typings.reactBulmaComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // https://github.com/couds/react-bulma-components/blob/master/src/components/card/components/content.js
  type CardContentProps = typings.reactBulmaComponents.mod.ElementProps
  // https://github.com/couds/react-bulma-components/blob/master/src/components/card/components/footer/components/footer-item.js
  type CardFooterItemProps = typings.reactBulmaComponents.mod.ElementProps
  // https://github.com/couds/react-bulma-components/blob/master/src/components/card/components/footer/footer.js
  type CardFooterProps = typings.reactBulmaComponents.mod.ElementProps
  // https://github.com/couds/react-bulma-components/blob/master/src/components/card/components/header/components/header-icon.js
  type CardHeaderIconProps = typings.reactBulmaComponents.mod.ElementProps
  // https://github.com/couds/react-bulma-components/blob/master/src/components/card/components/header/index.js
  type CardHeaderProps = typings.reactBulmaComponents.mod.ElementProps
  // https://github.com/couds/react-bulma-components/blob/master/src/components/card/components/header/components/header-title.js
  type CardHeaderTitleProps = typings.reactBulmaComponents.mod.ElementProps
  /*** Menu ***/
  // https://github.com/couds/react-bulma-components/blob/master/src/components/menu/menu.js
  type MenuProps = typings.reactBulmaComponents.mod.ElementProps
  // https://github.com/couds/react-bulma-components/blob/master/src/modifiers/index.js
  type ModifierProps = typings.reactBulmaComponents.mod.ColorProps with typings.reactBulmaComponents.mod.HelperProps with typings.reactBulmaComponents.mod.ResponsiveProps with typings.reactBulmaComponents.mod.TypographyProps
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  // https://github.com/couds/react-bulma-components/blob/master/src/components/panel/components/header.js
  type PanelHeaderProps = typings.reactBulmaComponents.mod.ElementProps
  // https://github.com/couds/react-bulma-components/blob/master/src/components/panel/components/icon.js
  type PanelIconProps = typings.reactBulmaComponents.mod.ElementProps
  /*** Panel ***/
  // https://github.com/couds/react-bulma-components/blob/master/src/components/panel/panel.js
  type PanelProps = typings.reactBulmaComponents.mod.ElementProps
  // https://github.com/couds/react-bulma-components/blob/master/src/components/panel/components/tabs/tabs.js
  type PanelTabsProps = typings.reactBulmaComponents.mod.ElementProps
}
