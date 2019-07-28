package typings.reactDashNativeDashHtmlview.reactDashNativeDashHtmlviewMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLViewProps extends js.Object {
  /*
    * The component used for rendering HTML element nodes
    */
  var NodeComponent: js.UndefOr[ComponentType[js.Object]] = js.undefined
  /*
    * The root wrapper component
    */
  var RootComponent: js.UndefOr[ComponentType[js.Object]] = js.undefined
  /*
    * The component used for rendering text element nodes
    */
  var TextComponent: js.UndefOr[ComponentType[js.Object]] = js.undefined
  /**
    *  When explicitly false, effectively sets paragraphBreak and lineBreak to null
    */
  var addLineBreaks: js.UndefOr[Boolean] = js.undefined
  /**
    * Text which is rendered before every li inside a ul
    */
  var bullet: js.UndefOr[String] = js.undefined
  /**
    * Text which appears after text elements which create a new line (br, headings)
    */
  var lineBreak: js.UndefOr[String] = js.undefined
  /*
    * Properties for the NodeComponent, can be used independently from NodeComponent
    */
  var nodeComponentProps: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any
  ] = js.undefined
  var onLinkLongPress: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.undefined
  var onLinkPress: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.undefined
  /**
    * Text which appears after every p element
    */
  var paragraphBreak: js.UndefOr[String] = js.undefined
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
      /* index */ Double, 
      /* siblings */ HTMLViewNode, 
      /* parent */ HTMLViewNode, 
      /* defaultRenderer */ js.Function2[/* node */ HTMLViewNode, /* parent */ HTMLViewNode, ReactNode], 
      ReactNode
    ]
  ] = js.undefined
  /*
    * Properties for the RootComponent, can be used independently from RootComponent
    */
  var rootComponentProps: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties */ js.Any
  ] = js.undefined
  var stylesheet: js.UndefOr[StringDictionary[StyleProp[ViewStyle | TextStyle | ImageStyle]]] = js.undefined
  /*
    * Properties for the TextComponent, can be used independently from TextComponent
    */
  var textComponentProps: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any
  ] = js.undefined
  /**
    * a string of HTML content to render
    */
  var value: String
}

object HTMLViewProps {
  @scala.inline
  def apply(
    value: String,
    NodeComponent: ComponentType[js.Object] = null,
    RootComponent: ComponentType[js.Object] = null,
    TextComponent: ComponentType[js.Object] = null,
    addLineBreaks: js.UndefOr[Boolean] = js.undefined,
    bullet: String = null,
    lineBreak: String = null,
    nodeComponentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any = null,
    onLinkLongPress: /* url */ String => Unit = null,
    onLinkPress: /* url */ String => Unit = null,
    paragraphBreak: String = null,
    renderNode: (/* node */ HTMLViewNode, /* index */ Double, /* siblings */ HTMLViewNode, /* parent */ HTMLViewNode, /* defaultRenderer */ js.Function2[/* node */ HTMLViewNode, /* parent */ HTMLViewNode, ReactNode]) => ReactNode = null,
    rootComponentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties */ js.Any = null,
    stylesheet: StringDictionary[StyleProp[ViewStyle | TextStyle | ImageStyle]] = null,
    textComponentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any = null
  ): HTMLViewProps = {
    val __obj = js.Dynamic.literal(value = value)
    if (NodeComponent != null) __obj.updateDynamic("NodeComponent")(NodeComponent.asInstanceOf[js.Any])
    if (RootComponent != null) __obj.updateDynamic("RootComponent")(RootComponent.asInstanceOf[js.Any])
    if (TextComponent != null) __obj.updateDynamic("TextComponent")(TextComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(addLineBreaks)) __obj.updateDynamic("addLineBreaks")(addLineBreaks)
    if (bullet != null) __obj.updateDynamic("bullet")(bullet)
    if (lineBreak != null) __obj.updateDynamic("lineBreak")(lineBreak)
    if (nodeComponentProps != null) __obj.updateDynamic("nodeComponentProps")(nodeComponentProps)
    if (onLinkLongPress != null) __obj.updateDynamic("onLinkLongPress")(js.Any.fromFunction1(onLinkLongPress))
    if (onLinkPress != null) __obj.updateDynamic("onLinkPress")(js.Any.fromFunction1(onLinkPress))
    if (paragraphBreak != null) __obj.updateDynamic("paragraphBreak")(paragraphBreak)
    if (renderNode != null) __obj.updateDynamic("renderNode")(js.Any.fromFunction5(renderNode))
    if (rootComponentProps != null) __obj.updateDynamic("rootComponentProps")(rootComponentProps)
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet)
    if (textComponentProps != null) __obj.updateDynamic("textComponentProps")(textComponentProps)
    __obj.asInstanceOf[HTMLViewProps]
  }
}

