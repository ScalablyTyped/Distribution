package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsAnimationSeparate extends js.Object {
  /**
    * Configure animations for the bottom tabs
    */
  var bottomTabs: js.UndefOr[OptionsAnimationPropertiesId] = js.undefined
  /**
    * Configure animations for the content (Screen)
    */
  var content: js.UndefOr[OptionsAnimationPropertiesId] = js.undefined
  /**
    * Configure animations for the top bar
    */
  var topBar: js.UndefOr[OptionsAnimationPropertiesId] = js.undefined
  /**
    * Wait for the View to render before start animation
    * Example:
    ```js
    animations: {
    push: {
    waitForRender: true
    },
    showModal: {
    waitForRender: true
    },
    setRoot: {
    waitForRender: true
    }
    }
    }
    ```
    */
  var waitForRender: js.UndefOr[scala.Boolean] = js.undefined
}

