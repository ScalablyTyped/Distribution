package typings
package reactDashNativeDashHtmlviewLib.reactDashNativeDashHtmlviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HTMLViewProps extends js.Object {
  /*
       * The component used for rendering HTML element nodes
       */
  var NodeComponent: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[js.Object]] = js.undefined
  /*
       * The root wrapper component
       */
  var RootComponent: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[js.Object]] = js.undefined
  /*
       * The component used for rendering text element nodes
       */
  var TextComponent: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[js.Object]] = js.undefined
  /**
       *  When explicitly false, effectively sets paragraphBreak and lineBreak to null
       */
  var addLineBreaks: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Text which is rendered before every li inside a ul
       */
  var bullet: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Text which appears after text elements which create a new line (br, headings)
       */
  var lineBreak: js.UndefOr[java.lang.String] = js.undefined
  /*
       * Properties for the NodeComponent, can be used independently from NodeComponent
       */
  var nodeComponentProps: js.UndefOr[reactDashNativeLib.reactDashNativeMod.TextProperties] = js.undefined
  var onLinkLongPress: js.UndefOr[js.Function1[/* url */ java.lang.String, scala.Unit]] = js.undefined
  var onLinkPress: js.UndefOr[js.Function1[/* url */ java.lang.String, scala.Unit]] = js.undefined
  /**
       * Text which appears after every p element
       */
  var paragraphBreak: js.UndefOr[java.lang.String] = js.undefined
  /**
       *
       * A custom function to render HTML nodes however you see fit. If the function returns undefined (not null), the
       * default renderer will be used for that node. The function takes the following arguments:
       *
       *  - defaultRenderer the default rendering implementation, so you can use the normal rendering logic for some subtree. defaultRenderer takes the following arguments:
       *     - node the node to render with the default rendering logic
       *     - parent the parent of node of node
       *
       * @param node the html node as parsed by htmlparser2
       * @param index position of the node in parent node's children
       * @param siblings parent node's children (including current node)
       * @param parent parent node
       * @param defaultRenderer the default rendering implementation, so you can use the normal rendering logic for some subtree:
       */
  var renderNode: js.UndefOr[
    js.Function5[
      /* node */ HTMLViewNode, 
      /* index */ scala.Double, 
      /* siblings */ HTMLViewNode, 
      /* parent */ HTMLViewNode, 
      /* defaultRenderer */ js.Function2[
        /* node */ HTMLViewNode, 
        /* parent */ HTMLViewNode, 
        reactLib.reactMod.ReactNs.ReactNode
      ], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  /*
       * Properties for the RootComponent, can be used independently from RootComponent
       */
  var rootComponentProps: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewProperties] = js.undefined
  var stylesheet: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[
      reactDashNativeLib.reactDashNativeMod.StyleProp[
        reactDashNativeLib.reactDashNativeMod.ViewStyle | reactDashNativeLib.reactDashNativeMod.TextStyle | reactDashNativeLib.reactDashNativeMod.ImageStyle
      ]
    ]
  ] = js.undefined
  /*
       * Properties for the TextComponent, can be used independently from TextComponent
       */
  var textComponentProps: js.UndefOr[reactDashNativeLib.reactDashNativeMod.TextProperties] = js.undefined
  /**
       * a string of HTML content to render
       */
  var value: java.lang.String
}

