package typings
package reactDashVirtualizedLib.distEsAutoSizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AutoSizerProps
  extends /**
     * PLEASE NOTE
     * The [key: string]: any; line is here on purpose
     * This is due to the need of force re-render of PureComponent
     * Check the following link if you want to know more
     * https://github.com/bvaughn/react-virtualized#pass-thru-props
     */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
       * Function responsible for rendering children.
       * This function should implement the following signature:
       * ({ height, width }) => PropTypes.element
       */
  var children: js.Function1[/* props */ Size, reactLib.reactMod.ReactNs.ReactNode]
  /**
       * 	Optional custom CSS class name to attach to root AutoSizer element.
       * This is an advanced property and is not typically necessary.
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Height passed to child for initial render; useful for server-side rendering.
       * This value will be overridden with an accurate height after mounting.
       */
  var defaultHeight: js.UndefOr[scala.Double] = js.undefined
  /**
       * Width passed to child for initial render; useful for server-side rendering.
       * This value will be overridden with an accurate width after mounting.
       */
  var defaultWidth: js.UndefOr[scala.Double] = js.undefined
  /** Disable dynamic :height property */
  var disableHeight: js.UndefOr[scala.Boolean] = js.undefined
  /** Disable dynamic :width property */
  var disableWidth: js.UndefOr[scala.Boolean] = js.undefined
  /** Nonce of the inlined stylesheet for Content Security Policy */
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  /** Callback to be invoked on-resize: ({ height, width }) */
  var onResize: js.UndefOr[js.Function1[/* info */ Size, _]] = js.undefined
  /**
       * Optional custom inline style to attach to root AutoSizer element.
       * This is an advanced property and is not typically necessary.
       */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

