package typings
package reactDashVirtualizedLib.distEsScrollSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScrollSyncProps
  extends /**
     * PLEASE NOTE
     * The [key: string]: any; line is here on purpose
     * This is due to the need of force re-render of PureComponent
     * Check the following link if you want to know more
     * https://github.com/bvaughn/react-virtualized#pass-thru-props
     */
/* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
       * Function responsible for rendering 2 or more virtualized components.
       * This function should implement the following signature:
       * ({ onScroll, scrollLeft, scrollTop }) => PropTypes.element
       */
  var children: js.Function1[/* props */ ScrollSyncChildProps, reactLib.reactMod.ReactNs.ReactNode]
}

