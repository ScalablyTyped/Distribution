package typings
package reactDashFlagDashIconDashCssLib.reactDashFlagDashIconDashCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagIconOptions extends js.Object {
  /**
    * An object literal whose keys are your custom codes.
    */
  var customCodes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Set this if useCssModules is true and a) you want to apply styles to FlagIcon
    * using .theme-base and/or b) you are using custom flags.
    */
  var themeStyles: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      (csstypeLib.csstypeMod.Properties[
        java.lang.String | reactDashFlagDashIconDashCssLib.reactDashFlagDashIconDashCssLibNumbers.`0`
      ]) with (csstypeLib.csstypeMod.PropertiesHyphen[
        java.lang.String | reactDashFlagDashIconDashCssLib.reactDashFlagDashIconDashCssLibNumbers.`0`
      ])
    ]
  ] = js.undefined
  /**
    * Use CSS modules styles (your module bundler must be correctly setup).
    */
  var useCssModules: js.UndefOr[scala.Boolean] = js.undefined
}

