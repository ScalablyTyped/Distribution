package typings.rtsaoCsstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardLonghandPropertiesFallback[TLength] extends StObject {
  
  /**
    * The CSS **`align-content`** property sets how the browser distributes space between and around content items along the cross-axis of a flexbox container, and the main-axis of a grid container.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :------: | :-----: | :-------: | :----: | :----: |
    * |  **29**  | **28**  |   **9**   | **12** | **11** |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/align-content
    */
  var alignContent: js.UndefOr[AlignContentProperty | js.Array[AlignContentProperty]] = js.undefined
  
  /**
    * The CSS **`align-items`** property sets the `align-self` value on all direct children as a group. The align-self property sets the alignment of an item within its containing block. In Flexbox it controls the alignment of items on the Cross Axis, in Grid Layout it controls the alignment of items on the Block Axis within their grid area.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox |   Safari    |  Edge  |   IE   |
    * | :------: | :-----: | :---------: | :----: | :----: |
    * |  **52**  | **20**  | **7** _-x-_ | **12** | **11** |
    * | 21 _-x-_ |         |             |        |        |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | n/a |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/align-items
    */
  var alignItems: js.UndefOr[AlignItemsProperty | js.Array[AlignItemsProperty]] = js.undefined
  
  /**
    * The **`align-self`** CSS property aligns flex items of the current flex line overriding the `align-items` value. If any of the item's cross-axis margin is set to `auto`, then `align-self` is ignored. In Grid layout `align-self` aligns the item inside the grid area.
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox | Safari |  Edge  |   IE   |
    * | :------: | :-----: | :----: | :----: | :----: |
    * |  **36**  | **20**  |   No   | **12** | **11** |
    * | 21 _-x-_ |         |        |        |        |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  |      IE      |
    * | :----: | :-----: | :------: | :----: | :----------: |
    * | **57** | **52**  | **10.1** | **16** | **10** _-x-_ |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/align-self
    */
  var alignSelf: js.UndefOr[AlignSelfProperty | js.Array[AlignSelfProperty]] = js.undefined
  
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Initial value**: `0s`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE   |
    * | :----: | :-----: | :-----: | :----: | :----: |
    * | **43** | **16**  |  **9**  | **12** | **10** |
    * |        | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-delay
    */
  var animationDelay: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.undefined
  
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **43** | **16**  | **4** _-x-_ | **12** | **10** |
    * |        | 5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-direction
    */
  var animationDirection: js.UndefOr[AnimationDirectionProperty | js.Array[AnimationDirectionProperty]] = js.undefined
  
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Initial value**: `0s`
    *
    * | Chrome  | Firefox |   Safari    |  Edge  |   IE   |
    * | :-----: | :-----: | :---------: | :----: | :----: |
    * | **43**  | **16**  | **4** _-x-_ | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-duration
    */
  var animationDuration: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.undefined
  
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **43** | **16**  | **4** _-x-_ | **12** | **10** |
    * |        | 5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-fill-mode
    */
  var animationFillMode: js.UndefOr[AnimationFillModeProperty | js.Array[AnimationFillModeProperty]] = js.undefined
  
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Initial value**: `1`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **43** | **16**  | **4** _-x-_ | **12** | **10** |
    * |        | 5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-iteration-count
    */
  var animationIterationCount: js.UndefOr[AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]] = js.undefined
  
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **43** | **16**  | **4** _-x-_ | **12** | **10** |
    * |        | 5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-name
    */
  var animationName: js.UndefOr[AnimationNameProperty | js.Array[AnimationNameProperty]] = js.undefined
  
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Initial value**: `running`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **43** | **16**  |  Yes   | **12** | **10** |
    * |        | 5 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-play-state
    */
  var animationPlayState: js.UndefOr[AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]] = js.undefined
  
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Initial value**: `ease`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **43** | **16**  | **4** _-x-_ | **12** | **10** |
    * |        | 5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-timing-function
    */
  var animationTimingFunction: js.UndefOr[AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]] = js.undefined
  
  /**
    * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform-native styling based on the operating system's theme.
    *
    * **Initial value**: `auto`
    *
    * |   Chrome    |   Firefox   |   Safari    |     Edge     | IE  |
    * | :---------: | :---------: | :---------: | :----------: | :-: |
    * | **1** _-x-_ | **1** _-x-_ | **3** _-x-_ | **12** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/appearance
    */
  var appearance: js.UndefOr[AppearanceProperty | js.Array[AppearanceProperty]] = js.undefined
  
  /**
    * The **`backdrop-filter`** CSS property lets you apply graphical effects such as blurring or color shifting to the area behind an element. Because it applies to everything _behind_ the element, to see the effect you must make the element or its background at least partially transparent.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |   Safari    |  Edge  | IE  |
    * | :----: | :-----: | :---------: | :----: | :-: |
    * |  n/a   |   No    | **9** _-x-_ | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/backdrop-filter
    */
  var backdropFilter: js.UndefOr[BackdropFilterProperty | js.Array[BackdropFilterProperty]] = js.undefined
  
  /**
    * The **`backface-visibility`** CSS property sets whether the back face of an element is visible when turned towards the user.
    *
    * **Initial value**: `visible`
    *
    * |    Chrome    | Firefox  | Safari |  Edge  |   IE   |
    * | :----------: | :------: | :----: | :----: | :----: |
    * | **12** _-x-_ |  **16**  |  Yes   | **12** | **10** |
    * |              | 10 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/backface-visibility
    */
  var backfaceVisibility: js.UndefOr[BackfaceVisibilityProperty | js.Array[BackfaceVisibilityProperty]] = js.undefined
  
  /**
    * The **`background-attachment`** CSS property sets whether a background image's position is fixed within the viewport, or scrolls with its containing block.
    *
    * **Initial value**: `scroll`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-attachment
    */
  var backgroundAttachment: js.UndefOr[BackgroundAttachmentProperty | js.Array[BackgroundAttachmentProperty]] = js.undefined
  
  /**
    * The **`background-blend-mode`** CSS property sets how an element's background images should blend with each other and with the element's background color.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **35** | **30**  |  Yes   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-blend-mode
    */
  var backgroundBlendMode: js.UndefOr[BackgroundBlendModeProperty | js.Array[BackgroundBlendModeProperty]] = js.undefined
  
  /**
    * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
    *
    * **Initial value**: `border-box`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **4**  | **3**  | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-clip
    */
  var backgroundClip: js.UndefOr[BackgroundClipProperty | js.Array[BackgroundClipProperty]] = js.undefined
  
  /**
    * The **`background-color`** CSS property sets the background color of an element.
    *
    * **Initial value**: `transparent`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-color
    */
  var backgroundColor: js.UndefOr[BackgroundColorProperty | js.Array[BackgroundColorProperty]] = js.undefined
  
  /**
    * The **`background-image`** CSS property sets one or more background images on an element.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-image
    */
  var backgroundImage: js.UndefOr[BackgroundImageProperty | js.Array[BackgroundImageProperty]] = js.undefined
  
  /**
    * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
    *
    * **Initial value**: `padding-box`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **4**  | **3**  | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-origin
    */
  var backgroundOrigin: js.UndefOr[BackgroundOriginProperty | js.Array[BackgroundOriginProperty]] = js.undefined
  
  /**
    * The **`background-position`** CSS property sets the initial position for each background image. The position is relative to the position layer set by `background-origin`.
    *
    * **Initial value**: `0% 0%`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position
    */
  var backgroundPosition: js.UndefOr[
    BackgroundPositionProperty[TLength] | js.Array[BackgroundPositionProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`background-position-x`** CSS property sets the initial horizontal position for each background image. The position is relative to the position layer set by `background-origin`.
    *
    * **Initial value**: `left`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * |  Yes   | **49**  |  Yes   | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position-x
    */
  var backgroundPositionX: js.UndefOr[
    BackgroundPositionXProperty[TLength] | js.Array[BackgroundPositionXProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`background-position-y`** CSS property sets the initial vertical position, relative to the background position layer defined by `background-origin`, for each defined background image.
    *
    * **Initial value**: `top`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * |  Yes   | **49**  |  Yes   | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position-y
    */
  var backgroundPositionY: js.UndefOr[
    BackgroundPositionYProperty[TLength] | js.Array[BackgroundPositionYProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`background-repeat`** CSS property sets how background images are repeated. A background image can be repeated along the horizontal and vertical axes, or not repeated at all.
    *
    * **Initial value**: `repeat`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-repeat
    */
  var backgroundRepeat: js.UndefOr[BackgroundRepeatProperty | js.Array[BackgroundRepeatProperty]] = js.undefined
  
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Initial value**: `auto auto`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **3**  |  **4**  | **4.1** | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-size
    */
  var backgroundSize: js.UndefOr[BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]] = js.undefined
  
  /** **Initial value**: `clip` */
  var blockOverflow: js.UndefOr[BlockOverflowProperty | js.Array[BlockOverflowProperty]] = js.undefined
  
  /**
    * The **`block-size`** CSS property defines the horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `width` or the `height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **57** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/block-size
    */
  var blockSize: js.UndefOr[BlockSizeProperty[TLength] | js.Array[BlockSizeProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-block-color`** CSS property defines the color of the logical block borders of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color` and `border-bottom-color`, or `border-right-color` and `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-color
    */
  var borderBlockColor: js.UndefOr[BorderBlockColorProperty | js.Array[BorderBlockColorProperty]] = js.undefined
  
  /**
    * The **`border-block-end-color`** CSS property defines the color of the logical block-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-color
    */
  var borderBlockEndColor: js.UndefOr[BorderBlockEndColorProperty | js.Array[BorderBlockEndColorProperty]] = js.undefined
  
  /**
    * The **`border-block-end-style`** CSS property defines the style of the logical block end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-style
    */
  var borderBlockEndStyle: js.UndefOr[BorderBlockEndStyleProperty | js.Array[BorderBlockEndStyleProperty]] = js.undefined
  
  /**
    * The **`border-block-end-width`** CSS property defines the width of the logical block-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-width
    */
  var borderBlockEndWidth: js.UndefOr[
    BorderBlockEndWidthProperty[TLength] | js.Array[BorderBlockEndWidthProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`border-block-start-color`** CSS property defines the color of the logical block-start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-color
    */
  var borderBlockStartColor: js.UndefOr[BorderBlockStartColorProperty | js.Array[BorderBlockStartColorProperty]] = js.undefined
  
  /**
    * The **`border-block-start-style`** CSS property defines the style of the logical block start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-style
    */
  var borderBlockStartStyle: js.UndefOr[BorderBlockStartStyleProperty | js.Array[BorderBlockStartStyleProperty]] = js.undefined
  
  /**
    * The **`border-block-start-width`** CSS property defines the width of the logical block-start border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-width
    */
  var borderBlockStartWidth: js.UndefOr[
    BorderBlockStartWidthProperty[TLength] | js.Array[BorderBlockStartWidthProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`border-block-style`** CSS property defines the style of the logical block borders of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style` and `border-bottom-style`, or `border-left-style` and `border-right-style` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-style
    */
  var borderBlockStyle: js.UndefOr[BorderBlockStyleProperty | js.Array[BorderBlockStyleProperty]] = js.undefined
  
  /**
    * The **`border-block-width`** CSS property defines the width of the logical block borders of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width` and `border-bottom-width`, or `border-left-width`, and `border-right-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-width
    */
  var borderBlockWidth: js.UndefOr[BorderBlockWidthProperty[TLength] | js.Array[BorderBlockWidthProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-bottom-color`** CSS property sets the color of an element's bottom border. It can also be set with the shorthand CSS properties `border-color` or `border-bottom`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-color
    */
  var borderBottomColor: js.UndefOr[BorderBottomColorProperty | js.Array[BorderBottomColorProperty]] = js.undefined
  
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-left-radius
    */
  var borderBottomLeftRadius: js.UndefOr[
    BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-right-radius
    */
  var borderBottomRightRadius: js.UndefOr[
    BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`border-bottom-style`** CSS property sets the line style of an element's bottom `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-style
    */
  var borderBottomStyle: js.UndefOr[BorderBottomStyleProperty | js.Array[BorderBottomStyleProperty]] = js.undefined
  
  /**
    * The **`border-bottom-width`** CSS property sets the width of the bottom border of a box.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-width
    */
  var borderBottomWidth: js.UndefOr[
    BorderBottomWidthProperty[TLength] | js.Array[BorderBottomWidthProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`border-collapse`** CSS property sets whether cells inside a `<table>` have shared or separate borders.
    *
    * **Initial value**: `separate`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-collapse
    */
  var borderCollapse: js.UndefOr[BorderCollapseProperty | js.Array[BorderCollapseProperty]] = js.undefined
  
  /**
    * The **`border-end-end-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius that depends on on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-end-end-radius
    */
  var borderEndEndRadius: js.UndefOr[
    BorderEndEndRadiusProperty[TLength] | js.Array[BorderEndEndRadiusProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`border-end-start-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius depending on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-end-start-radius
    */
  var borderEndStartRadius: js.UndefOr[
    BorderEndStartRadiusProperty[TLength] | js.Array[BorderEndStartRadiusProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`border-image-outset`** CSS property sets the distance by which an element's border image is set out from its border box.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-outset
    */
  var borderImageOutset: js.UndefOr[
    BorderImageOutsetProperty[TLength] | js.Array[BorderImageOutsetProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`border-image-repeat`** CSS property defines how the edge regions of a source image are adjusted to fit the dimensions of an element's border image.
    *
    * **Initial value**: `stretch`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-repeat
    */
  var borderImageRepeat: js.UndefOr[BorderImageRepeatProperty | js.Array[BorderImageRepeatProperty]] = js.undefined
  
  /**
    * The **`border-image-slice`** CSS property divides the image specified by `border-image-source` into regions. These regions form the components of an element's border image.
    *
    * **Initial value**: `100%`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-slice
    */
  var borderImageSlice: js.UndefOr[BorderImageSliceProperty | js.Array[BorderImageSliceProperty]] = js.undefined
  
  /**
    * The **`border-image-source`** CSS property sets the source image used to create an element's border image.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-source
    */
  var borderImageSource: js.UndefOr[BorderImageSourceProperty | js.Array[BorderImageSourceProperty]] = js.undefined
  
  /**
    * The **`border-image-width`** CSS property sets the width of an element's border image.
    *
    * **Initial value**: `1`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **13**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-width
    */
  var borderImageWidth: js.UndefOr[BorderImageWidthProperty[TLength] | js.Array[BorderImageWidthProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-inline-color`** CSS property defines the color of the logical inline borders of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color` and `border-bottom-color`, or `border-right-color` and `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-color
    */
  var borderInlineColor: js.UndefOr[BorderInlineColorProperty | js.Array[BorderInlineColorProperty]] = js.undefined
  
  /**
    * The **`border-inline-end-color`** CSS property defines the color of the logical inline-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-color
    */
  var borderInlineEndColor: js.UndefOr[BorderInlineEndColorProperty | js.Array[BorderInlineEndColorProperty]] = js.undefined
  
  /**
    * The **`border-inline-end-style`** CSS property defines the style of the logical inline end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome |           Firefox            | Safari | Edge | IE  |
    * | :----: | :--------------------------: | :----: | :--: | :-: |
    * | **69** |            **41**            |   No   |  No  | No  |
    * |        | 38 _(-moz-border-end-style)_ |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-style
    */
  var borderInlineEndStyle: js.UndefOr[BorderInlineEndStyleProperty | js.Array[BorderInlineEndStyleProperty]] = js.undefined
  
  /**
    * The **`border-inline-end-width`** CSS property defines the width of the logical inline-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-width
    */
  var borderInlineEndWidth: js.UndefOr[
    BorderInlineEndWidthProperty[TLength] | js.Array[BorderInlineEndWidthProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`border-inline-start-color`** CSS property defines the color of the logical inline start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome |            Firefox             | Safari | Edge | IE  |
    * | :----: | :----------------------------: | :----: | :--: | :-: |
    * | **69** |             **41**             |   No   |  No  | No  |
    * |        | 38 _(-moz-border-start-color)_ |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-color
    */
  var borderInlineStartColor: js.UndefOr[BorderInlineStartColorProperty | js.Array[BorderInlineStartColorProperty]] = js.undefined
  
  /**
    * The **`border-inline-start-style`** CSS property defines the style of the logical inline start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-style
    */
  var borderInlineStartStyle: js.UndefOr[BorderInlineStartStyleProperty | js.Array[BorderInlineStartStyleProperty]] = js.undefined
  
  /**
    * The **`border-inline-start-width`** CSS property defines the width of the logical inline-start border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-width
    */
  var borderInlineStartWidth: js.UndefOr[
    BorderInlineStartWidthProperty[TLength] | js.Array[BorderInlineStartWidthProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`border-inline-style`** CSS property defines the style of the logical inline borders of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style` and `border-bottom-style`, or `border-left-style` and `border-right-style` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-style
    */
  var borderInlineStyle: js.UndefOr[BorderInlineStyleProperty | js.Array[BorderInlineStyleProperty]] = js.undefined
  
  /**
    * The **`border-inline-width`** CSS property defines the width of the logical inline borders of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width` and `border-bottom-width`, or `border-left-width`, and `border-right-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-width
    */
  var borderInlineWidth: js.UndefOr[
    BorderInlineWidthProperty[TLength] | js.Array[BorderInlineWidthProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`border-left-color`** CSS property sets the color of an element's left border. It can also be set with the shorthand CSS properties `border-color` or `border-left`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-color
    */
  var borderLeftColor: js.UndefOr[BorderLeftColorProperty | js.Array[BorderLeftColorProperty]] = js.undefined
  
  /**
    * The **`border-left-style`** CSS property sets the line style of an element's left `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-style
    */
  var borderLeftStyle: js.UndefOr[BorderLeftStyleProperty | js.Array[BorderLeftStyleProperty]] = js.undefined
  
  /**
    * The **`border-left-width`** CSS property sets the width of the left border of an element.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-width
    */
  var borderLeftWidth: js.UndefOr[BorderLeftWidthProperty[TLength] | js.Array[BorderLeftWidthProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-right-color`** CSS property sets the color of an element's right border. It can also be set with the shorthand CSS properties `border-color` or `border-right`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-color
    */
  var borderRightColor: js.UndefOr[BorderRightColorProperty | js.Array[BorderRightColorProperty]] = js.undefined
  
  /**
    * The **`border-right-style`** CSS property sets the line style of an element's right `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-style
    */
  var borderRightStyle: js.UndefOr[BorderRightStyleProperty | js.Array[BorderRightStyleProperty]] = js.undefined
  
  /**
    * The **`border-right-width`** CSS property sets the width of the right border of an element.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-width
    */
  var borderRightWidth: js.UndefOr[BorderRightWidthProperty[TLength] | js.Array[BorderRightWidthProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-spacing`** CSS property sets the distance between the borders of adjacent `<table>` cells. This property applies only when `border-collapse` is `separate`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-spacing
    */
  var borderSpacing: js.UndefOr[BorderSpacingProperty[TLength] | js.Array[BorderSpacingProperty[TLength]]] = js.undefined
  
  /**
    * The **`border-start-end-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius depending on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-start-end-radius
    */
  var borderStartEndRadius: js.UndefOr[
    BorderStartEndRadiusProperty[TLength] | js.Array[BorderStartEndRadiusProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`border-start-start-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius that depends on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-start-start-radius
    */
  var borderStartStartRadius: js.UndefOr[
    BorderStartStartRadiusProperty[TLength] | js.Array[BorderStartStartRadiusProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`border-top-color`** CSS property sets the color of an element's top border. It can also be set with the shorthand CSS properties `border-color` or `border-top`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-color
    */
  var borderTopColor: js.UndefOr[BorderTopColorProperty | js.Array[BorderTopColorProperty]] = js.undefined
  
  /**
    * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-left-radius
    */
  var borderTopLeftRadius: js.UndefOr[
    BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-right-radius
    */
  var borderTopRightRadius: js.UndefOr[
    BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`border-top-style`** CSS property sets the line style of an element's top `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-style
    */
  var borderTopStyle: js.UndefOr[BorderTopStyleProperty | js.Array[BorderTopStyleProperty]] = js.undefined
  
  /**
    * The **`border-top-width`** CSS property sets the width of the top border of an element.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-width
    */
  var borderTopWidth: js.UndefOr[BorderTopWidthProperty[TLength] | js.Array[BorderTopWidthProperty[TLength]]] = js.undefined
  
  /**
    * The **`bottom`** CSS property participates in specifying the vertical position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/bottom
    */
  var bottom: js.UndefOr[BottomProperty[TLength] | js.Array[BottomProperty[TLength]]] = js.undefined
  
  /**
    * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
    *
    * **Initial value**: `slice`
    *
    * |    Chrome    | Firefox | Safari  | Edge | IE  |
    * | :----------: | :-----: | :-----: | :--: | :-: |
    * | **22** _-x-_ | **32**  | **6.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/box-decoration-break
    */
  var boxDecorationBreak: js.UndefOr[BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]] = js.undefined
  
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
    *
    * **Initial value**: `none`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * | **10**  |  **4**  | **5.1** | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/box-shadow
    */
  var boxShadow: js.UndefOr[BoxShadowProperty | js.Array[BoxShadowProperty]] = js.undefined
  
  /**
    * The **`box-sizing`** CSS property defines how the user agent should calculate the total width and height of an element.
    *
    * **Initial value**: `content-box`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * | **10**  | **29**  | **5.1** | **12** | **8** |
    * | 1 _-x-_ | 1 _-x-_ |         |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/box-sizing
    */
  var boxSizing: js.UndefOr[BoxSizingProperty | js.Array[BoxSizingProperty]] = js.undefined
  
  /**
    * The **`break-after`** CSS property defines how page, column, or region breaks should behave after a generated box. If there is no generated box, the property is ignored.
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** |   No    |   No   | **12** | **10** |
    *
    * ---
    *
    * _Supported in Paged Media_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  | **10** | **12** | **10** |
    *
    * ---
    *
    * _Supported in CSS Regions_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    |   No   |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/break-after
    */
  var breakAfter: js.UndefOr[BreakAfterProperty | js.Array[BreakAfterProperty]] = js.undefined
  
  /**
    * The **`break-before`** CSS property sets how page, column, or region breaks should behave before a generated box. If there is no generated box, the property is ignored.
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  |   No   | **12** | **10** |
    *
    * ---
    *
    * _Supported in Paged Media_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  | **10** | **12** | **10** |
    *
    * ---
    *
    * _Supported in CSS Regions_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    |   No   |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/break-before
    */
  var breakBefore: js.UndefOr[BreakBeforeProperty | js.Array[BreakBeforeProperty]] = js.undefined
  
  /**
    * The **`break-inside`** CSS property defines how page, column, or region breaks should behave inside a generated box. If there is no generated box, the property is ignored.
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  | **10** | **12** | **10** |
    *
    * ---
    *
    * _Supported in Paged Media_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  | **10** | **12** | **10** |
    *
    * ---
    *
    * _Supported in CSS Regions_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    |   No   |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/break-inside
    */
  var breakInside: js.UndefOr[BreakInsideProperty | js.Array[BreakInsideProperty]] = js.undefined
  
  /**
    * The **`caption-side`** CSS property puts the content of a table's `<caption>` on the specified side. The values are relative to the `writing-mode` of the table.
    *
    * **Initial value**: `top`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/caption-side
    */
  var captionSide: js.UndefOr[CaptionSideProperty | js.Array[CaptionSideProperty]] = js.undefined
  
  /**
    * The **`caret-color`** CSS property sets the color of the insertion caret, the visible marker where the next character typed will be inserted. The caret appears in elements such as `<input>` or those with the `contenteditable` attribute. The caret is typically a thin vertical line that flashes to help make it more noticeable. By default, it is black, but its color can be altered with this property.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **53**  | **11.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/caret-color
    */
  var caretColor: js.UndefOr[CaretColorProperty | js.Array[CaretColorProperty]] = js.undefined
  
  /**
    * The **`clear`** CSS property sets whether an element must be moved below (cleared) floating elements that precede it. The `clear` property applies to floating and non-floating elements.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/clear
    */
  var clear: js.UndefOr[ClearProperty | js.Array[ClearProperty]] = js.undefined
  
  /**
    * The `**clip-path**` CSS property creates a clipping region that sets what part of an element should be shown. Parts that are inside the region are shown, while those outside are hidden.
    *
    * **Initial value**: `none`
    *
    * |  Chrome  | Firefox | Safari |  Edge  | IE  |
    * | :------: | :-----: | :----: | :----: | :-: |
    * |  **55**  | **3.5** |   No   | **15** | Yes |
    * | 24 _-x-_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/clip-path
    */
  var clipPath: js.UndefOr[ClipPathProperty | js.Array[ClipPathProperty]] = js.undefined
  
  /**
    * The **`color`** CSS property sets the foreground color value of an element's text and text decorations, and sets the `currentcolor` value. `currentcolor` may be used as an indirect value on _other_ properties and is the default for other color properties, such as `border-color`.
    *
    * **Initial value**: Varies from one browser to another
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **1**  |  **1**  |  Yes   | **12** | Yes |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/color
    */
  var color: js.UndefOr[ColorProperty | js.Array[ColorProperty]] = js.undefined
  
  /**
    * The **`color-adjust`** CSS property sets what, if anything, the user agent may do to optimize the appearance of the element on the output device. By default, the browser is allowed to make any adjustments to the element's appearance it determines to be necessary and prudent given the type and capabilities of the output device.
    *
    * **Initial value**: `economy`
    *
    * |    Chrome    | Firefox |   Safari    | Edge | IE  |
    * | :----------: | :-----: | :---------: | :--: | :-: |
    * | **49** _-x-_ | **48**  | **6** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/color-adjust
    */
  var colorAdjust: js.UndefOr[ColorAdjustProperty | js.Array[ColorAdjustProperty]] = js.undefined
  
  /**
    * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
    *
    * **Initial value**: `auto`
    *
    * | Chrome |  Firefox  |   Safari    |  Edge  |   IE   |
    * | :----: | :-------: | :---------: | :----: | :----: |
    * | **50** |  **52**   | **3** _-x-_ | **12** | **10** |
    * |        | 1.5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-count
    */
  var columnCount: js.UndefOr[ColumnCountProperty | js.Array[ColumnCountProperty]] = js.undefined
  
  /**
    * The **`column-fill`** CSS property controls how an element's contents are balanced when broken into columns.
    *
    * **Initial value**: `balance`
    *
    * | Chrome | Firefox  | Safari |  Edge  | IE  |
    * | :----: | :------: | :----: | :----: | :-: |
    * | **50** |  **52**  |  n/a   | **12** | n/a |
    * |        | 13 _-x-_ |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-fill
    */
  var columnFill: js.UndefOr[ColumnFillProperty | js.Array[ColumnFillProperty]] = js.undefined
  
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   | n/a  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * |     Chrome      |     Firefox     |        Safari         |  Edge  | IE  |
    * | :-------------: | :-------------: | :-------------------: | :----: | :-: |
    * |     **66**      |     **61**      | **10.1** _(grid-gap)_ | **16** | No  |
    * | 57 _(grid-gap)_ | 52 _(grid-gap)_ |                       |        |     |
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome |  Firefox  | Safari  |  Edge  |   IE   |
    * | :----: | :-------: | :-----: | :----: | :----: |
    * | **50** |  **52**   | **10**  | **12** | **10** |
    * |        | 1.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-gap
    */
  var columnGap: js.UndefOr[ColumnGapProperty[TLength] | js.Array[ColumnGapProperty[TLength]]] = js.undefined
  
  /**
    * The **`column-rule-color`** CSS property sets the color of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome |  Firefox  |   Safari    |  Edge  |   IE   |
    * | :----: | :-------: | :---------: | :----: | :----: |
    * | **50** |  **52**   | **3** _-x-_ | **12** | **10** |
    * |        | 3.5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-color
    */
  var columnRuleColor: js.UndefOr[ColumnRuleColorProperty | js.Array[ColumnRuleColorProperty]] = js.undefined
  
  /**
    * The **`column-rule-style`** CSS property sets the style of the line drawn between columns in a multi-column layout.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **50** | **52**  | **3** _-x-_ | **12** | **10** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-style
    */
  var columnRuleStyle: js.UndefOr[ColumnRuleStyleProperty | js.Array[ColumnRuleStyleProperty]] = js.undefined
  
  /**
    * The **`column-rule-width`** CSS property sets the width of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Initial value**: `medium`
    *
    * | Chrome |  Firefox  |   Safari    |  Edge  |   IE   |
    * | :----: | :-------: | :---------: | :----: | :----: |
    * | **50** |  **50**   | **3** _-x-_ | **12** | **10** |
    * |        | 3.5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-width
    */
  var columnRuleWidth: js.UndefOr[ColumnRuleWidthProperty[TLength] | js.Array[ColumnRuleWidthProperty[TLength]]] = js.undefined
  
  /**
    * The **`column-span`** CSS property makes it possible for an element to span across all columns when its value is set to `all`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** |   n/a   |  Yes   | **12** | **10** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-span
    */
  var columnSpan: js.UndefOr[ColumnSpanProperty | js.Array[ColumnSpanProperty]] = js.undefined
  
  /**
    * The **`column-width`** CSS property specifies the ideal column width in a multi-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value. If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
    *
    * **Initial value**: `auto`
    *
    * | Chrome |  Firefox  |   Safari    |  Edge  |   IE   |
    * | :----: | :-------: | :---------: | :----: | :----: |
    * | **50** |  **50**   | **3** _-x-_ | **12** | **10** |
    * |        | 1.5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-width
    */
  var columnWidth: js.UndefOr[ColumnWidthProperty[TLength] | js.Array[ColumnWidthProperty[TLength]]] = js.undefined
  
  /**
    * The **`contain`** CSS property allows an author to indicate that an element and its contents are, as much as possible, _independent_ of the rest of the document tree. This allows the browser to recalculate layout, style, paint, size, or any combination of them for a limited area of the DOM and not the entire page.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **52** |   n/a   |   No   |  No  | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/contain
    */
  var contain: js.UndefOr[ContainProperty | js.Array[ContainProperty]] = js.undefined
  
  /**
    * The **`content`** CSS property replaces an element with a generated value. Objects inserted using the `content` property are _anonymous replaced elements._
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/content
    */
  var content: js.UndefOr[ContentProperty | js.Array[ContentProperty]] = js.undefined
  
  /**
    * The **`counter-increment`** CSS property increases or decreases the value of a CSS counter by a given value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **2**  |  **1**  | **3.1** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/counter-increment
    */
  var counterIncrement: js.UndefOr[CounterIncrementProperty | js.Array[CounterIncrementProperty]] = js.undefined
  
  /**
    * The **`counter-reset`** CSS property resets a CSS counter to a given value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **2**  |  **1**  | **3.1** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/counter-reset
    */
  var counterReset: js.UndefOr[CounterResetProperty | js.Array[CounterResetProperty]] = js.undefined
  
  /**
    * The **`cursor`** CSS property sets mouse cursor to display when the mouse pointer is over an element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/cursor
    */
  var cursor: js.UndefOr[CursorProperty | js.Array[CursorProperty]] = js.undefined
  
  /**
    * The **`direction`** CSS property sets the direction of text, table columns, and horizontal overflow. Use `rtl` for languages written from right to left (like Hebrew or Arabic), and `ltr` for those written from left to right (like English and most other languages).
    *
    * **Initial value**: `ltr`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE    |
    * | :----: | :-----: | :-----: | :----: | :-----: |
    * | **2**  |  **1**  | **1.3** | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/direction
    */
  var direction: js.UndefOr[DirectionProperty | js.Array[DirectionProperty]] = js.undefined
  
  /**
    * The **`display`** CSS property defines the _display type_ of an element, which consists of the two basic qualities of how an element generates boxes — the **outer display type** defining how the box participates in flow layout, and the **inner display type** defining how the children of the box are laid out.
    *
    * **Initial value**: `inline`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/display
    */
  var display: js.UndefOr[DisplayProperty | js.Array[DisplayProperty]] = js.undefined
  
  /**
    * The **`empty-cells`** CSS property sets whether borders and backgrounds appear around `<table>` cells that have no visible content.
    *
    * **Initial value**: `show`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/empty-cells
    */
  var emptyCells: js.UndefOr[EmptyCellsProperty | js.Array[EmptyCellsProperty]] = js.undefined
  
  /**
    * The **`filter`** CSS property applies graphical effects like blur or color shift to an element. Filters are commonly used to adjust the rendering of images, backgrounds, and borders.
    *
    * **Initial value**: `none`
    *
    * |  Chrome  | Firefox |   Safari    |  Edge  | IE  |
    * | :------: | :-----: | :---------: | :----: | :-: |
    * |  **53**  | **35**  | **6** _-x-_ | **12** | No  |
    * | 18 _-x-_ |         |             |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/filter
    */
  var filter: js.UndefOr[FilterProperty | js.Array[FilterProperty]] = js.undefined
  
  /**
    * The **`flex-basis`** CSS property sets the initial main size of a flex item. It sets the size of the content box unless otherwise set with `box-sizing`.
    *
    * **Initial value**: `auto`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :------: | :-----: | :-----: | :----: | :----: |
    * |  **29**  | **22**  |  **9**  | **12** | **11** |
    * | 21 _-x-_ |         | 7 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-basis
    */
  var flexBasis: js.UndefOr[FlexBasisProperty[TLength] | js.Array[FlexBasisProperty[TLength]]] = js.undefined
  
  /**
    * The **`flex-direction`** CSS property sets how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
    *
    * **Initial value**: `row`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |    IE    |
    * | :------: | :-----: | :-----: | :----: | :------: |
    * |  **29**  | **20**  |  **9**  | **12** |  **11**  |
    * | 21 _-x-_ |         | 7 _-x-_ |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-direction
    */
  var flexDirection: js.UndefOr[FlexDirectionProperty | js.Array[FlexDirectionProperty]] = js.undefined
  
  /**
    * The **`flex-grow`** CSS property sets how much of the available space in the flex container should be assigned to that item (the flex grow factor). If all sibling items have the same flex grow factor, then all items will receive the same share of available space, otherwise it is distributed according to the ratio defined by the different flex grow factors.
    *
    * **Initial value**: `0`
    *
    * |  Chrome  | Firefox |    Safari     |  Edge  |            IE            |
    * | :------: | :-----: | :-----------: | :----: | :----------------------: |
    * |  **29**  | **20**  | **6.1** _-x-_ | **12** |          **11**          |
    * | 21 _-x-_ |         |               |        | 10 _(-ms-flex-positive)_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-grow
    */
  var flexGrow: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  
  /**
    * The **`flex-shrink`** CSS property sets the flex shrink factor of a flex item. If the size of flex items is larger than the flex container, items shrink to fit according to `flex-shrink`.
    *
    * **Initial value**: `1`
    *
    * |  Chrome  | Firefox |   Safari    |  Edge  |   IE   |
    * | :------: | :-----: | :---------: | :----: | :----: |
    * |  **29**  | **20**  | **8** _-x-_ | **12** | **10** |
    * | 21 _-x-_ |         |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-shrink
    */
  var flexShrink: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  
  /**
    * The **`flex-wrap`** CSS property sets whether flex items are forced onto one line or can wrap onto multiple lines. If wrapping is allowed, it sets the direction that lines are stacked.
    *
    * **Initial value**: `nowrap`
    *
    * |  Chrome  | Firefox | Safari |  Edge  |   IE   |
    * | :------: | :-----: | :----: | :----: | :----: |
    * |  **29**  | **28**  | **9**  | **12** | **11** |
    * | 21 _-x-_ |         |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-wrap
    */
  var flexWrap: js.UndefOr[FlexWrapProperty | js.Array[FlexWrapProperty]] = js.undefined
  
  /**
    * The **`float`** CSS property places an element on the left or right side of its container, allowing text and inline elements to wrap around it. The element is removed from the normal flow of the page, though still remaining a part of the flow (in contrast to absolute positioning).
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/float
    */
  var float: js.UndefOr[FloatProperty | js.Array[FloatProperty]] = js.undefined
  
  /**
    * The **`font-family`** CSS property specifies a prioritized list of one or more font family names and/or generic family names for the selected element.
    *
    * **Initial value**: depends on user agent
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-family
    */
  var fontFamily: js.UndefOr[FontFamilyProperty | js.Array[FontFamilyProperty]] = js.undefined
  
  /**
    * The **`font-feature-settings`** CSS property controls advanced typographic features in OpenType fonts.
    *
    * **Initial value**: `normal`
    *
    * |  Chrome  | Firefox  | Safari  |  Edge  |   IE   |
    * | :------: | :------: | :-----: | :----: | :----: |
    * |  **48**  |  **34**  | **9.1** | **15** | **10** |
    * | 16 _-x-_ | 15 _-x-_ |         |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-feature-settings
    */
  var fontFeatureSettings: js.UndefOr[FontFeatureSettingsProperty | js.Array[FontFeatureSettingsProperty]] = js.undefined
  
  /**
    * The **`font-kerning`** CSS property sets the use of the kerning information stored in a font.
    *
    * **Initial value**: `auto`
    *
    * |    Chrome    | Firefox | Safari | Edge | IE  |
    * | :----------: | :-----: | :----: | :--: | :-: |
    * | **32** _-x-_ | **32**  | **7**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-kerning
    */
  var fontKerning: js.UndefOr[FontKerningProperty | js.Array[FontKerningProperty]] = js.undefined
  
  /**
    * The **`font-language-override`** CSS property controls the use of language-specific glyphs in a typeface.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **34**  |   No   |  No  | No  |
    * |        | 4 _-x-_ |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-language-override
    */
  var fontLanguageOverride: js.UndefOr[FontLanguageOverrideProperty | js.Array[FontLanguageOverrideProperty]] = js.undefined
  
  /**
    * The **`font-optical-sizing`** CSS property sets whether text rendering is optimized for viewing at different sizes. This only works for fonts that have an optical size variation axis.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * |   No   | **62**  |  n/a   | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-optical-sizing
    */
  var fontOpticalSizing: js.UndefOr[FontOpticalSizingProperty | js.Array[FontOpticalSizingProperty]] = js.undefined
  
  /**
    * The **`font-size`** CSS property sets the size of the font. This property is also used to compute the size of `em`, `ex`, and other relative `<length>` units.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-size
    */
  var fontSize: js.UndefOr[FontSizeProperty[TLength] | js.Array[FontSizeProperty[TLength]]] = js.undefined
  
  /**
    * The **`font-size-adjust`** CSS property sets how the font size should be chosen based on the height of lowercase rather than capital letters.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   |  **1**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-size-adjust
    */
  var fontSizeAdjust: js.UndefOr[FontSizeAdjustProperty | js.Array[FontSizeAdjustProperty]] = js.undefined
  
  /**
    * The **`font-stretch`** CSS property selects a normal, condensed, or expanded face from a font.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **60** |  **9**  | **11** | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-stretch
    */
  var fontStretch: js.UndefOr[FontStretchProperty | js.Array[FontStretchProperty]] = js.undefined
  
  /**
    * The **`font-style`** CSS property sets whether a font should be styled with a normal, italic, or oblique face from its `font-family`.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-style
    */
  var fontStyle: js.UndefOr[FontStyleProperty | js.Array[FontStyleProperty]] = js.undefined
  
  /**
    * The **`font-synthesis`** CSS property controls which missing typefaces, bold or italic, may be synthesized by the browser.
    *
    * **Initial value**: `weight style`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **34**  | **9**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-synthesis
    */
  var fontSynthesis: js.UndefOr[FontSynthesisProperty | js.Array[FontSynthesisProperty]] = js.undefined
  
  /**
    * The **font-variant** CSS property is a shorthand for the longhand properties `font-variant-caps`, `font-variant-numeric`, `font-variant-alternates`, `font-variant-ligatures`, and `font-variant-east-asian`. You can also set the CSS Level 2 (Revision 1) values of `font-variant`, (that is, `normal` or `small-caps`), by using the `font` shorthand.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant
    */
  var fontVariant: js.UndefOr[FontVariantProperty | js.Array[FontVariantProperty]] = js.undefined
  
  /**
    * The **`font-variant-caps`** CSS property controls the use of alternate glyphs for capital letters.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **52** | **34**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-caps
    */
  var fontVariantCaps: js.UndefOr[FontVariantCapsProperty | js.Array[FontVariantCapsProperty]] = js.undefined
  
  /**
    * The **`font-variant-east-asian`** CSS property controls the use of alternate glyphs for East Asian scripts, like Japanese and Chinese.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **63** | **34**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-east-asian
    */
  var fontVariantEastAsian: js.UndefOr[FontVariantEastAsianProperty | js.Array[FontVariantEastAsianProperty]] = js.undefined
  
  /**
    * The **`font-variant-ligatures`** CSS property controls which ligatures and contextual forms are used in textual content of the elements it applies to. This leads to more harmonized forms in the resulting text.
    *
    * **Initial value**: `normal`
    *
    * |  Chrome  | Firefox | Safari  | Edge | IE  |
    * | :------: | :-----: | :-----: | :--: | :-: |
    * |  **34**  | **34**  | **9.1** |  No  | No  |
    * | 31 _-x-_ |         | 7 _-x-_ |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-ligatures
    */
  var fontVariantLigatures: js.UndefOr[FontVariantLigaturesProperty | js.Array[FontVariantLigaturesProperty]] = js.undefined
  
  /**
    * The **`font-variant-numeric`** CSS property controls the usage of alternate glyphs for numbers, fractions, and ordinal markers.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari  | Edge | IE  |
    * | :----: | :-----: | :-----: | :--: | :-: |
    * | **52** | **34**  | **9.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-numeric
    */
  var fontVariantNumeric: js.UndefOr[FontVariantNumericProperty | js.Array[FontVariantNumericProperty]] = js.undefined
  
  /**
    * The **`font-variant-position`** CSS property controls the use of alternate, smaller glyphs that are positioned as superscript or subscript.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **34**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-position
    */
  var fontVariantPosition: js.UndefOr[FontVariantPositionProperty | js.Array[FontVariantPositionProperty]] = js.undefined
  
  /**
    * The **`font-variation-settings`** CSS property provides low-level control over variable font characteristics, by specifying the four letter axis names of the characteristics you want to vary, along with their values.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **62** | **62**  | **11** | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variation-settings
    */
  var fontVariationSettings: js.UndefOr[FontVariationSettingsProperty | js.Array[FontVariationSettingsProperty]] = js.undefined
  
  /**
    * The **`font-weight`** CSS property specifies the weight (or boldness) of the font. The font weights available to you will depend on the `font-family` you are using. Some fonts are only available in `normal` and `bold`.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **2**  |  **1**  | **1.3** | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-weight
    */
  var fontWeight: js.UndefOr[FontWeightProperty | js.Array[FontWeightProperty]] = js.undefined
  
  /**
    * The **`grid-auto-columns`** CSS property specifies the size of an implicitly-created grid column track.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |          Edge           |             IE              |
    * | :----: | :-----: | :------: | :---------------------: | :-------------------------: |
    * | **57** | **52**  | **10.1** |         **16**          | **10** _(-ms-grid-columns)_ |
    * |        |         |          | 12 _(-ms-grid-columns)_ |                             |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-columns
    */
  var gridAutoColumns: js.UndefOr[GridAutoColumnsProperty[TLength] | js.Array[GridAutoColumnsProperty[TLength]]] = js.undefined
  
  /**
    * The **`grid-auto-flow`** CSS property controls how the auto-placement algorithm works, specifying exactly how auto-placed items get flowed into the grid.
    *
    * **Initial value**: `row`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-flow
    */
  var gridAutoFlow: js.UndefOr[GridAutoFlowProperty | js.Array[GridAutoFlowProperty]] = js.undefined
  
  /**
    * The **`grid-auto-rows`** CSS property specifies the size of an implicitly-created grid row track.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |         Edge         |            IE            |
    * | :----: | :-----: | :------: | :------------------: | :----------------------: |
    * | **57** | **52**  | **10.1** |        **16**        | **10** _(-ms-grid-rows)_ |
    * |        |         |          | 12 _(-ms-grid-rows)_ |                          |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-rows
    */
  var gridAutoRows: js.UndefOr[GridAutoRowsProperty[TLength] | js.Array[GridAutoRowsProperty[TLength]]] = js.undefined
  
  /**
    * The **`grid-column-end`** CSS property specifies a grid item’s end position within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the block-end edge of its grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column-end
    */
  var gridColumnEnd: js.UndefOr[GridColumnEndProperty | js.Array[GridColumnEndProperty]] = js.undefined
  
  /**
    * The **`grid-column-start`** CSS property specifies a grid item’s start position within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement. This start position defines the block-start edge of the grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column-start
    */
  var gridColumnStart: js.UndefOr[GridColumnStartProperty | js.Array[GridColumnStartProperty]] = js.undefined
  
  /**
    * The **`grid-row-end`** CSS property specifies a grid item’s end position within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-end edge of its grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row-end
    */
  var gridRowEnd: js.UndefOr[GridRowEndProperty | js.Array[GridRowEndProperty]] = js.undefined
  
  /**
    * The **`grid-row-start`** CSS property specifies a grid item’s start position within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start edge of its grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row-start
    */
  var gridRowStart: js.UndefOr[GridRowStartProperty | js.Array[GridRowStartProperty]] = js.undefined
  
  /**
    * The **`grid-template-areas`** CSS property specifies named grid areas.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-areas
    */
  var gridTemplateAreas: js.UndefOr[GridTemplateAreasProperty | js.Array[GridTemplateAreasProperty]] = js.undefined
  
  /**
    * The **`grid-template-columns`** CSS property defines the line names and track sizing functions of the grid columns.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-columns
    */
  var gridTemplateColumns: js.UndefOr[
    GridTemplateColumnsProperty[TLength] | js.Array[GridTemplateColumnsProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`grid-template-rows`** CSS property defines the line names and track sizing functions of the grid rows.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-rows
    */
  var gridTemplateRows: js.UndefOr[GridTemplateRowsProperty[TLength] | js.Array[GridTemplateRowsProperty[TLength]]] = js.undefined
  
  /**
    * The **`hanging-punctuation`** CSS property specifies whether a punctuation mark should hang at the start or end of a line of text. Hanging punctuation may be placed outside the line box.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    | **10** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/hanging-punctuation
    */
  var hangingPunctuation: js.UndefOr[HangingPunctuationProperty | js.Array[HangingPunctuationProperty]] = js.undefined
  
  /**
    * The **`height`** CSS property specifies the height of an element. By default, the property defines the height of the content area. If `box-sizing` is set to `border-box`, however, it instead determines the height of the border area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/height
    */
  var height: js.UndefOr[HeightProperty[TLength] | js.Array[HeightProperty[TLength]]] = js.undefined
  
  /**
    * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
    *
    * **Initial value**: `manual`
    *
    * |  Chrome  | Firefox |    Safari     |     Edge     |      IE      |
    * | :------: | :-----: | :-----------: | :----------: | :----------: |
    * |  **55**  | **43**  | **5.1** _-x-_ | **12** _-x-_ | **10** _-x-_ |
    * | 13 _-x-_ | 6 _-x-_ |               |              |              |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/hyphens
    */
  var hyphens: js.UndefOr[HyphensProperty | js.Array[HyphensProperty]] = js.undefined
  
  /**
    * The **`image-orientation`** CSS property specifies a layout-independent correction to the orientation of an image. It should _not_ be used for any other orientation adjustments; instead, the `transform` property should be used with the `rotate` `<transform-function>`.
    *
    * **Initial value**: `0deg`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **26**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/image-orientation
    */
  var imageOrientation: js.UndefOr[ImageOrientationProperty | js.Array[ImageOrientationProperty]] = js.undefined
  
  /**
    * The **`image-rendering`** CSS property sets an image scaling algorithm. The property applies to an element itself, to any images set in its other properties, and to its descendants.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   | **3.6** |  Yes   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/image-rendering
    */
  var imageRendering: js.UndefOr[ImageRenderingProperty | js.Array[ImageRenderingProperty]] = js.undefined
  
  /** **Initial value**: `1dppx` */
  var imageResolution: js.UndefOr[ImageResolutionProperty | js.Array[ImageResolutionProperty]] = js.undefined
  
  /**
    * The `initial-letter` CSS property sets styling for dropped, raised, and sunken initial letters.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    | **9**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/initial-letter
    */
  var initialLetter: js.UndefOr[InitialLetterProperty | js.Array[InitialLetterProperty]] = js.undefined
  
  /**
    * The **`inline-size`** CSS property defines the horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `width` or the `height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **57** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inline-size
    */
  var inlineSize: js.UndefOr[InlineSizeProperty[TLength] | js.Array[InlineSizeProperty[TLength]]] = js.undefined
  
  /**
    * The **`inset`** CSS property defines the logical block and inline start and end offsets of an element, which map to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset
    */
  var inset: js.UndefOr[InsetProperty[TLength] | js.Array[InsetProperty[TLength]]] = js.undefined
  
  /**
    * The **`inset-block`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block
    */
  var insetBlock: js.UndefOr[InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]] = js.undefined
  
  /**
    * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block-end
    */
  var insetBlockEnd: js.UndefOr[InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]] = js.undefined
  
  /**
    * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block-start
    */
  var insetBlockStart: js.UndefOr[InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]] = js.undefined
  
  /**
    * The **`inset-inline`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline
    */
  var insetInline: js.UndefOr[InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]] = js.undefined
  
  /**
    * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline-end
    */
  var insetInlineEnd: js.UndefOr[InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]] = js.undefined
  
  /**
    * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline-start
    */
  var insetInlineStart: js.UndefOr[InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]] = js.undefined
  
  /**
    * The **`isolation`** CSS property determines whether an element must create a new stacking context.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **41** | **36**  |  Yes   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/isolation
    */
  var isolation: js.UndefOr[IsolationProperty | js.Array[IsolationProperty]] = js.undefined
  
  /**
    * The CSS **`justify-content`** property defines how the browser distributes space between and around content items along the main-axis of a flex container, and the inline axis of a grid container.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox | Safari |  Edge  |   IE   |
    * | :------: | :-----: | :----: | :----: | :----: |
    * |  **52**  | **20**  | **9**  | **12** | **11** |
    * | 21 _-x-_ |         |        |        |        |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/justify-content
    */
  var justifyContent: js.UndefOr[JustifyContentProperty | js.Array[JustifyContentProperty]] = js.undefined
  
  /**
    * The CSS **`justify-items`** property defines the default `justify-self` for all items of the box, giving them all a default way of justifying each box along the appropriate axis.
    *
    * **Initial value**: `legacy`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **52** | **20**  | **9**  | **12** | **11** |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **45**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/justify-items
    */
  var justifyItems: js.UndefOr[JustifyItemsProperty | js.Array[JustifyItemsProperty]] = js.undefined
  
  /**
    * The CSS **`justify-self`** property set the way a box is justified inside its alignment container along the appropriate axis.
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **45**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **45**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/justify-self
    */
  var justifySelf: js.UndefOr[JustifySelfProperty | js.Array[JustifySelfProperty]] = js.undefined
  
  /**
    * The **`left`** CSS property participates in specifying the horizontal position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/left
    */
  var left: js.UndefOr[LeftProperty[TLength] | js.Array[LeftProperty[TLength]]] = js.undefined
  
  /**
    * The **`letter-spacing`** CSS property sets the spacing behavior between text characters.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/letter-spacing
    */
  var letterSpacing: js.UndefOr[LetterSpacingProperty[TLength] | js.Array[LetterSpacingProperty[TLength]]] = js.undefined
  
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Initial value**: `auto`
    *
    * | Chrome  | Firefox | Safari |  Edge  |   IE    |
    * | :-----: | :-----: | :----: | :----: | :-----: |
    * | **58**  |   No    |  Yes   | **14** | **5.5** |
    * | 1 _-x-_ |         |        |        |         |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-break
    */
  var lineBreak: js.UndefOr[LineBreakProperty | js.Array[LineBreakProperty]] = js.undefined
  
  /**
    * The **`line-height`** CSS property sets the amount of space used for lines, such as in text. On block-level elements, it specifies the minimum height of line boxes within the element. On non-replaced inline elements, it specifies the height that is used to calculate line box height.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-height
    */
  var lineHeight: js.UndefOr[LineHeightProperty[TLength] | js.Array[LineHeightProperty[TLength]]] = js.undefined
  
  /**
    * The **`line-height-step`** CSS property sets the step unit for line box heights. When the property is set, line box heights are rounded up to the closest multiple of the unit.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   |   No    |   No   |  No  | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-height-step
    */
  var lineHeightStep: js.UndefOr[LineHeightStepProperty[TLength] | js.Array[LineHeightStepProperty[TLength]]] = js.undefined
  
  /**
    * The **`list-style-image`** CSS property sets an image to be used as the list item marker.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-image
    */
  var listStyleImage: js.UndefOr[ListStyleImageProperty | js.Array[ListStyleImageProperty]] = js.undefined
  
  /**
    * The **`list-style-position`** CSS property sets the position of the `::marker` relative to a list item.
    *
    * **Initial value**: `outside`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-position
    */
  var listStylePosition: js.UndefOr[ListStylePositionProperty | js.Array[ListStylePositionProperty]] = js.undefined
  
  /**
    * The **`list-style-type`** CSS property sets the marker (such as a disc, character, or custom counter style) of a list item element.
    *
    * **Initial value**: `disc`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-type
    */
  var listStyleType: js.UndefOr[ListStyleTypeProperty | js.Array[ListStyleTypeProperty]] = js.undefined
  
  /**
    * The **`margin-block`** CSS property defines the logical block start and end margins of an element, which maps to physical margins depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block
    */
  var marginBlock: js.UndefOr[MarginBlockProperty[TLength] | js.Array[MarginBlockProperty[TLength]]] = js.undefined
  
  /**
    * The **`margin-block-end`** CSS property defines the logical block end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block-end
    */
  var marginBlockEnd: js.UndefOr[MarginBlockEndProperty[TLength] | js.Array[MarginBlockEndProperty[TLength]]] = js.undefined
  
  /**
    * The **`margin-block-start`** CSS property defines the logical block start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block-start
    */
  var marginBlockStart: js.UndefOr[MarginBlockStartProperty[TLength] | js.Array[MarginBlockStartProperty[TLength]]] = js.undefined
  
  /**
    * The **`margin-bottom`** CSS property sets the margin area on the bottom of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-bottom
    */
  var marginBottom: js.UndefOr[MarginBottomProperty[TLength] | js.Array[MarginBottomProperty[TLength]]] = js.undefined
  
  /**
    * The **`margin-inline`** CSS property defines the logical inline start and end margins of an element, which maps to physical margins depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline
    */
  var marginInline: js.UndefOr[MarginInlineProperty[TLength] | js.Array[MarginInlineProperty[TLength]]] = js.undefined
  
  /**
    * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |          Chrome          |        Firefox        |            Safari            | Edge | IE  |
    * | :----------------------: | :-------------------: | :--------------------------: | :--: | :-: |
    * |          **69**          |        **41**         | **3** _(-webkit-margin-end)_ |  No  | No  |
    * | 2 _(-webkit-margin-end)_ | 3 _(-moz-margin-end)_ |                              |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline-end
    */
  var marginInlineEnd: js.UndefOr[MarginInlineEndProperty[TLength] | js.Array[MarginInlineEndProperty[TLength]]] = js.undefined
  
  /**
    * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |           Chrome           |         Firefox         |             Safari             | Edge | IE  |
    * | :------------------------: | :---------------------: | :----------------------------: | :--: | :-: |
    * |           **69**           |         **41**          | **3** _(-webkit-margin-start)_ |  No  | No  |
    * | 2 _(-webkit-margin-start)_ | 3 _(-moz-margin-start)_ |                                |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline-start
    */
  var marginInlineStart: js.UndefOr[
    MarginInlineStartProperty[TLength] | js.Array[MarginInlineStartProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`margin-left`** CSS property sets the margin area on the left side of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-left
    */
  var marginLeft: js.UndefOr[MarginLeftProperty[TLength] | js.Array[MarginLeftProperty[TLength]]] = js.undefined
  
  /**
    * The **`margin-right`** CSS property sets the margin area on the right side of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-right
    */
  var marginRight: js.UndefOr[MarginRightProperty[TLength] | js.Array[MarginRightProperty[TLength]]] = js.undefined
  
  /**
    * The **`margin-top`** CSS property sets the margin area on the top of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-top
    */
  var marginTop: js.UndefOr[MarginTopProperty[TLength] | js.Array[MarginTopProperty[TLength]]] = js.undefined
  
  /**
    * The **`mask-border-mode`** CSS property specifies the blending mode used in a mask border.
    *
    * **Initial value**: `alpha`
    */
  var maskBorderMode: js.UndefOr[MaskBorderModeProperty | js.Array[MaskBorderModeProperty]] = js.undefined
  
  /**
    * The **`mask-border-outset`** CSS property specifies the distance by which an element's mask border is set out from its border box.
    *
    * **Initial value**: `0`
    */
  var maskBorderOutset: js.UndefOr[MaskBorderOutsetProperty[TLength] | js.Array[MaskBorderOutsetProperty[TLength]]] = js.undefined
  
  /**
    * The **`mask-border-repeat`** CSS property sets how the edge regions of a source image are adjusted to fit the dimensions of an element's mask border.
    *
    * **Initial value**: `stretch`
    */
  var maskBorderRepeat: js.UndefOr[MaskBorderRepeatProperty | js.Array[MaskBorderRepeatProperty]] = js.undefined
  
  /**
    * The **`mask-border-slice`** CSS property divides the image set by `mask-border-source` into regions. These regions are used to form the components of an element's mask border.
    *
    * **Initial value**: `0`
    */
  var maskBorderSlice: js.UndefOr[MaskBorderSliceProperty | js.Array[MaskBorderSliceProperty]] = js.undefined
  
  /**
    * The **`mask-border-source`** CSS property sets the source image used to create an element's mask border.
    *
    * **Initial value**: `none`
    */
  var maskBorderSource: js.UndefOr[MaskBorderSourceProperty | js.Array[MaskBorderSourceProperty]] = js.undefined
  
  /**
    * The **`mask-border-width`** CSS property sets the width of an element's mask border.
    *
    * **Initial value**: `auto`
    */
  var maskBorderWidth: js.UndefOr[MaskBorderWidthProperty[TLength] | js.Array[MaskBorderWidthProperty[TLength]]] = js.undefined
  
  /**
    * The **`mask-clip`** CSS property determines the area, which is affected by a mask. The painted content of an element must be restricted to this area.
    *
    * **Initial value**: `border-box`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   | **53**  |  Yes   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-clip
    */
  var maskClip: js.UndefOr[MaskClipProperty | js.Array[MaskClipProperty]] = js.undefined
  
  /**
    * The **`mask-composite`** CSS property represents a compositing operation used on the current mask layer with the mask layers below it.
    *
    * **Initial value**: `add`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * |   No   | **53**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-composite
    */
  var maskComposite: js.UndefOr[MaskCompositeProperty | js.Array[MaskCompositeProperty]] = js.undefined
  
  /**
    * The **`mask-image`** CSS property sets the image that is used as mask layer for an element.
    *
    * **Initial value**: `none`
    *
    * |   Chrome    | Firefox |   Safari    |  Edge  | IE  |
    * | :---------: | :-----: | :---------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-image
    */
  var maskImage: js.UndefOr[MaskImageProperty | js.Array[MaskImageProperty]] = js.undefined
  
  /**
    * The **`mask-mode`** CSS property sets whether the mask reference defined by `mask-image` is treated as a luminance or alpha mask.
    *
    * **Initial value**: `match-source`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **53**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-mode
    */
  var maskMode: js.UndefOr[MaskModeProperty | js.Array[MaskModeProperty]] = js.undefined
  
  /**
    * The **`mask-origin`** CSS property sets the origin of a mask.
    *
    * **Initial value**: `border-box`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   | **53**  |  Yes   |  No  | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-origin
    */
  var maskOrigin: js.UndefOr[MaskOriginProperty | js.Array[MaskOriginProperty]] = js.undefined
  
  /**
    * The **`mask-position`** CSS property sets the initial position, relative to the mask position layer set by `mask-origin`, for each defined mask image.
    *
    * **Initial value**: `center`
    *
    * |   Chrome    | Firefox |   Safari    |  Edge  | IE  |
    * | :---------: | :-----: | :---------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ | **18** | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-position
    */
  var maskPosition: js.UndefOr[MaskPositionProperty[TLength] | js.Array[MaskPositionProperty[TLength]]] = js.undefined
  
  /**
    * The **`mask-repeat`** CSS property sets how mask images are repeated. A mask image can be repeated along the horizontal axis, the vertical axis, both axes, or not repeated at all.
    *
    * **Initial value**: `no-repeat`
    *
    * |   Chrome    | Firefox |   Safari    |  Edge  | IE  |
    * | :---------: | :-----: | :---------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ | **18** | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-repeat
    */
  var maskRepeat: js.UndefOr[MaskRepeatProperty | js.Array[MaskRepeatProperty]] = js.undefined
  
  /**
    * The **`mask-size`** CSS property specifies the sizes of the mask images. The size of the image can be fully or partially constrained in order to preserve its intrinsic ratio.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * |   No   | **53**  |   No   | **17** | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-size
    */
  var maskSize: js.UndefOr[MaskSizeProperty[TLength] | js.Array[MaskSizeProperty[TLength]]] = js.undefined
  
  /**
    * The **`mask-type`** CSS property sets whether an SVG `<mask>` element is used as a _luminance_ or an _alpha_ mask. It applies to the `<mask>` element itself.
    *
    * **Initial value**: `luminance`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **24** | **35**  |  n/a   |  No  | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-type
    */
  var maskType: js.UndefOr[MaskTypeProperty | js.Array[MaskTypeProperty]] = js.undefined
  
  /**
    * The `**max-block-size**` CSS property specifies the maximum size of an element in the direction opposite that of the writing direction as specified by `writing-mode`. That is, if the writing direction is horizontal, then `max-block-size` is equivalent to `max-height`; if the writing direction is vertical, `max-block-size` is the same as `max-width`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **57** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-block-size
    */
  var maxBlockSize: js.UndefOr[MaxBlockSizeProperty[TLength] | js.Array[MaxBlockSizeProperty[TLength]]] = js.undefined
  
  /**
    * The **`max-height`** CSS property sets the maximum height of an element. It prevents the used value of the `height` property from becoming larger than the value specified for `max-height`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **18** |  **1**  | **1**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-height
    */
  var maxHeight: js.UndefOr[MaxHeightProperty[TLength] | js.Array[MaxHeightProperty[TLength]]] = js.undefined
  
  /**
    * The **`max-inline-size`** CSS property defines the horizontal or vertical maximum size of an element's block depending on its writing mode. It corresponds to the `max-width` or the `max-height` property depending on the value defined for `writing-mode`. If the writing mode is vertically oriented, the value of `max-inline-size` relates to the maximal height of the element, otherwise it relates to the maximal width of the element. It relates to `max-block-size`, which defines the other dimension of the element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |     Safari     | Edge | IE  |
    * | :----: | :-----: | :------------: | :--: | :-: |
    * | **57** | **41**  | **10.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-inline-size
    */
  var maxInlineSize: js.UndefOr[MaxInlineSizeProperty[TLength] | js.Array[MaxInlineSizeProperty[TLength]]] = js.undefined
  
  /** **Initial value**: `none` */
  var maxLines: js.UndefOr[MaxLinesProperty | js.Array[MaxLinesProperty]] = js.undefined
  
  /**
    * The **`max-width`** CSS property sets the maximum width of an element. It prevents the used value of the `width` property from becoming larger than the value specified by `max-width`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **2**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-width
    */
  var maxWidth: js.UndefOr[MaxWidthProperty[TLength] | js.Array[MaxWidthProperty[TLength]]] = js.undefined
  
  /**
    * The **`min-block-size`** CSS property defines the minimum horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `min-width` or the `min-height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **57** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-block-size
    */
  var minBlockSize: js.UndefOr[MinBlockSizeProperty[TLength] | js.Array[MinBlockSizeProperty[TLength]]] = js.undefined
  
  /**
    * The **`min-height`** CSS property sets the minimum height of an element. It prevents the used value of the `height` property from becoming smaller than the value specified for `min-height`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **3**  | **1**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-height
    */
  var minHeight: js.UndefOr[MinHeightProperty[TLength] | js.Array[MinHeightProperty[TLength]]] = js.undefined
  
  /**
    * The **`min-inline-size`** CSS property defines the horizontal or vertical minimal size of an element's block, depending on its writing mode. It corresponds to either the `min-width` or the `min-height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **57** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-inline-size
    */
  var minInlineSize: js.UndefOr[MinInlineSizeProperty[TLength] | js.Array[MinInlineSizeProperty[TLength]]] = js.undefined
  
  /**
    * The **`min-width`** CSS property sets the minimum width of an element. It prevents the used value of the `width` property from becoming smaller than the value specified for `min-width`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **2**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-width
    */
  var minWidth: js.UndefOr[MinWidthProperty[TLength] | js.Array[MinWidthProperty[TLength]]] = js.undefined
  
  /**
    * The **`mix-blend-mode`** CSS property sets how an element's content should blend with the content of the element's parent and the element's background.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **41** | **32**  | **8**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mix-blend-mode
    */
  var mixBlendMode: js.UndefOr[MixBlendModeProperty | js.Array[MixBlendModeProperty]] = js.undefined
  
  /**
    * The **`offset-distance`** CSS property specifies a position along an `offset-path`.
    *
    * **Initial value**: `0`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **55**         |   No    |   No   |  No  | n/a |
    * | 46 _(motion-distance)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-distance
    */
  var motionDistance: js.UndefOr[OffsetDistanceProperty[TLength] | js.Array[OffsetDistanceProperty[TLength]]] = js.undefined
  
  /**
    * The **`offset-path`** CSS property specifies a motion path for an element to follow and defines the element's positioning within the parent container or SVG coordinate system.
    *
    * **Initial value**: `none`
    *
    * |       Chrome       | Firefox | Safari | Edge | IE  |
    * | :----------------: | :-----: | :----: | :--: | :-: |
    * |       **55**       |   n/a   |   No   |  No  | n/a |
    * | 46 _(motion-path)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-path
    */
  var motionPath: js.UndefOr[OffsetPathProperty | js.Array[OffsetPathProperty]] = js.undefined
  
  /**
    * The **`offset-rotate`** CSS property defines the direction of the element while positioning along the offset path.
    *
    * **Initial value**: `auto`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **56**         |   No    |   No   |  No  | n/a |
    * | 46 _(motion-rotation)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
    */
  var motionRotation: js.UndefOr[OffsetRotateProperty | js.Array[OffsetRotateProperty]] = js.undefined
  
  /**
    * The **`object-fit`** CSS property sets how the content of a replaced element, such as an `<img>` or `<video>`, should be resized to fit its container.
    *
    * **Initial value**: `fill`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **31** | **36**  | **10** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/object-fit
    */
  var objectFit: js.UndefOr[ObjectFitProperty | js.Array[ObjectFitProperty]] = js.undefined
  
  /**
    * The **`object-position`** CSS property specifies the alignment of the selected replaced element's contents within the element's box. Areas of the box which aren't covered by the replaced element's object will show the element's background.
    *
    * **Initial value**: `50% 50%`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **31** | **36**  | **10** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/object-position
    */
  var objectPosition: js.UndefOr[ObjectPositionProperty[TLength] | js.Array[ObjectPositionProperty[TLength]]] = js.undefined
  
  /** **Initial value**: `auto` */
  var offsetAnchor: js.UndefOr[OffsetAnchorProperty[TLength] | js.Array[OffsetAnchorProperty[TLength]]] = js.undefined
  
  /**
    * The **`offset-distance`** CSS property specifies a position along an `offset-path`.
    *
    * **Initial value**: `0`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **55**         |   No    |   No   |  No  | n/a |
    * | 46 _(motion-distance)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-distance
    */
  var offsetDistance: js.UndefOr[OffsetDistanceProperty[TLength] | js.Array[OffsetDistanceProperty[TLength]]] = js.undefined
  
  /**
    * The **`offset-path`** CSS property specifies a motion path for an element to follow and defines the element's positioning within the parent container or SVG coordinate system.
    *
    * **Initial value**: `none`
    *
    * |       Chrome       | Firefox | Safari | Edge | IE  |
    * | :----------------: | :-----: | :----: | :--: | :-: |
    * |       **55**       |   n/a   |   No   |  No  | n/a |
    * | 46 _(motion-path)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-path
    */
  var offsetPath: js.UndefOr[OffsetPathProperty | js.Array[OffsetPathProperty]] = js.undefined
  
  /** **Initial value**: `auto` */
  var offsetPosition: js.UndefOr[OffsetPositionProperty[TLength] | js.Array[OffsetPositionProperty[TLength]]] = js.undefined
  
  /**
    * The **`offset-rotate`** CSS property defines the direction of the element while positioning along the offset path.
    *
    * **Initial value**: `auto`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **56**         |   No    |   No   |  No  | n/a |
    * | 46 _(motion-rotation)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
    */
  var offsetRotate: js.UndefOr[OffsetRotateProperty | js.Array[OffsetRotateProperty]] = js.undefined
  
  /**
    * The **`offset-rotate`** CSS property defines the direction of the element while positioning along the offset path.
    *
    * **Initial value**: `auto`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **56**         |   No    |   No   |  No  | n/a |
    * | 46 _(motion-rotation)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
    */
  var offsetRotation: js.UndefOr[OffsetRotateProperty | js.Array[OffsetRotateProperty]] = js.undefined
  
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Initial value**: `1.0`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/opacity
    */
  var opacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  
  /**
    * The **`order`** CSS property sets the order to lay out an item in a flex or grid container. Items in a container are sorted by ascending `order` value and then by their source code order.
    *
    * **Initial value**: `0`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |    IE    |
    * | :------: | :-----: | :-----: | :----: | :------: |
    * |  **29**  | **20**  |  **9**  | **12** |  **11**  |
    * | 21 _-x-_ |         | 7 _-x-_ |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/order
    */
  var order: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  
  /**
    * The **`orphans`** CSS property sets the minimum number of lines in a block container that must be shown at the _bottom_ of a page, region, or column.
    *
    * **Initial value**: `2`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **25** |   No    |   No   | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/orphans
    */
  var orphans: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  
  /**
    * The **`outline-color`** CSS property sets the color of an element's outline.
    *
    * **Initial value**: `invert`, for browsers supporting it, `currentColor` for the other
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-color
    */
  var outlineColor: js.UndefOr[OutlineColorProperty | js.Array[OutlineColorProperty]] = js.undefined
  
  /**
    * The **`outline-offset`** CSS property sets the amount of space between an outline and the edge or border of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **1**  | **1.5** | **1.2** | **15** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-offset
    */
  var outlineOffset: js.UndefOr[OutlineOffsetProperty[TLength] | js.Array[OutlineOffsetProperty[TLength]]] = js.undefined
  
  /**
    * The **`outline-style`** CSS property sets the style of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-style
    */
  var outlineStyle: js.UndefOr[OutlineStyleProperty | js.Array[OutlineStyleProperty]] = js.undefined
  
  /**
    * The **`outline-width`** CSS property sets the thickness of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-width
    */
  var outlineWidth: js.UndefOr[OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]] = js.undefined
  
  /**
    * The **`overflow`** CSS property sets what to do when an element's content is too big to fit in its block formatting context. It is a shorthand for `overflow-x` and `overflow-y`.
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow
    */
  var overflow: js.UndefOr[OverflowProperty | js.Array[OverflowProperty]] = js.undefined
  
  /**
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **56** | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-anchor
    */
  var overflowAnchor: js.UndefOr[OverflowAnchorProperty | js.Array[OverflowAnchorProperty]] = js.undefined
  
  /** **Initial value**: `auto` */
  var overflowBlock: js.UndefOr[OverflowBlockProperty | js.Array[OverflowBlockProperty]] = js.undefined
  
  /**
    * The **`overflow-clip-box`** CSS property specifies relative to which box the clipping happens when there is an overflow. It is short hand for the `overflow-clip-box-inline` and `overflow-clip-box-block` properties.
    *
    * **Initial value**: `padding-box`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **29**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Mozilla/CSS/overflow-clip-box
    */
  var overflowClipBox: js.UndefOr[OverflowClipBoxProperty | js.Array[OverflowClipBoxProperty]] = js.undefined
  
  /** **Initial value**: `auto` */
  var overflowInline: js.UndefOr[OverflowInlineProperty | js.Array[OverflowInlineProperty]] = js.undefined
  
  /**
    * The `**overflow-wrap**` CSS property sets whether the browser should insert line breaks within words to prevent text from overflowing its content box.
    *
    * **Initial value**: `normal`
    *
    * |     Chrome      |      Firefox      |     Safari      |       Edge       |          IE           |
    * | :-------------: | :---------------: | :-------------: | :--------------: | :-------------------: |
    * |     **23**      |      **49**       |     **6.1**     |      **18**      | **5.5** _(word-wrap)_ |
    * | 1 _(word-wrap)_ | 3.5 _(word-wrap)_ | 1 _(word-wrap)_ | 12 _(word-wrap)_ |                       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-wrap
    */
  var overflowWrap: js.UndefOr[OverflowWrapProperty | js.Array[OverflowWrapProperty]] = js.undefined
  
  /**
    * The **`overflow-x`** CSS property sets what shows when content overflows a block-level element's left and right edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **3.5** | **3**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-x
    */
  var overflowX: js.UndefOr[OverflowXProperty | js.Array[OverflowXProperty]] = js.undefined
  
  /**
    * The **`overflow-y`** CSS property sets what shows when content overflows a block-level element's top and bottom edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **1.5** | **3**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-y
    */
  var overflowY: js.UndefOr[OverflowYProperty | js.Array[OverflowYProperty]] = js.undefined
  
  /**
    * The **`overscroll-behavior`** CSS property sets what a browser does when reaching the boundary of a scrolling area. It's a shorthand for `overscroll-behavior-x` and `overscroll-behavior-y`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior
    */
  var overscrollBehavior: js.UndefOr[OverscrollBehaviorProperty | js.Array[OverscrollBehaviorProperty]] = js.undefined
  
  /**
    * The **`overscroll-behavior-x`** CSS property sets the browser's behavior when the horizontal boundary of a scrolling area is reached.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-x
    */
  var overscrollBehaviorX: js.UndefOr[OverscrollBehaviorXProperty | js.Array[OverscrollBehaviorXProperty]] = js.undefined
  
  /**
    * The **`overscroll-behavior-y`** CSS property sets the browser's behavior when the vertical boundary of a scrolling area is reached.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-y
    */
  var overscrollBehaviorY: js.UndefOr[OverscrollBehaviorYProperty | js.Array[OverscrollBehaviorYProperty]] = js.undefined
  
  /**
    * The **`padding-block`** CSS property defines the logical block start and end padding of an element, which maps to physical padding properties depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block
    */
  var paddingBlock: js.UndefOr[PaddingBlockProperty[TLength] | js.Array[PaddingBlockProperty[TLength]]] = js.undefined
  
  /**
    * The **`padding-block-end`** CSS property defines the logical block end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block-end
    */
  var paddingBlockEnd: js.UndefOr[PaddingBlockEndProperty[TLength] | js.Array[PaddingBlockEndProperty[TLength]]] = js.undefined
  
  /**
    * The **`padding-block-start`** CSS property defines the logical block start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block-start
    */
  var paddingBlockStart: js.UndefOr[
    PaddingBlockStartProperty[TLength] | js.Array[PaddingBlockStartProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`padding-bottom`** CSS property sets the height of the padding area on the bottom of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-bottom
    */
  var paddingBottom: js.UndefOr[PaddingBottomProperty[TLength] | js.Array[PaddingBottomProperty[TLength]]] = js.undefined
  
  /**
    * The **`padding-inline`** CSS property defines the logical inline start and end padding of an element, which maps to physical padding properties depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline
    */
  var paddingInline: js.UndefOr[PaddingInlineProperty[TLength] | js.Array[PaddingInlineProperty[TLength]]] = js.undefined
  
  /**
    * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |          Chrome           |        Firefox         |            Safari             | Edge | IE  |
    * | :-----------------------: | :--------------------: | :---------------------------: | :--: | :-: |
    * |          **69**           |         **41**         | **3** _(-webkit-padding-end)_ |  No  | No  |
    * | 2 _(-webkit-padding-end)_ | 3 _(-moz-padding-end)_ |                               |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline-end
    */
  var paddingInlineEnd: js.UndefOr[PaddingInlineEndProperty[TLength] | js.Array[PaddingInlineEndProperty[TLength]]] = js.undefined
  
  /**
    * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |           Chrome            |         Firefox          |             Safari              | Edge | IE  |
    * | :-------------------------: | :----------------------: | :-----------------------------: | :--: | :-: |
    * |           **69**            |          **41**          | **3** _(-webkit-padding-start)_ |  No  | No  |
    * | 2 _(-webkit-padding-start)_ | 3 _(-moz-padding-start)_ |                                 |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline-start
    */
  var paddingInlineStart: js.UndefOr[
    PaddingInlineStartProperty[TLength] | js.Array[PaddingInlineStartProperty[TLength]]
  ] = js.undefined
  
  /**
    * The **`padding-left`** CSS property sets the width of the padding area on the left side of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-left
    */
  var paddingLeft: js.UndefOr[PaddingLeftProperty[TLength] | js.Array[PaddingLeftProperty[TLength]]] = js.undefined
  
  /**
    * The **`padding-right`** CSS property sets the width of the padding area on the right side of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-right
    */
  var paddingRight: js.UndefOr[PaddingRightProperty[TLength] | js.Array[PaddingRightProperty[TLength]]] = js.undefined
  
  /**
    * The **`padding-top`** padding area on the top of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-top
    */
  var paddingTop: js.UndefOr[PaddingTopProperty[TLength] | js.Array[PaddingTopProperty[TLength]]] = js.undefined
  
  /**
    * The **`page-break-after`** CSS property adjusts page breaks _after_ the current element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/page-break-after
    */
  var pageBreakAfter: js.UndefOr[PageBreakAfterProperty | js.Array[PageBreakAfterProperty]] = js.undefined
  
  /**
    * The **`page-break-before`** CSS property adjusts page breaks _before_ the current element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/page-break-before
    */
  var pageBreakBefore: js.UndefOr[PageBreakBeforeProperty | js.Array[PageBreakBeforeProperty]] = js.undefined
  
  /**
    * The **`page-break-inside`** CSS property adjusts page breaks _inside_ the current element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **19**  | **1.3** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/page-break-inside
    */
  var pageBreakInside: js.UndefOr[PageBreakInsideProperty | js.Array[PageBreakInsideProperty]] = js.undefined
  
  /**
    * The **`paint-order`** CSS property lets you control the order in which the fill and stroke (and painting markers) of text content and shapes are drawn.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **35** | **60**  |  Yes   | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/paint-order
    */
  var paintOrder: js.UndefOr[PaintOrderProperty | js.Array[PaintOrderProperty]] = js.undefined
  
  /**
    * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D-positioned element some perspective. Each 3D element with z>0 becomes larger; each 3D-element with z<0 becomes smaller. The strength of the effect is determined by the value of this property.
    *
    * **Initial value**: `none`
    *
    * |  Chrome  | Firefox  | Safari |  Edge  |   IE   |
    * | :------: | :------: | :----: | :----: | :----: |
    * |  **45**  |  **16**  |  Yes   | **12** | **10** |
    * | 12 _-x-_ | 10 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/perspective
    */
  var perspective: js.UndefOr[PerspectiveProperty[TLength] | js.Array[PerspectiveProperty[TLength]]] = js.undefined
  
  /**
    * The **`perspective-origin`** CSS property determines the position at which the viewer is looking. It is used as the _vanishing point_ by the `perspective` property.
    *
    * **Initial value**: `50% 50%`
    *
    * |    Chrome    | Firefox  | Safari |  Edge  |   IE   |
    * | :----------: | :------: | :----: | :----: | :----: |
    * | **12** _-x-_ |  **16**  |  Yes   | **12** | **10** |
    * |              | 10 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/perspective-origin
    */
  var perspectiveOrigin: js.UndefOr[
    PerspectiveOriginProperty[TLength] | js.Array[PerspectiveOriginProperty[TLength]]
  ] = js.undefined
  
  /**
    * The `**place-content**` CSS property is a shorthand for `align-content` and `justify-content`. It can be used in any layout method which utilizes both of these alignment values.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** |   Yes   |  Yes   |  No  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **53**  |  Yes   |  No  | No  |
    *
    * ---
    *
    * _You can only specify a single value if it is valid for both <code>align-content</code> and <code>justify-content</code>_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   | **60**  |  Yes   |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/place-content
    */
  var placeContent: js.UndefOr[PlaceContentProperty | js.Array[PlaceContentProperty]] = js.undefined
  
  /**
    * The **`pointer-events`** CSS property sets under what circumstances (if any) a particular graphic element can become the target of mouse events.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **1**  | **1.5** | **3**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/pointer-events
    */
  var pointerEvents: js.UndefOr[PointerEventsProperty | js.Array[PointerEventsProperty]] = js.undefined
  
  /**
    * The **`position`** CSS property sets how an element is positioned in a document. The `top`, `right`, `bottom`, and `left` properties determine the final location of positioned elements.
    *
    * **Initial value**: `static`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/position
    */
  var position: js.UndefOr[PositionProperty | js.Array[PositionProperty]] = js.undefined
  
  /**
    * The **`quotes`** CSS property sets how quotation marks appear.
    *
    * **Initial value**: depends on user agent
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **11** | **1.5** | **9**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/quotes
    */
  var quotes: js.UndefOr[QuotesProperty | js.Array[QuotesProperty]] = js.undefined
  
  /**
    * The **`resize`** CSS property sets whether an element is resizable, and if so, in which directions.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **1**  |         | **3**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/resize
    */
  var resize: js.UndefOr[ResizeProperty | js.Array[ResizeProperty]] = js.undefined
  
  /**
    * The **`right`** CSS property participates in specifying the horizontal position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/right
    */
  var right: js.UndefOr[RightProperty[TLength] | js.Array[RightProperty[TLength]]] = js.undefined
  
  /**
    * The **`rotate`** CSS property allows you to specify rotation transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   |   n/a   |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/rotate
    */
  var rotate: js.UndefOr[RotateProperty | js.Array[RotateProperty]] = js.undefined
  
  /**
    * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's grid rows.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   | n/a  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * |       Chrome        |       Firefox       |          Safari           |  Edge  | IE  |
    * | :-----------------: | :-----------------: | :-----------------------: | :----: | :-: |
    * |       **66**        |       **61**        | **10.1** _(grid-row-gap)_ | **16** | No  |
    * | 57 _(grid-row-gap)_ | 52 _(grid-row-gap)_ |                           |        |     |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/row-gap
    */
  var rowGap: js.UndefOr[RowGapProperty[TLength] | js.Array[RowGapProperty[TLength]]] = js.undefined
  
  /**
    * The `**ruby-align**` CSS property defines the distribution of the different ruby elements over the base.
    *
    * **Initial value**: `space-around`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **38**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/ruby-align
    */
  var rubyAlign: js.UndefOr[RubyAlignProperty | js.Array[RubyAlignProperty]] = js.undefined
  
  /** **Initial value**: `separate` */
  var rubyMerge: js.UndefOr[RubyMergeProperty | js.Array[RubyMergeProperty]] = js.undefined
  
  /**
    * The `**ruby-position**` CSS property defines the position of a ruby element relatives to its base element. It can be position over the element (`over`), under it (`under`), or between the characters, on their right side (`inter-character`).
    *
    * **Initial value**: `over`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * |   No   | **38**  |   No   | **12** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/ruby-position
    */
  var rubyPosition: js.UndefOr[RubyPositionProperty | js.Array[RubyPositionProperty]] = js.undefined
  
  /**
    * The **`scale`** CSS property allows you to specify scale transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   |   n/a   |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scale
    */
  var scale: js.UndefOr[ScaleProperty | js.Array[ScaleProperty]] = js.undefined
  
  /**
    * The **`scroll-behavior`** CSS property sets the behavior for a scrolling box when scrolling is triggered by the navigation or CSSOM scrolling APIs.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **61** | **36**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-behavior
    */
  var scrollBehavior: js.UndefOr[ScrollBehaviorProperty | js.Array[ScrollBehaviorProperty]] = js.undefined
  
  /**
    * The **`scroll-margin`** property is a shorthand property which sets all of the `scroll-margin` longhands, assigning values much like the `margin` property does for the `margin-*` longhands.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin
    */
  var scrollMargin: js.UndefOr[ScrollMarginProperty[TLength] | js.Array[ScrollMarginProperty[TLength]]] = js.undefined
  
  /**
    * The `scroll-margin-block` property is a shorthand property which sets the scroll-margin longhands in the block dimension.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block
    */
  var scrollMarginBlock: js.UndefOr[
    ScrollMarginBlockProperty[TLength] | js.Array[ScrollMarginBlockProperty[TLength]]
  ] = js.undefined
  
  /**
    * The `scroll-margin-block-end` property defines the margin of the scroll snap area at the end of the block dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block-end
    */
  var scrollMarginBlockEnd: js.UndefOr[
    ScrollMarginBlockEndProperty[TLength] | js.Array[ScrollMarginBlockEndProperty[TLength]]
  ] = js.undefined
  
  /**
    * The `scroll-margin-block-start` property defines the margin of the scroll snap area at the start of the block dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block-start
    */
  var scrollMarginBlockStart: js.UndefOr[
    ScrollMarginBlockStartProperty[TLength] | js.Array[ScrollMarginBlockStartProperty[TLength]]
  ] = js.undefined
  
  /**
    * The `scroll-margin-bottom` property defines the bottom margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-bottom
    */
  var scrollMarginBottom: js.UndefOr[
    ScrollMarginBottomProperty[TLength] | js.Array[ScrollMarginBottomProperty[TLength]]
  ] = js.undefined
  
  /**
    * The `scroll-margin-inline-end` property defines the margin of the scroll snap area at the end of the inline dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline-end
    */
  var scrollMarginInlineEnd: js.UndefOr[
    ScrollMarginInlineEndProperty[TLength] | js.Array[ScrollMarginInlineEndProperty[TLength]]
  ] = js.undefined
  
  /**
    * The `scroll-margin-inline-start` property defines the margin of the scroll snap area at the start of the inline dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline-start
    */
  var scrollMarginInlineStart: js.UndefOr[
    ScrollMarginInlineStartProperty[TLength] | js.Array[ScrollMarginInlineStartProperty[TLength]]
  ] = js.undefined
  
  /**
    * The `scroll-margin-left` property defines the left margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-left
    */
  var scrollMarginLeft: js.UndefOr[ScrollMarginLeftProperty[TLength] | js.Array[ScrollMarginLeftProperty[TLength]]] = js.undefined
  
  /**
    * The `scroll-margin-right` property defines the right margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-right
    */
  var scrollMarginRight: js.UndefOr[
    ScrollMarginRightProperty[TLength] | js.Array[ScrollMarginRightProperty[TLength]]
  ] = js.undefined
  
  /**
    * The `scroll-margin-top` property defines the top margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-top
    */
  var scrollMarginTop: js.UndefOr[ScrollMarginTopProperty[TLength] | js.Array[ScrollMarginTopProperty[TLength]]] = js.undefined
  
  /**
    * The scroll-padding property is a shorthand property which sets all of the scroll-padding longhands, assigning values much like the padding property does for the padding-\* longhands.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding
    */
  var scrollPadding: js.UndefOr[ScrollPaddingProperty[TLength] | js.Array[ScrollPaddingProperty[TLength]]] = js.undefined
  
  /**
    * The `scroll-padding-block` property is a shorthand property which sets the scroll-padding longhands for the block dimension.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    |   No   |  No  | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block
    */
  var scrollPaddingBlock: js.UndefOr[
    ScrollPaddingBlockProperty[TLength] | js.Array[ScrollPaddingBlockProperty[TLength]]
  ] = js.undefined
  
  /**
    * The `scroll-padding-block-end` property defines offsets for the end edge in the block dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block-end
    */
  var scrollPaddingBlockEnd: js.UndefOr[
    ScrollPaddingBlockEndProperty[TLength] | js.Array[ScrollPaddingBlockEndProperty[TLength]]
  ] = js.undefined
  
  /**
    * The `scroll-padding-block-start` property defines offsets for the start edge in the block dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block-start
    */
  var scrollPaddingBlockStart: js.UndefOr[
    ScrollPaddingBlockStartProperty[TLength] | js.Array[ScrollPaddingBlockStartProperty[TLength]]
  ] = js.undefined
  
  /**
    * The `scroll-padding-bottom` property defines offsets for the bottom of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-bottom
    */
  var scrollPaddingBottom: js.UndefOr[
    ScrollPaddingBottomProperty[TLength] | js.Array[ScrollPaddingBottomProperty[TLength]]
  ] = js.undefined
  
  /**
    * The `scroll-padding-inline` property is a shorthand property which sets the scroll-padding longhands for the inline dimension.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    |   No   |  No  | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline
    */
  var scrollPaddingInline: js.UndefOr[
    ScrollPaddingInlineProperty[TLength] | js.Array[ScrollPaddingInlineProperty[TLength]]
  ] = js.undefined
  
  /**
    * The `scroll-padding-inline-end` property defines offsets for the end edge in the inline dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline-end
    */
  var scrollPaddingInlineEnd: js.UndefOr[
    ScrollPaddingInlineEndProperty[TLength] | js.Array[ScrollPaddingInlineEndProperty[TLength]]
  ] = js.undefined
  
  /**
    * The `scroll-padding-inline-start` property defines offsets for the start edge in the inline dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline-start
    */
  var scrollPaddingInlineStart: js.UndefOr[
    ScrollPaddingInlineStartProperty[TLength] | js.Array[ScrollPaddingInlineStartProperty[TLength]]
  ] = js.undefined
  
  /**
    * The `scroll-padding-left` property defines offsets for the left of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-left
    */
  var scrollPaddingLeft: js.UndefOr[
    ScrollPaddingLeftProperty[TLength] | js.Array[ScrollPaddingLeftProperty[TLength]]
  ] = js.undefined
  
  /**
    * The `scroll-padding-right` property defines offsets for the right of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-right
    */
  var scrollPaddingRight: js.UndefOr[
    ScrollPaddingRightProperty[TLength] | js.Array[ScrollPaddingRightProperty[TLength]]
  ] = js.undefined
  
  /**
    * The `scroll-padding-top` property defines offsets for the top of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-top
    */
  var scrollPaddingTop: js.UndefOr[ScrollPaddingTopProperty[TLength] | js.Array[ScrollPaddingTopProperty[TLength]]] = js.undefined
  
  /**
    * The `scroll-snap-align` property specifies the box’s snap position as an alignment of its snap area (as the alignment subject) within its snap container’s snapport (as the alignment container). The two values specify the snapping alignment in the block axis and inline axis, respectively. If only one value is specified, the second value defaults to the same value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-align
    */
  var scrollSnapAlign: js.UndefOr[ScrollSnapAlignProperty | js.Array[ScrollSnapAlignProperty]] = js.undefined
  
  /**
    * The **`scroll-snap-type`** CSS property sets how strictly snap points are enforced on the scroll container in case there is one.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |     Edge     |      IE      |
    * | :----: | :-----: | :-----: | :----------: | :----------: |
    * | **69** | **39**  | **11**  | **12** _-x-_ | **10** _-x-_ |
    * |        |         | 9 _-x-_ |              |              |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-type
    */
  var scrollSnapType: js.UndefOr[ScrollSnapTypeProperty | js.Array[ScrollSnapTypeProperty]] = js.undefined
  
  /**
    * The **`scrollbar-color`** CSS property sets the color of the scrollbar track and thumb.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **64**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scrollbar-color
    */
  var scrollbarColor: js.UndefOr[ScrollbarColorProperty | js.Array[ScrollbarColorProperty]] = js.undefined
  
  /**
    * The `scrollbar-width` property allows the author to set the maximum thickness of an element’s scrollbars when they are shown.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **64**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scrollbar-width
    */
  var scrollbarWidth: js.UndefOr[ScrollbarWidthProperty | js.Array[ScrollbarWidthProperty]] = js.undefined
  
  /**
    * The **`shape-image-threshold`** CSS property sets the alpha channel threshold used to extract the shape using an image as the value for `shape-outside`.
    *
    * **Initial value**: `0.0`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **37** | **62**  | **10.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-image-threshold
    */
  var shapeImageThreshold: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  
  /**
    * The **`shape-margin`** CSS property sets a margin for a CSS shape created using `shape-outside`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |     Safari     | Edge | IE  |
    * | :----: | :-----: | :------------: | :--: | :-: |
    * | **37** | **62**  | **10.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-margin
    */
  var shapeMargin: js.UndefOr[ShapeMarginProperty[TLength] | js.Array[ShapeMarginProperty[TLength]]] = js.undefined
  
  /**
    * The **`shape-outside`** CSS property defines a shape—which may be non-rectangular—around which adjacent inline content should wrap. By default, inline content wraps around its margin box; `shape-outside` provides a way to customize this wrapping, making it possible to wrap text around complex objects rather than simple boxes.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **37** | **62**  | **10.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-outside
    */
  var shapeOutside: js.UndefOr[ShapeOutsideProperty | js.Array[ShapeOutsideProperty]] = js.undefined
  
  /**
    * The **`tab-size`** CSS property is used to customize the width of a tab (`U+0009`) character.
    *
    * **Initial value**: `8`
    *
    * | Chrome |   Firefox   | Safari  | Edge | IE  |
    * | :----: | :---------: | :-----: | :--: | :-: |
    * | **21** | **4** _-x-_ | **6.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/tab-size
    */
  var tabSize: js.UndefOr[TabSizeProperty[TLength] | js.Array[TabSizeProperty[TLength]]] = js.undefined
  
  /**
    * The **`table-layout`** CSS property sets the algorithm used to lay out `<table>` cells, rows, and columns.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **14** |  **1**  | **1**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/table-layout
    */
  var tableLayout: js.UndefOr[TableLayoutProperty | js.Array[TableLayoutProperty]] = js.undefined
  
  /**
    * The **`text-align`** CSS property sets the horizontal alignment of an inline or table-cell box. This means it works like `vertical-align` but in the horizontal direction.
    *
    * **Initial value**: `start`, or a nameless value that acts as `left` if _direction_ is `ltr`, `right` if _direction_ is `rtl` if `start` is not supported by the browser.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-align
    */
  var textAlign: js.UndefOr[TextAlignProperty | js.Array[TextAlignProperty]] = js.undefined
  
  /**
    * The **`text-align-last`** CSS property sets how the last line of a block or a line, right before a forced line break, is aligned.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **47** | **49**  |   No   | **12** | Yes |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-align-last
    */
  var textAlignLast: js.UndefOr[TextAlignLastProperty | js.Array[TextAlignLastProperty]] = js.undefined
  
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |                   IE                   |
    * | :----: | :-----: | :----: | :----: | :------------------------------------: |
    * | **48** | **48**  |  Yes   | **15** | **11** _(-ms-text-combine-horizontal)_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-combine-upright
    */
  var textCombineUpright: js.UndefOr[TextCombineUprightProperty | js.Array[TextCombineUprightProperty]] = js.undefined
  
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **36**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-color
    */
  var textDecorationColor: js.UndefOr[TextDecorationColorProperty | js.Array[TextDecorationColorProperty]] = js.undefined
  
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **36**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-line
    */
  var textDecorationLine: js.UndefOr[TextDecorationLineProperty | js.Array[TextDecorationLineProperty]] = js.undefined
  
  /**
    * The **`text-decoration-skip`** CSS property sets what parts of an element’s content any text decoration affecting the element must skip over. It controls all text decoration lines drawn by the element and also any text decoration lines drawn by its ancestors.
    *
    * **Initial value**: `objects`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | 57-64  |   No    | **12.1** |  No  | No  |
    * |        |         | 8 _-x-_  |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-skip
    */
  var textDecorationSkip: js.UndefOr[TextDecorationSkipProperty | js.Array[TextDecorationSkipProperty]] = js.undefined
  
  /**
    * The **`text-decoration-skip-ink`** CSS property specifies how overlines and underlines are drawn when they pass over glyph ascenders and descenders.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **64** |   No    |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-skip-ink
    */
  var textDecorationSkipInk: js.UndefOr[TextDecorationSkipInkProperty | js.Array[TextDecorationSkipInkProperty]] = js.undefined
  
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Initial value**: `solid`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **36**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-style
    */
  var textDecorationStyle: js.UndefOr[TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]] = js.undefined
  
  /**
    * The **`text-emphasis-color`** CSS property sets the color of emphasis marks. This value can also be set using the `text-emphasis` shorthand.
    *
    * **Initial value**: `currentcolor`
    *
    * |    Chrome    | Firefox |    Safari     | Edge | IE  |
    * | :----------: | :-----: | :-----------: | :--: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-color
    */
  var textEmphasisColor: js.UndefOr[TextEmphasisColorProperty | js.Array[TextEmphasisColorProperty]] = js.undefined
  
  /**
    * The **`text-emphasis-position`** CSS property sets where emphasis marks are drawn. Like ruby text, if there isn't enough room for emphasis marks, the line height is increased.
    *
    * **Initial value**: `over right`
    *
    * |    Chrome    | Firefox |    Safari     | Edge | IE  |
    * | :----------: | :-----: | :-----------: | :--: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-position
    */
  var textEmphasisPosition: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.undefined
  
  /**
    * The **`text-emphasis-style`** CSS property sets the appearance of emphasis marks. It can also be set, and reset, using the `text-emphasis` shorthand.
    *
    * **Initial value**: `none`
    *
    * |    Chrome    | Firefox |    Safari     | Edge | IE  |
    * | :----------: | :-----: | :-----------: | :--: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-style
    */
  var textEmphasisStyle: js.UndefOr[TextEmphasisStyleProperty | js.Array[TextEmphasisStyleProperty]] = js.undefined
  
  /**
    * The **`text-indent`** CSS property sets the length of empty space (indentation) that is put before lines of text in a block.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-indent
    */
  var textIndent: js.UndefOr[TextIndentProperty[TLength] | js.Array[TextIndentProperty[TLength]]] = js.undefined
  
  /**
    * The **`text-justify`** CSS property sets what type of justification should be applied to text when `text-align``: justify;` is set on an element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * |  n/a   | **55**  |   No   | **14** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-justify
    */
  var textJustify: js.UndefOr[TextJustifyProperty | js.Array[TextJustifyProperty]] = js.undefined
  
  /**
    * The **`text-orientation`** CSS property sets the orientation of the text characters in a line. It only affects text in vertical mode (when `writing-mode` is not `horizontal-tb`). It is useful for controlling the display of languages that use vertical script, and also for making vertical table headers.
    *
    * **Initial value**: `mixed`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **48** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-orientation
    */
  var textOrientation: js.UndefOr[TextOrientationProperty | js.Array[TextOrientationProperty]] = js.undefined
  
  /**
    * The **`text-overflow`** CSS property sets how hidden overflow content is signaled to users. It can be clipped, display an ellipsis ('`…`'), or display a custom string.
    *
    * **Initial value**: `clip`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **7**  | **1.3** | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-overflow
    */
  var textOverflow: js.UndefOr[TextOverflowProperty | js.Array[TextOverflowProperty]] = js.undefined
  
  /**
    * The **`text-rendering`** CSS property provides information to the rendering engine about what to optimize for when rendering text.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **4**  |  **1**  | **5**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-rendering
    */
  var textRendering: js.UndefOr[TextRenderingProperty | js.Array[TextRenderingProperty]] = js.undefined
  
  /**
    * The **`text-shadow`** CSS property adds shadows to text. It accepts a comma-separated list of shadows to be applied to the text and any of its `decorations`. Each shadow is described by some combination of X and Y offsets from the element, blur radius, and color.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE   |
    * | :----: | :-----: | :-----: | :----: | :----: |
    * | **2**  | **3.5** | **1.1** | **12** | **10** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-shadow
    */
  var textShadow: js.UndefOr[TextShadowProperty | js.Array[TextShadowProperty]] = js.undefined
  
  /**
    * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
    *
    * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
    *
    * | Chrome | Firefox | Safari |     Edge     | IE  |
    * | :----: | :-----: | :----: | :----------: | :-: |
    * | **54** |   No    |   No   | **12** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-size-adjust
    */
  var textSizeAdjust: js.UndefOr[TextSizeAdjustProperty | js.Array[TextSizeAdjustProperty]] = js.undefined
  
  /**
    * The **`text-transform`** CSS property specifies how to capitalize an element's text. It can be used to make text appear in all-uppercase or all-lowercase, or with each word capitalized. It also can help improve legibility for ruby
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-transform
    */
  var textTransform: js.UndefOr[TextTransformProperty | js.Array[TextTransformProperty]] = js.undefined
  
  /**
    * The **`text-underline-position`** CSS property specifies the position of the underline which is set using the `text-decoration` property's `underline` value.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **33** |   No    |   No   | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-underline-position
    */
  var textUnderlinePosition: js.UndefOr[TextUnderlinePositionProperty | js.Array[TextUnderlinePositionProperty]] = js.undefined
  
  /**
    * The **`top`** CSS property participates in specifying the vertical position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/top
    */
  var top: js.UndefOr[TopProperty[TLength] | js.Array[TopProperty[TLength]]] = js.undefined
  
  /**
    * The **`touch-action`** CSS property sets how a region can be manipulated by a touchscreen user (for example, by zooming features built into the browser).
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |    IE    |
    * | :----: | :-----: | :----: | :----: | :------: |
    * | **36** | **52**  |   No   | **12** |  **11**  |
    * |        |         |        |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/touch-action
    */
  var touchAction: js.UndefOr[TouchActionProperty | js.Array[TouchActionProperty]] = js.undefined
  
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari   |  Edge  |   IE    |
    * | :----: | :-----: | :-------: | :----: | :-----: |
    * | **36** | **16**  |   **9**   | **12** | **10**  |
    * |        |         | 3.1 _-x-_ |        | 9 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform
    */
  var transform: js.UndefOr[TransformProperty | js.Array[TransformProperty]] = js.undefined
  
  /**
    * The **`transform-box`** CSS property defines the layout box to which the `transform` and `transform-origin` properties relate.
    *
    * **Initial value**: `border-box `
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **64** | **55**  |  n/a   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform-box
    */
  var transformBox: js.UndefOr[TransformBoxProperty | js.Array[TransformBoxProperty]] = js.undefined
  
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Initial value**: `50% 50% 0`
    *
    * | Chrome |  Firefox  |    Safari     |  Edge  |   IE    |
    * | :----: | :-------: | :-----------: | :----: | :-----: |
    * |  Yes   |  **16**   | **3.1** _-x-_ | **12** | **10**  |
    * |        | 3.5 _-x-_ |               |        | 9 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform-origin
    */
  var transformOrigin: js.UndefOr[TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]] = js.undefined
  
  /**
    * The **`transform-style`** CSS property sets whether children of an element are positioned in the 3D space or are flattened in the plane of the element.
    *
    * **Initial value**: `flat`
    *
    * |    Chrome    | Firefox  | Safari |  Edge  | IE  |
    * | :----------: | :------: | :----: | :----: | :-: |
    * | **12** _-x-_ |  **16**  |  Yes   | **12** | No  |
    * |              | 10 _-x-_ |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform-style
    */
  var transformStyle: js.UndefOr[TransformStyleProperty | js.Array[TransformStyleProperty]] = js.undefined
  
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Initial value**: `0s`
    *
    * | Chrome  | Firefox |   Safari    |  Edge  |   IE   |
    * | :-----: | :-----: | :---------: | :----: | :----: |
    * | **26**  | **16**  | **3** _-x-_ | **12** | **10** |
    * | 1 _-x-_ | 4 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-delay
    */
  var transitionDelay: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.undefined
  
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Initial value**: `0s`
    *
    * | Chrome  | Firefox |   Safari    |  Edge  |   IE   |
    * | :-----: | :-----: | :---------: | :----: | :----: |
    * | **26**  | **16**  | **3** _-x-_ | **12** | **10** |
    * | 1 _-x-_ | 4 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-duration
    */
  var transitionDuration: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.undefined
  
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Initial value**: all
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **26** | **16**  |  Yes   | **12** | **10** |
    * |        | 4 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-property
    */
  var transitionProperty: js.UndefOr[TransitionPropertyProperty | js.Array[TransitionPropertyProperty]] = js.undefined
  
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Initial value**: `ease`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **26** | **16**  |  Yes   | **12** | **10** |
    * |        | 4 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-timing-function
    */
  var transitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]] = js.undefined
  
  /**
    * The **`translate`** CSS property allows you to specify translation transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   |   n/a   |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/translate
    */
  var translate: js.UndefOr[TranslateProperty[TLength] | js.Array[TranslateProperty[TLength]]] = js.undefined
  
  /**
    * The **`unicode-bidi`** CSS property, together with the `direction` property, determines how bidirectional text in a document is handled. For example, if a block of content contains both left-to-right and right-to-left text, the user-agent uses a complex Unicode algorithm to decide how to display the text. The `unicode-bidi` property overrides this algorithm and allows the developer to control the text embedding.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE    |
    * | :----: | :-----: | :-----: | :----: | :-----: |
    * | **2**  |  **1**  | **1.3** | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/unicode-bidi
    */
  var unicodeBidi: js.UndefOr[UnicodeBidiProperty | js.Array[UnicodeBidiProperty]] = js.undefined
  
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Initial value**: `auto`
    *
    * | Chrome  |   Firefox   |    Safari     |     Edge     |   IE   |
    * | :-----: | :---------: | :-----------: | :----------: | :----: |
    * | **54**  | **1** _-x-_ | **3.1** _-x-_ | **12** _-x-_ | **10** |
    * | 6 _-x-_ |             |               |              |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/user-select
    */
  var userSelect: js.UndefOr[UserSelectProperty | js.Array[UserSelectProperty]] = js.undefined
  
  /**
    * The **`vertical-align`** CSS property sets vertical alignment of an inline or table-cell box.
    *
    * **Initial value**: `baseline`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/vertical-align
    */
  var verticalAlign: js.UndefOr[VerticalAlignProperty[TLength] | js.Array[VerticalAlignProperty[TLength]]] = js.undefined
  
  /**
    * The **`visibility`** CSS property shows or hides an element without changing the layout of a document. The property can also hide rows or columns in a `<table>`.
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/visibility
    */
  var visibility: js.UndefOr[VisibilityProperty | js.Array[VisibilityProperty]] = js.undefined
  
  /**
    * The **`white-space`** CSS property sets how white space inside an element is handled.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/white-space
    */
  var whiteSpace: js.UndefOr[WhiteSpaceProperty | js.Array[WhiteSpaceProperty]] = js.undefined
  
  /**
    * The **`widows`** CSS property sets the minimum number of lines in a block container that must be shown at the _top_ of a page, region, or column.
    *
    * **Initial value**: `2`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **25** |   No    |   No   | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/widows
    */
  var widows: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  
  /**
    * The **`width`** CSS property sets an element's width. By default it sets the width of the content area, but if `box-sizing` is set to `border-box`, it sets the width of the border area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * |  Yes   |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/width
    */
  var width: js.UndefOr[WidthProperty[TLength] | js.Array[WidthProperty[TLength]]] = js.undefined
  
  /**
    * The **`will-change`** CSS property hints to browsers how an element is expected to change. Browsers may set up optimizations before an element is actually changed. These kinds of optimizations can increase the responsiveness of a page by doing potentially expensive work before they are actually required.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  | Edge | IE  |
    * | :----: | :-----: | :-----: | :--: | :-: |
    * | **36** | **36**  | **9.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/will-change
    */
  var willChange: js.UndefOr[WillChangeProperty | js.Array[WillChangeProperty]] = js.undefined
  
  /**
    * The **`word-break`** CSS property sets whether line breaks appear wherever the text would otherwise overflow its content box.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  | **15**  |  Yes   | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/word-break
    */
  var wordBreak: js.UndefOr[WordBreakProperty | js.Array[WordBreakProperty]] = js.undefined
  
  /**
    * The **`word-spacing`** CSS property sets the length of space between words and between tags.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/word-spacing
    */
  var wordSpacing: js.UndefOr[WordSpacingProperty[TLength] | js.Array[WordSpacingProperty[TLength]]] = js.undefined
  
  /**
    * The `**overflow-wrap**` CSS property sets whether the browser should insert line breaks within words to prevent text from overflowing its content box.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  | **3.5** | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-wrap
    */
  var wordWrap: js.UndefOr[WordWrapProperty | js.Array[WordWrapProperty]] = js.undefined
  
  /**
    * The **`writing-mode`** CSS property sets whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
    *
    * **Initial value**: `horizontal-tb`
    *
    * |   Chrome    | Firefox |    Safari     |  Edge  |     IE      |
    * | :---------: | :-----: | :-----------: | :----: | :---------: |
    * | **8** _-x-_ | **41**  | **5.1** _-x-_ | **12** | **9** _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/writing-mode
    */
  var writingMode: js.UndefOr[WritingModeProperty | js.Array[WritingModeProperty]] = js.undefined
  
  /**
    * The **`z-index`** CSS property sets the z-order of a positioned element and its descendants or flex items. Overlapping elements with a larger z-index cover those with a smaller one.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/z-index
    */
  var zIndex: js.UndefOr[ZIndexProperty | js.Array[ZIndexProperty]] = js.undefined
  
  /**
    * The non-standard **`zoom`** CSS property can be used to control the magnification level of an element. `transform: scale()` should be used instead of this property, if possible. However, unlike CSS Transforms, `zoom` affects the layout size of the element.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * |  Yes   |   No    | **4**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/zoom
    */
  var zoom: js.UndefOr[ZoomProperty | js.Array[ZoomProperty]] = js.undefined
}
object StandardLonghandPropertiesFallback {
  
  inline def apply[TLength](): StandardLonghandPropertiesFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardLonghandPropertiesFallback[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StandardLonghandPropertiesFallback[?], TLength] (val x: Self & StandardLonghandPropertiesFallback[TLength]) extends AnyVal {
    
    inline def setAlignContent(value: AlignContentProperty | js.Array[AlignContentProperty]): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
    
    inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
    
    inline def setAlignContentVarargs(value: AlignContentProperty*): Self = StObject.set(x, "alignContent", js.Array(value*))
    
    inline def setAlignItems(value: AlignItemsProperty | js.Array[AlignItemsProperty]): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
    
    inline def setAlignItemsVarargs(value: AlignItemsProperty*): Self = StObject.set(x, "alignItems", js.Array(value*))
    
    inline def setAlignSelf(value: AlignSelfProperty | js.Array[AlignSelfProperty]): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
    
    inline def setAlignSelfVarargs(value: AlignSelfProperty*): Self = StObject.set(x, "alignSelf", js.Array(value*))
    
    inline def setAnimationDelay(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "animationDelay", value.asInstanceOf[js.Any])
    
    inline def setAnimationDelayUndefined: Self = StObject.set(x, "animationDelay", js.undefined)
    
    inline def setAnimationDelayVarargs(value: GlobalsString*): Self = StObject.set(x, "animationDelay", js.Array(value*))
    
    inline def setAnimationDirection(value: AnimationDirectionProperty | js.Array[AnimationDirectionProperty]): Self = StObject.set(x, "animationDirection", value.asInstanceOf[js.Any])
    
    inline def setAnimationDirectionUndefined: Self = StObject.set(x, "animationDirection", js.undefined)
    
    inline def setAnimationDirectionVarargs(value: AnimationDirectionProperty*): Self = StObject.set(x, "animationDirection", js.Array(value*))
    
    inline def setAnimationDuration(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAnimationDurationVarargs(value: GlobalsString*): Self = StObject.set(x, "animationDuration", js.Array(value*))
    
    inline def setAnimationFillMode(value: AnimationFillModeProperty | js.Array[AnimationFillModeProperty]): Self = StObject.set(x, "animationFillMode", value.asInstanceOf[js.Any])
    
    inline def setAnimationFillModeUndefined: Self = StObject.set(x, "animationFillMode", js.undefined)
    
    inline def setAnimationFillModeVarargs(value: AnimationFillModeProperty*): Self = StObject.set(x, "animationFillMode", js.Array(value*))
    
    inline def setAnimationIterationCount(value: AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]): Self = StObject.set(x, "animationIterationCount", value.asInstanceOf[js.Any])
    
    inline def setAnimationIterationCountUndefined: Self = StObject.set(x, "animationIterationCount", js.undefined)
    
    inline def setAnimationIterationCountVarargs(value: AnimationIterationCountProperty*): Self = StObject.set(x, "animationIterationCount", js.Array(value*))
    
    inline def setAnimationName(value: AnimationNameProperty | js.Array[AnimationNameProperty]): Self = StObject.set(x, "animationName", value.asInstanceOf[js.Any])
    
    inline def setAnimationNameUndefined: Self = StObject.set(x, "animationName", js.undefined)
    
    inline def setAnimationNameVarargs(value: AnimationNameProperty*): Self = StObject.set(x, "animationName", js.Array(value*))
    
    inline def setAnimationPlayState(value: AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]): Self = StObject.set(x, "animationPlayState", value.asInstanceOf[js.Any])
    
    inline def setAnimationPlayStateUndefined: Self = StObject.set(x, "animationPlayState", js.undefined)
    
    inline def setAnimationPlayStateVarargs(value: AnimationPlayStateProperty*): Self = StObject.set(x, "animationPlayState", js.Array(value*))
    
    inline def setAnimationTimingFunction(value: AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]): Self = StObject.set(x, "animationTimingFunction", value.asInstanceOf[js.Any])
    
    inline def setAnimationTimingFunctionUndefined: Self = StObject.set(x, "animationTimingFunction", js.undefined)
    
    inline def setAnimationTimingFunctionVarargs(value: AnimationTimingFunctionProperty*): Self = StObject.set(x, "animationTimingFunction", js.Array(value*))
    
    inline def setAppearance(value: AppearanceProperty | js.Array[AppearanceProperty]): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    inline def setAppearanceVarargs(value: AppearanceProperty*): Self = StObject.set(x, "appearance", js.Array(value*))
    
    inline def setBackdropFilter(value: BackdropFilterProperty | js.Array[BackdropFilterProperty]): Self = StObject.set(x, "backdropFilter", value.asInstanceOf[js.Any])
    
    inline def setBackdropFilterUndefined: Self = StObject.set(x, "backdropFilter", js.undefined)
    
    inline def setBackdropFilterVarargs(value: BackdropFilterProperty*): Self = StObject.set(x, "backdropFilter", js.Array(value*))
    
    inline def setBackfaceVisibility(value: BackfaceVisibilityProperty | js.Array[BackfaceVisibilityProperty]): Self = StObject.set(x, "backfaceVisibility", value.asInstanceOf[js.Any])
    
    inline def setBackfaceVisibilityUndefined: Self = StObject.set(x, "backfaceVisibility", js.undefined)
    
    inline def setBackfaceVisibilityVarargs(value: BackfaceVisibilityProperty*): Self = StObject.set(x, "backfaceVisibility", js.Array(value*))
    
    inline def setBackgroundAttachment(value: BackgroundAttachmentProperty | js.Array[BackgroundAttachmentProperty]): Self = StObject.set(x, "backgroundAttachment", value.asInstanceOf[js.Any])
    
    inline def setBackgroundAttachmentUndefined: Self = StObject.set(x, "backgroundAttachment", js.undefined)
    
    inline def setBackgroundAttachmentVarargs(value: BackgroundAttachmentProperty*): Self = StObject.set(x, "backgroundAttachment", js.Array(value*))
    
    inline def setBackgroundBlendMode(value: BackgroundBlendModeProperty | js.Array[BackgroundBlendModeProperty]): Self = StObject.set(x, "backgroundBlendMode", value.asInstanceOf[js.Any])
    
    inline def setBackgroundBlendModeUndefined: Self = StObject.set(x, "backgroundBlendMode", js.undefined)
    
    inline def setBackgroundBlendModeVarargs(value: BackgroundBlendModeProperty*): Self = StObject.set(x, "backgroundBlendMode", js.Array(value*))
    
    inline def setBackgroundClip(value: BackgroundClipProperty | js.Array[BackgroundClipProperty]): Self = StObject.set(x, "backgroundClip", value.asInstanceOf[js.Any])
    
    inline def setBackgroundClipUndefined: Self = StObject.set(x, "backgroundClip", js.undefined)
    
    inline def setBackgroundClipVarargs(value: BackgroundClipProperty*): Self = StObject.set(x, "backgroundClip", js.Array(value*))
    
    inline def setBackgroundColor(value: BackgroundColorProperty | js.Array[BackgroundColorProperty]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundColorVarargs(value: BackgroundColorProperty*): Self = StObject.set(x, "backgroundColor", js.Array(value*))
    
    inline def setBackgroundImage(value: BackgroundImageProperty | js.Array[BackgroundImageProperty]): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    inline def setBackgroundImageVarargs(value: BackgroundImageProperty*): Self = StObject.set(x, "backgroundImage", js.Array(value*))
    
    inline def setBackgroundOrigin(value: BackgroundOriginProperty | js.Array[BackgroundOriginProperty]): Self = StObject.set(x, "backgroundOrigin", value.asInstanceOf[js.Any])
    
    inline def setBackgroundOriginUndefined: Self = StObject.set(x, "backgroundOrigin", js.undefined)
    
    inline def setBackgroundOriginVarargs(value: BackgroundOriginProperty*): Self = StObject.set(x, "backgroundOrigin", js.Array(value*))
    
    inline def setBackgroundPosition(value: BackgroundPositionProperty[TLength] | js.Array[BackgroundPositionProperty[TLength]]): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
    
    inline def setBackgroundPositionVarargs(value: BackgroundPositionProperty[TLength]*): Self = StObject.set(x, "backgroundPosition", js.Array(value*))
    
    inline def setBackgroundPositionX(value: BackgroundPositionXProperty[TLength] | js.Array[BackgroundPositionXProperty[TLength]]): Self = StObject.set(x, "backgroundPositionX", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPositionXUndefined: Self = StObject.set(x, "backgroundPositionX", js.undefined)
    
    inline def setBackgroundPositionXVarargs(value: BackgroundPositionXProperty[TLength]*): Self = StObject.set(x, "backgroundPositionX", js.Array(value*))
    
    inline def setBackgroundPositionY(value: BackgroundPositionYProperty[TLength] | js.Array[BackgroundPositionYProperty[TLength]]): Self = StObject.set(x, "backgroundPositionY", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPositionYUndefined: Self = StObject.set(x, "backgroundPositionY", js.undefined)
    
    inline def setBackgroundPositionYVarargs(value: BackgroundPositionYProperty[TLength]*): Self = StObject.set(x, "backgroundPositionY", js.Array(value*))
    
    inline def setBackgroundRepeat(value: BackgroundRepeatProperty | js.Array[BackgroundRepeatProperty]): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
    
    inline def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
    
    inline def setBackgroundRepeatVarargs(value: BackgroundRepeatProperty*): Self = StObject.set(x, "backgroundRepeat", js.Array(value*))
    
    inline def setBackgroundSize(value: BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
    
    inline def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
    
    inline def setBackgroundSizeVarargs(value: BackgroundSizeProperty[TLength]*): Self = StObject.set(x, "backgroundSize", js.Array(value*))
    
    inline def setBlockOverflow(value: BlockOverflowProperty | js.Array[BlockOverflowProperty]): Self = StObject.set(x, "blockOverflow", value.asInstanceOf[js.Any])
    
    inline def setBlockOverflowUndefined: Self = StObject.set(x, "blockOverflow", js.undefined)
    
    inline def setBlockOverflowVarargs(value: BlockOverflowProperty*): Self = StObject.set(x, "blockOverflow", js.Array(value*))
    
    inline def setBlockSize(value: BlockSizeProperty[TLength] | js.Array[BlockSizeProperty[TLength]]): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
    
    inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
    
    inline def setBlockSizeVarargs(value: BlockSizeProperty[TLength]*): Self = StObject.set(x, "blockSize", js.Array(value*))
    
    inline def setBorderBlockColor(value: BorderBlockColorProperty | js.Array[BorderBlockColorProperty]): Self = StObject.set(x, "borderBlockColor", value.asInstanceOf[js.Any])
    
    inline def setBorderBlockColorUndefined: Self = StObject.set(x, "borderBlockColor", js.undefined)
    
    inline def setBorderBlockColorVarargs(value: BorderBlockColorProperty*): Self = StObject.set(x, "borderBlockColor", js.Array(value*))
    
    inline def setBorderBlockEndColor(value: BorderBlockEndColorProperty | js.Array[BorderBlockEndColorProperty]): Self = StObject.set(x, "borderBlockEndColor", value.asInstanceOf[js.Any])
    
    inline def setBorderBlockEndColorUndefined: Self = StObject.set(x, "borderBlockEndColor", js.undefined)
    
    inline def setBorderBlockEndColorVarargs(value: BorderBlockEndColorProperty*): Self = StObject.set(x, "borderBlockEndColor", js.Array(value*))
    
    inline def setBorderBlockEndStyle(value: BorderBlockEndStyleProperty | js.Array[BorderBlockEndStyleProperty]): Self = StObject.set(x, "borderBlockEndStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderBlockEndStyleUndefined: Self = StObject.set(x, "borderBlockEndStyle", js.undefined)
    
    inline def setBorderBlockEndStyleVarargs(value: BorderBlockEndStyleProperty*): Self = StObject.set(x, "borderBlockEndStyle", js.Array(value*))
    
    inline def setBorderBlockEndWidth(value: BorderBlockEndWidthProperty[TLength] | js.Array[BorderBlockEndWidthProperty[TLength]]): Self = StObject.set(x, "borderBlockEndWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderBlockEndWidthUndefined: Self = StObject.set(x, "borderBlockEndWidth", js.undefined)
    
    inline def setBorderBlockEndWidthVarargs(value: BorderBlockEndWidthProperty[TLength]*): Self = StObject.set(x, "borderBlockEndWidth", js.Array(value*))
    
    inline def setBorderBlockStartColor(value: BorderBlockStartColorProperty | js.Array[BorderBlockStartColorProperty]): Self = StObject.set(x, "borderBlockStartColor", value.asInstanceOf[js.Any])
    
    inline def setBorderBlockStartColorUndefined: Self = StObject.set(x, "borderBlockStartColor", js.undefined)
    
    inline def setBorderBlockStartColorVarargs(value: BorderBlockStartColorProperty*): Self = StObject.set(x, "borderBlockStartColor", js.Array(value*))
    
    inline def setBorderBlockStartStyle(value: BorderBlockStartStyleProperty | js.Array[BorderBlockStartStyleProperty]): Self = StObject.set(x, "borderBlockStartStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderBlockStartStyleUndefined: Self = StObject.set(x, "borderBlockStartStyle", js.undefined)
    
    inline def setBorderBlockStartStyleVarargs(value: BorderBlockStartStyleProperty*): Self = StObject.set(x, "borderBlockStartStyle", js.Array(value*))
    
    inline def setBorderBlockStartWidth(value: BorderBlockStartWidthProperty[TLength] | js.Array[BorderBlockStartWidthProperty[TLength]]): Self = StObject.set(x, "borderBlockStartWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderBlockStartWidthUndefined: Self = StObject.set(x, "borderBlockStartWidth", js.undefined)
    
    inline def setBorderBlockStartWidthVarargs(value: BorderBlockStartWidthProperty[TLength]*): Self = StObject.set(x, "borderBlockStartWidth", js.Array(value*))
    
    inline def setBorderBlockStyle(value: BorderBlockStyleProperty | js.Array[BorderBlockStyleProperty]): Self = StObject.set(x, "borderBlockStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderBlockStyleUndefined: Self = StObject.set(x, "borderBlockStyle", js.undefined)
    
    inline def setBorderBlockStyleVarargs(value: BorderBlockStyleProperty*): Self = StObject.set(x, "borderBlockStyle", js.Array(value*))
    
    inline def setBorderBlockWidth(value: BorderBlockWidthProperty[TLength] | js.Array[BorderBlockWidthProperty[TLength]]): Self = StObject.set(x, "borderBlockWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderBlockWidthUndefined: Self = StObject.set(x, "borderBlockWidth", js.undefined)
    
    inline def setBorderBlockWidthVarargs(value: BorderBlockWidthProperty[TLength]*): Self = StObject.set(x, "borderBlockWidth", js.Array(value*))
    
    inline def setBorderBottomColor(value: BorderBottomColorProperty | js.Array[BorderBottomColorProperty]): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
    
    inline def setBorderBottomColorVarargs(value: BorderBottomColorProperty*): Self = StObject.set(x, "borderBottomColor", js.Array(value*))
    
    inline def setBorderBottomLeftRadius(value: BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "borderBottomLeftRadius", js.undefined)
    
    inline def setBorderBottomLeftRadiusVarargs(value: BorderBottomLeftRadiusProperty[TLength]*): Self = StObject.set(x, "borderBottomLeftRadius", js.Array(value*))
    
    inline def setBorderBottomRightRadius(
      value: BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
    ): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomRightRadiusUndefined: Self = StObject.set(x, "borderBottomRightRadius", js.undefined)
    
    inline def setBorderBottomRightRadiusVarargs(value: BorderBottomRightRadiusProperty[TLength]*): Self = StObject.set(x, "borderBottomRightRadius", js.Array(value*))
    
    inline def setBorderBottomStyle(value: BorderBottomStyleProperty | js.Array[BorderBottomStyleProperty]): Self = StObject.set(x, "borderBottomStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomStyleUndefined: Self = StObject.set(x, "borderBottomStyle", js.undefined)
    
    inline def setBorderBottomStyleVarargs(value: BorderBottomStyleProperty*): Self = StObject.set(x, "borderBottomStyle", js.Array(value*))
    
    inline def setBorderBottomWidth(value: BorderBottomWidthProperty[TLength] | js.Array[BorderBottomWidthProperty[TLength]]): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomWidthUndefined: Self = StObject.set(x, "borderBottomWidth", js.undefined)
    
    inline def setBorderBottomWidthVarargs(value: BorderBottomWidthProperty[TLength]*): Self = StObject.set(x, "borderBottomWidth", js.Array(value*))
    
    inline def setBorderCollapse(value: BorderCollapseProperty | js.Array[BorderCollapseProperty]): Self = StObject.set(x, "borderCollapse", value.asInstanceOf[js.Any])
    
    inline def setBorderCollapseUndefined: Self = StObject.set(x, "borderCollapse", js.undefined)
    
    inline def setBorderCollapseVarargs(value: BorderCollapseProperty*): Self = StObject.set(x, "borderCollapse", js.Array(value*))
    
    inline def setBorderEndEndRadius(value: BorderEndEndRadiusProperty[TLength] | js.Array[BorderEndEndRadiusProperty[TLength]]): Self = StObject.set(x, "borderEndEndRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderEndEndRadiusUndefined: Self = StObject.set(x, "borderEndEndRadius", js.undefined)
    
    inline def setBorderEndEndRadiusVarargs(value: BorderEndEndRadiusProperty[TLength]*): Self = StObject.set(x, "borderEndEndRadius", js.Array(value*))
    
    inline def setBorderEndStartRadius(value: BorderEndStartRadiusProperty[TLength] | js.Array[BorderEndStartRadiusProperty[TLength]]): Self = StObject.set(x, "borderEndStartRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderEndStartRadiusUndefined: Self = StObject.set(x, "borderEndStartRadius", js.undefined)
    
    inline def setBorderEndStartRadiusVarargs(value: BorderEndStartRadiusProperty[TLength]*): Self = StObject.set(x, "borderEndStartRadius", js.Array(value*))
    
    inline def setBorderImageOutset(value: BorderImageOutsetProperty[TLength] | js.Array[BorderImageOutsetProperty[TLength]]): Self = StObject.set(x, "borderImageOutset", value.asInstanceOf[js.Any])
    
    inline def setBorderImageOutsetUndefined: Self = StObject.set(x, "borderImageOutset", js.undefined)
    
    inline def setBorderImageOutsetVarargs(value: BorderImageOutsetProperty[TLength]*): Self = StObject.set(x, "borderImageOutset", js.Array(value*))
    
    inline def setBorderImageRepeat(value: BorderImageRepeatProperty | js.Array[BorderImageRepeatProperty]): Self = StObject.set(x, "borderImageRepeat", value.asInstanceOf[js.Any])
    
    inline def setBorderImageRepeatUndefined: Self = StObject.set(x, "borderImageRepeat", js.undefined)
    
    inline def setBorderImageRepeatVarargs(value: BorderImageRepeatProperty*): Self = StObject.set(x, "borderImageRepeat", js.Array(value*))
    
    inline def setBorderImageSlice(value: BorderImageSliceProperty | js.Array[BorderImageSliceProperty]): Self = StObject.set(x, "borderImageSlice", value.asInstanceOf[js.Any])
    
    inline def setBorderImageSliceUndefined: Self = StObject.set(x, "borderImageSlice", js.undefined)
    
    inline def setBorderImageSliceVarargs(value: BorderImageSliceProperty*): Self = StObject.set(x, "borderImageSlice", js.Array(value*))
    
    inline def setBorderImageSource(value: BorderImageSourceProperty | js.Array[BorderImageSourceProperty]): Self = StObject.set(x, "borderImageSource", value.asInstanceOf[js.Any])
    
    inline def setBorderImageSourceUndefined: Self = StObject.set(x, "borderImageSource", js.undefined)
    
    inline def setBorderImageSourceVarargs(value: BorderImageSourceProperty*): Self = StObject.set(x, "borderImageSource", js.Array(value*))
    
    inline def setBorderImageWidth(value: BorderImageWidthProperty[TLength] | js.Array[BorderImageWidthProperty[TLength]]): Self = StObject.set(x, "borderImageWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderImageWidthUndefined: Self = StObject.set(x, "borderImageWidth", js.undefined)
    
    inline def setBorderImageWidthVarargs(value: BorderImageWidthProperty[TLength]*): Self = StObject.set(x, "borderImageWidth", js.Array(value*))
    
    inline def setBorderInlineColor(value: BorderInlineColorProperty | js.Array[BorderInlineColorProperty]): Self = StObject.set(x, "borderInlineColor", value.asInstanceOf[js.Any])
    
    inline def setBorderInlineColorUndefined: Self = StObject.set(x, "borderInlineColor", js.undefined)
    
    inline def setBorderInlineColorVarargs(value: BorderInlineColorProperty*): Self = StObject.set(x, "borderInlineColor", js.Array(value*))
    
    inline def setBorderInlineEndColor(value: BorderInlineEndColorProperty | js.Array[BorderInlineEndColorProperty]): Self = StObject.set(x, "borderInlineEndColor", value.asInstanceOf[js.Any])
    
    inline def setBorderInlineEndColorUndefined: Self = StObject.set(x, "borderInlineEndColor", js.undefined)
    
    inline def setBorderInlineEndColorVarargs(value: BorderInlineEndColorProperty*): Self = StObject.set(x, "borderInlineEndColor", js.Array(value*))
    
    inline def setBorderInlineEndStyle(value: BorderInlineEndStyleProperty | js.Array[BorderInlineEndStyleProperty]): Self = StObject.set(x, "borderInlineEndStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderInlineEndStyleUndefined: Self = StObject.set(x, "borderInlineEndStyle", js.undefined)
    
    inline def setBorderInlineEndStyleVarargs(value: BorderInlineEndStyleProperty*): Self = StObject.set(x, "borderInlineEndStyle", js.Array(value*))
    
    inline def setBorderInlineEndWidth(value: BorderInlineEndWidthProperty[TLength] | js.Array[BorderInlineEndWidthProperty[TLength]]): Self = StObject.set(x, "borderInlineEndWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderInlineEndWidthUndefined: Self = StObject.set(x, "borderInlineEndWidth", js.undefined)
    
    inline def setBorderInlineEndWidthVarargs(value: BorderInlineEndWidthProperty[TLength]*): Self = StObject.set(x, "borderInlineEndWidth", js.Array(value*))
    
    inline def setBorderInlineStartColor(value: BorderInlineStartColorProperty | js.Array[BorderInlineStartColorProperty]): Self = StObject.set(x, "borderInlineStartColor", value.asInstanceOf[js.Any])
    
    inline def setBorderInlineStartColorUndefined: Self = StObject.set(x, "borderInlineStartColor", js.undefined)
    
    inline def setBorderInlineStartColorVarargs(value: BorderInlineStartColorProperty*): Self = StObject.set(x, "borderInlineStartColor", js.Array(value*))
    
    inline def setBorderInlineStartStyle(value: BorderInlineStartStyleProperty | js.Array[BorderInlineStartStyleProperty]): Self = StObject.set(x, "borderInlineStartStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderInlineStartStyleUndefined: Self = StObject.set(x, "borderInlineStartStyle", js.undefined)
    
    inline def setBorderInlineStartStyleVarargs(value: BorderInlineStartStyleProperty*): Self = StObject.set(x, "borderInlineStartStyle", js.Array(value*))
    
    inline def setBorderInlineStartWidth(value: BorderInlineStartWidthProperty[TLength] | js.Array[BorderInlineStartWidthProperty[TLength]]): Self = StObject.set(x, "borderInlineStartWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderInlineStartWidthUndefined: Self = StObject.set(x, "borderInlineStartWidth", js.undefined)
    
    inline def setBorderInlineStartWidthVarargs(value: BorderInlineStartWidthProperty[TLength]*): Self = StObject.set(x, "borderInlineStartWidth", js.Array(value*))
    
    inline def setBorderInlineStyle(value: BorderInlineStyleProperty | js.Array[BorderInlineStyleProperty]): Self = StObject.set(x, "borderInlineStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderInlineStyleUndefined: Self = StObject.set(x, "borderInlineStyle", js.undefined)
    
    inline def setBorderInlineStyleVarargs(value: BorderInlineStyleProperty*): Self = StObject.set(x, "borderInlineStyle", js.Array(value*))
    
    inline def setBorderInlineWidth(value: BorderInlineWidthProperty[TLength] | js.Array[BorderInlineWidthProperty[TLength]]): Self = StObject.set(x, "borderInlineWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderInlineWidthUndefined: Self = StObject.set(x, "borderInlineWidth", js.undefined)
    
    inline def setBorderInlineWidthVarargs(value: BorderInlineWidthProperty[TLength]*): Self = StObject.set(x, "borderInlineWidth", js.Array(value*))
    
    inline def setBorderLeftColor(value: BorderLeftColorProperty | js.Array[BorderLeftColorProperty]): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
    
    inline def setBorderLeftColorVarargs(value: BorderLeftColorProperty*): Self = StObject.set(x, "borderLeftColor", js.Array(value*))
    
    inline def setBorderLeftStyle(value: BorderLeftStyleProperty | js.Array[BorderLeftStyleProperty]): Self = StObject.set(x, "borderLeftStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftStyleUndefined: Self = StObject.set(x, "borderLeftStyle", js.undefined)
    
    inline def setBorderLeftStyleVarargs(value: BorderLeftStyleProperty*): Self = StObject.set(x, "borderLeftStyle", js.Array(value*))
    
    inline def setBorderLeftWidth(value: BorderLeftWidthProperty[TLength] | js.Array[BorderLeftWidthProperty[TLength]]): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftWidthUndefined: Self = StObject.set(x, "borderLeftWidth", js.undefined)
    
    inline def setBorderLeftWidthVarargs(value: BorderLeftWidthProperty[TLength]*): Self = StObject.set(x, "borderLeftWidth", js.Array(value*))
    
    inline def setBorderRightColor(value: BorderRightColorProperty | js.Array[BorderRightColorProperty]): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
    
    inline def setBorderRightColorUndefined: Self = StObject.set(x, "borderRightColor", js.undefined)
    
    inline def setBorderRightColorVarargs(value: BorderRightColorProperty*): Self = StObject.set(x, "borderRightColor", js.Array(value*))
    
    inline def setBorderRightStyle(value: BorderRightStyleProperty | js.Array[BorderRightStyleProperty]): Self = StObject.set(x, "borderRightStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderRightStyleUndefined: Self = StObject.set(x, "borderRightStyle", js.undefined)
    
    inline def setBorderRightStyleVarargs(value: BorderRightStyleProperty*): Self = StObject.set(x, "borderRightStyle", js.Array(value*))
    
    inline def setBorderRightWidth(value: BorderRightWidthProperty[TLength] | js.Array[BorderRightWidthProperty[TLength]]): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderRightWidthUndefined: Self = StObject.set(x, "borderRightWidth", js.undefined)
    
    inline def setBorderRightWidthVarargs(value: BorderRightWidthProperty[TLength]*): Self = StObject.set(x, "borderRightWidth", js.Array(value*))
    
    inline def setBorderSpacing(value: BorderSpacingProperty[TLength] | js.Array[BorderSpacingProperty[TLength]]): Self = StObject.set(x, "borderSpacing", value.asInstanceOf[js.Any])
    
    inline def setBorderSpacingUndefined: Self = StObject.set(x, "borderSpacing", js.undefined)
    
    inline def setBorderSpacingVarargs(value: BorderSpacingProperty[TLength]*): Self = StObject.set(x, "borderSpacing", js.Array(value*))
    
    inline def setBorderStartEndRadius(value: BorderStartEndRadiusProperty[TLength] | js.Array[BorderStartEndRadiusProperty[TLength]]): Self = StObject.set(x, "borderStartEndRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderStartEndRadiusUndefined: Self = StObject.set(x, "borderStartEndRadius", js.undefined)
    
    inline def setBorderStartEndRadiusVarargs(value: BorderStartEndRadiusProperty[TLength]*): Self = StObject.set(x, "borderStartEndRadius", js.Array(value*))
    
    inline def setBorderStartStartRadius(value: BorderStartStartRadiusProperty[TLength] | js.Array[BorderStartStartRadiusProperty[TLength]]): Self = StObject.set(x, "borderStartStartRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderStartStartRadiusUndefined: Self = StObject.set(x, "borderStartStartRadius", js.undefined)
    
    inline def setBorderStartStartRadiusVarargs(value: BorderStartStartRadiusProperty[TLength]*): Self = StObject.set(x, "borderStartStartRadius", js.Array(value*))
    
    inline def setBorderTopColor(value: BorderTopColorProperty | js.Array[BorderTopColorProperty]): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
    
    inline def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
    
    inline def setBorderTopColorVarargs(value: BorderTopColorProperty*): Self = StObject.set(x, "borderTopColor", js.Array(value*))
    
    inline def setBorderTopLeftRadius(value: BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderTopLeftRadiusUndefined: Self = StObject.set(x, "borderTopLeftRadius", js.undefined)
    
    inline def setBorderTopLeftRadiusVarargs(value: BorderTopLeftRadiusProperty[TLength]*): Self = StObject.set(x, "borderTopLeftRadius", js.Array(value*))
    
    inline def setBorderTopRightRadius(value: BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderTopRightRadiusUndefined: Self = StObject.set(x, "borderTopRightRadius", js.undefined)
    
    inline def setBorderTopRightRadiusVarargs(value: BorderTopRightRadiusProperty[TLength]*): Self = StObject.set(x, "borderTopRightRadius", js.Array(value*))
    
    inline def setBorderTopStyle(value: BorderTopStyleProperty | js.Array[BorderTopStyleProperty]): Self = StObject.set(x, "borderTopStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderTopStyleUndefined: Self = StObject.set(x, "borderTopStyle", js.undefined)
    
    inline def setBorderTopStyleVarargs(value: BorderTopStyleProperty*): Self = StObject.set(x, "borderTopStyle", js.Array(value*))
    
    inline def setBorderTopWidth(value: BorderTopWidthProperty[TLength] | js.Array[BorderTopWidthProperty[TLength]]): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderTopWidthUndefined: Self = StObject.set(x, "borderTopWidth", js.undefined)
    
    inline def setBorderTopWidthVarargs(value: BorderTopWidthProperty[TLength]*): Self = StObject.set(x, "borderTopWidth", js.Array(value*))
    
    inline def setBottom(value: BottomProperty[TLength] | js.Array[BottomProperty[TLength]]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setBottomVarargs(value: BottomProperty[TLength]*): Self = StObject.set(x, "bottom", js.Array(value*))
    
    inline def setBoxDecorationBreak(value: BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]): Self = StObject.set(x, "boxDecorationBreak", value.asInstanceOf[js.Any])
    
    inline def setBoxDecorationBreakUndefined: Self = StObject.set(x, "boxDecorationBreak", js.undefined)
    
    inline def setBoxDecorationBreakVarargs(value: BoxDecorationBreakProperty*): Self = StObject.set(x, "boxDecorationBreak", js.Array(value*))
    
    inline def setBoxShadow(value: BoxShadowProperty | js.Array[BoxShadowProperty]): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
    
    inline def setBoxShadowUndefined: Self = StObject.set(x, "boxShadow", js.undefined)
    
    inline def setBoxShadowVarargs(value: BoxShadowProperty*): Self = StObject.set(x, "boxShadow", js.Array(value*))
    
    inline def setBoxSizing(value: BoxSizingProperty | js.Array[BoxSizingProperty]): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
    
    inline def setBoxSizingUndefined: Self = StObject.set(x, "boxSizing", js.undefined)
    
    inline def setBoxSizingVarargs(value: BoxSizingProperty*): Self = StObject.set(x, "boxSizing", js.Array(value*))
    
    inline def setBreakAfter(value: BreakAfterProperty | js.Array[BreakAfterProperty]): Self = StObject.set(x, "breakAfter", value.asInstanceOf[js.Any])
    
    inline def setBreakAfterUndefined: Self = StObject.set(x, "breakAfter", js.undefined)
    
    inline def setBreakAfterVarargs(value: BreakAfterProperty*): Self = StObject.set(x, "breakAfter", js.Array(value*))
    
    inline def setBreakBefore(value: BreakBeforeProperty | js.Array[BreakBeforeProperty]): Self = StObject.set(x, "breakBefore", value.asInstanceOf[js.Any])
    
    inline def setBreakBeforeUndefined: Self = StObject.set(x, "breakBefore", js.undefined)
    
    inline def setBreakBeforeVarargs(value: BreakBeforeProperty*): Self = StObject.set(x, "breakBefore", js.Array(value*))
    
    inline def setBreakInside(value: BreakInsideProperty | js.Array[BreakInsideProperty]): Self = StObject.set(x, "breakInside", value.asInstanceOf[js.Any])
    
    inline def setBreakInsideUndefined: Self = StObject.set(x, "breakInside", js.undefined)
    
    inline def setBreakInsideVarargs(value: BreakInsideProperty*): Self = StObject.set(x, "breakInside", js.Array(value*))
    
    inline def setCaptionSide(value: CaptionSideProperty | js.Array[CaptionSideProperty]): Self = StObject.set(x, "captionSide", value.asInstanceOf[js.Any])
    
    inline def setCaptionSideUndefined: Self = StObject.set(x, "captionSide", js.undefined)
    
    inline def setCaptionSideVarargs(value: CaptionSideProperty*): Self = StObject.set(x, "captionSide", js.Array(value*))
    
    inline def setCaretColor(value: CaretColorProperty | js.Array[CaretColorProperty]): Self = StObject.set(x, "caretColor", value.asInstanceOf[js.Any])
    
    inline def setCaretColorUndefined: Self = StObject.set(x, "caretColor", js.undefined)
    
    inline def setCaretColorVarargs(value: CaretColorProperty*): Self = StObject.set(x, "caretColor", js.Array(value*))
    
    inline def setClear(value: ClearProperty | js.Array[ClearProperty]): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setClearVarargs(value: ClearProperty*): Self = StObject.set(x, "clear", js.Array(value*))
    
    inline def setClipPath(value: ClipPathProperty | js.Array[ClipPathProperty]): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
    
    inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
    
    inline def setClipPathVarargs(value: ClipPathProperty*): Self = StObject.set(x, "clipPath", js.Array(value*))
    
    inline def setColor(value: ColorProperty | js.Array[ColorProperty]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorAdjust(value: ColorAdjustProperty | js.Array[ColorAdjustProperty]): Self = StObject.set(x, "colorAdjust", value.asInstanceOf[js.Any])
    
    inline def setColorAdjustUndefined: Self = StObject.set(x, "colorAdjust", js.undefined)
    
    inline def setColorAdjustVarargs(value: ColorAdjustProperty*): Self = StObject.set(x, "colorAdjust", js.Array(value*))
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: ColorProperty*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setColumnCount(value: ColumnCountProperty | js.Array[ColumnCountProperty]): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    inline def setColumnCountVarargs(value: ColumnCountProperty*): Self = StObject.set(x, "columnCount", js.Array(value*))
    
    inline def setColumnFill(value: ColumnFillProperty | js.Array[ColumnFillProperty]): Self = StObject.set(x, "columnFill", value.asInstanceOf[js.Any])
    
    inline def setColumnFillUndefined: Self = StObject.set(x, "columnFill", js.undefined)
    
    inline def setColumnFillVarargs(value: ColumnFillProperty*): Self = StObject.set(x, "columnFill", js.Array(value*))
    
    inline def setColumnGap(value: ColumnGapProperty[TLength] | js.Array[ColumnGapProperty[TLength]]): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
    
    inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
    
    inline def setColumnGapVarargs(value: ColumnGapProperty[TLength]*): Self = StObject.set(x, "columnGap", js.Array(value*))
    
    inline def setColumnRuleColor(value: ColumnRuleColorProperty | js.Array[ColumnRuleColorProperty]): Self = StObject.set(x, "columnRuleColor", value.asInstanceOf[js.Any])
    
    inline def setColumnRuleColorUndefined: Self = StObject.set(x, "columnRuleColor", js.undefined)
    
    inline def setColumnRuleColorVarargs(value: ColumnRuleColorProperty*): Self = StObject.set(x, "columnRuleColor", js.Array(value*))
    
    inline def setColumnRuleStyle(value: ColumnRuleStyleProperty | js.Array[ColumnRuleStyleProperty]): Self = StObject.set(x, "columnRuleStyle", value.asInstanceOf[js.Any])
    
    inline def setColumnRuleStyleUndefined: Self = StObject.set(x, "columnRuleStyle", js.undefined)
    
    inline def setColumnRuleStyleVarargs(value: ColumnRuleStyleProperty*): Self = StObject.set(x, "columnRuleStyle", js.Array(value*))
    
    inline def setColumnRuleWidth(value: ColumnRuleWidthProperty[TLength] | js.Array[ColumnRuleWidthProperty[TLength]]): Self = StObject.set(x, "columnRuleWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnRuleWidthUndefined: Self = StObject.set(x, "columnRuleWidth", js.undefined)
    
    inline def setColumnRuleWidthVarargs(value: ColumnRuleWidthProperty[TLength]*): Self = StObject.set(x, "columnRuleWidth", js.Array(value*))
    
    inline def setColumnSpan(value: ColumnSpanProperty | js.Array[ColumnSpanProperty]): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
    
    inline def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
    
    inline def setColumnSpanVarargs(value: ColumnSpanProperty*): Self = StObject.set(x, "columnSpan", js.Array(value*))
    
    inline def setColumnWidth(value: ColumnWidthProperty[TLength] | js.Array[ColumnWidthProperty[TLength]]): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setColumnWidthVarargs(value: ColumnWidthProperty[TLength]*): Self = StObject.set(x, "columnWidth", js.Array(value*))
    
    inline def setContain(value: ContainProperty | js.Array[ContainProperty]): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
    
    inline def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
    
    inline def setContainVarargs(value: ContainProperty*): Self = StObject.set(x, "contain", js.Array(value*))
    
    inline def setContent(value: ContentProperty | js.Array[ContentProperty]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentVarargs(value: ContentProperty*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setCounterIncrement(value: CounterIncrementProperty | js.Array[CounterIncrementProperty]): Self = StObject.set(x, "counterIncrement", value.asInstanceOf[js.Any])
    
    inline def setCounterIncrementUndefined: Self = StObject.set(x, "counterIncrement", js.undefined)
    
    inline def setCounterIncrementVarargs(value: CounterIncrementProperty*): Self = StObject.set(x, "counterIncrement", js.Array(value*))
    
    inline def setCounterReset(value: CounterResetProperty | js.Array[CounterResetProperty]): Self = StObject.set(x, "counterReset", value.asInstanceOf[js.Any])
    
    inline def setCounterResetUndefined: Self = StObject.set(x, "counterReset", js.undefined)
    
    inline def setCounterResetVarargs(value: CounterResetProperty*): Self = StObject.set(x, "counterReset", js.Array(value*))
    
    inline def setCursor(value: CursorProperty | js.Array[CursorProperty]): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setCursorVarargs(value: CursorProperty*): Self = StObject.set(x, "cursor", js.Array(value*))
    
    inline def setDirection(value: DirectionProperty | js.Array[DirectionProperty]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDirectionVarargs(value: DirectionProperty*): Self = StObject.set(x, "direction", js.Array(value*))
    
    inline def setDisplay(value: DisplayProperty | js.Array[DisplayProperty]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setDisplayVarargs(value: DisplayProperty*): Self = StObject.set(x, "display", js.Array(value*))
    
    inline def setEmptyCells(value: EmptyCellsProperty | js.Array[EmptyCellsProperty]): Self = StObject.set(x, "emptyCells", value.asInstanceOf[js.Any])
    
    inline def setEmptyCellsUndefined: Self = StObject.set(x, "emptyCells", js.undefined)
    
    inline def setEmptyCellsVarargs(value: EmptyCellsProperty*): Self = StObject.set(x, "emptyCells", js.Array(value*))
    
    inline def setFilter(value: FilterProperty | js.Array[FilterProperty]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: FilterProperty*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setFlexBasis(value: FlexBasisProperty[TLength] | js.Array[FlexBasisProperty[TLength]]): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
    
    inline def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
    
    inline def setFlexBasisVarargs(value: FlexBasisProperty[TLength]*): Self = StObject.set(x, "flexBasis", js.Array(value*))
    
    inline def setFlexDirection(value: FlexDirectionProperty | js.Array[FlexDirectionProperty]): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    inline def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
    
    inline def setFlexDirectionVarargs(value: FlexDirectionProperty*): Self = StObject.set(x, "flexDirection", js.Array(value*))
    
    inline def setFlexGrow(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
    
    inline def setFlexGrowVarargs(value: GlobalsNumber*): Self = StObject.set(x, "flexGrow", js.Array(value*))
    
    inline def setFlexShrink(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
    
    inline def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
    
    inline def setFlexShrinkVarargs(value: GlobalsNumber*): Self = StObject.set(x, "flexShrink", js.Array(value*))
    
    inline def setFlexWrap(value: FlexWrapProperty | js.Array[FlexWrapProperty]): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
    
    inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
    
    inline def setFlexWrapVarargs(value: FlexWrapProperty*): Self = StObject.set(x, "flexWrap", js.Array(value*))
    
    inline def setFloat(value: FloatProperty | js.Array[FloatProperty]): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
    
    inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
    
    inline def setFloatVarargs(value: FloatProperty*): Self = StObject.set(x, "float", js.Array(value*))
    
    inline def setFontFamily(value: FontFamilyProperty | js.Array[FontFamilyProperty]): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontFamilyVarargs(value: FontFamilyProperty*): Self = StObject.set(x, "fontFamily", js.Array(value*))
    
    inline def setFontFeatureSettings(value: FontFeatureSettingsProperty | js.Array[FontFeatureSettingsProperty]): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
    
    inline def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
    
    inline def setFontFeatureSettingsVarargs(value: FontFeatureSettingsProperty*): Self = StObject.set(x, "fontFeatureSettings", js.Array(value*))
    
    inline def setFontKerning(value: FontKerningProperty | js.Array[FontKerningProperty]): Self = StObject.set(x, "fontKerning", value.asInstanceOf[js.Any])
    
    inline def setFontKerningUndefined: Self = StObject.set(x, "fontKerning", js.undefined)
    
    inline def setFontKerningVarargs(value: FontKerningProperty*): Self = StObject.set(x, "fontKerning", js.Array(value*))
    
    inline def setFontLanguageOverride(value: FontLanguageOverrideProperty | js.Array[FontLanguageOverrideProperty]): Self = StObject.set(x, "fontLanguageOverride", value.asInstanceOf[js.Any])
    
    inline def setFontLanguageOverrideUndefined: Self = StObject.set(x, "fontLanguageOverride", js.undefined)
    
    inline def setFontLanguageOverrideVarargs(value: FontLanguageOverrideProperty*): Self = StObject.set(x, "fontLanguageOverride", js.Array(value*))
    
    inline def setFontOpticalSizing(value: FontOpticalSizingProperty | js.Array[FontOpticalSizingProperty]): Self = StObject.set(x, "fontOpticalSizing", value.asInstanceOf[js.Any])
    
    inline def setFontOpticalSizingUndefined: Self = StObject.set(x, "fontOpticalSizing", js.undefined)
    
    inline def setFontOpticalSizingVarargs(value: FontOpticalSizingProperty*): Self = StObject.set(x, "fontOpticalSizing", js.Array(value*))
    
    inline def setFontSize(value: FontSizeProperty[TLength] | js.Array[FontSizeProperty[TLength]]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeAdjust(value: FontSizeAdjustProperty | js.Array[FontSizeAdjustProperty]): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
    
    inline def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
    
    inline def setFontSizeAdjustVarargs(value: FontSizeAdjustProperty*): Self = StObject.set(x, "fontSizeAdjust", js.Array(value*))
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontSizeVarargs(value: FontSizeProperty[TLength]*): Self = StObject.set(x, "fontSize", js.Array(value*))
    
    inline def setFontStretch(value: FontStretchProperty | js.Array[FontStretchProperty]): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
    
    inline def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
    
    inline def setFontStretchVarargs(value: FontStretchProperty*): Self = StObject.set(x, "fontStretch", js.Array(value*))
    
    inline def setFontStyle(value: FontStyleProperty | js.Array[FontStyleProperty]): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontStyleVarargs(value: FontStyleProperty*): Self = StObject.set(x, "fontStyle", js.Array(value*))
    
    inline def setFontSynthesis(value: FontSynthesisProperty | js.Array[FontSynthesisProperty]): Self = StObject.set(x, "fontSynthesis", value.asInstanceOf[js.Any])
    
    inline def setFontSynthesisUndefined: Self = StObject.set(x, "fontSynthesis", js.undefined)
    
    inline def setFontSynthesisVarargs(value: FontSynthesisProperty*): Self = StObject.set(x, "fontSynthesis", js.Array(value*))
    
    inline def setFontVariant(value: FontVariantProperty | js.Array[FontVariantProperty]): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    inline def setFontVariantCaps(value: FontVariantCapsProperty | js.Array[FontVariantCapsProperty]): Self = StObject.set(x, "fontVariantCaps", value.asInstanceOf[js.Any])
    
    inline def setFontVariantCapsUndefined: Self = StObject.set(x, "fontVariantCaps", js.undefined)
    
    inline def setFontVariantCapsVarargs(value: FontVariantCapsProperty*): Self = StObject.set(x, "fontVariantCaps", js.Array(value*))
    
    inline def setFontVariantEastAsian(value: FontVariantEastAsianProperty | js.Array[FontVariantEastAsianProperty]): Self = StObject.set(x, "fontVariantEastAsian", value.asInstanceOf[js.Any])
    
    inline def setFontVariantEastAsianUndefined: Self = StObject.set(x, "fontVariantEastAsian", js.undefined)
    
    inline def setFontVariantEastAsianVarargs(value: FontVariantEastAsianProperty*): Self = StObject.set(x, "fontVariantEastAsian", js.Array(value*))
    
    inline def setFontVariantLigatures(value: FontVariantLigaturesProperty | js.Array[FontVariantLigaturesProperty]): Self = StObject.set(x, "fontVariantLigatures", value.asInstanceOf[js.Any])
    
    inline def setFontVariantLigaturesUndefined: Self = StObject.set(x, "fontVariantLigatures", js.undefined)
    
    inline def setFontVariantLigaturesVarargs(value: FontVariantLigaturesProperty*): Self = StObject.set(x, "fontVariantLigatures", js.Array(value*))
    
    inline def setFontVariantNumeric(value: FontVariantNumericProperty | js.Array[FontVariantNumericProperty]): Self = StObject.set(x, "fontVariantNumeric", value.asInstanceOf[js.Any])
    
    inline def setFontVariantNumericUndefined: Self = StObject.set(x, "fontVariantNumeric", js.undefined)
    
    inline def setFontVariantNumericVarargs(value: FontVariantNumericProperty*): Self = StObject.set(x, "fontVariantNumeric", js.Array(value*))
    
    inline def setFontVariantPosition(value: FontVariantPositionProperty | js.Array[FontVariantPositionProperty]): Self = StObject.set(x, "fontVariantPosition", value.asInstanceOf[js.Any])
    
    inline def setFontVariantPositionUndefined: Self = StObject.set(x, "fontVariantPosition", js.undefined)
    
    inline def setFontVariantPositionVarargs(value: FontVariantPositionProperty*): Self = StObject.set(x, "fontVariantPosition", js.Array(value*))
    
    inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
    
    inline def setFontVariantVarargs(value: FontVariantProperty*): Self = StObject.set(x, "fontVariant", js.Array(value*))
    
    inline def setFontVariationSettings(value: FontVariationSettingsProperty | js.Array[FontVariationSettingsProperty]): Self = StObject.set(x, "fontVariationSettings", value.asInstanceOf[js.Any])
    
    inline def setFontVariationSettingsUndefined: Self = StObject.set(x, "fontVariationSettings", js.undefined)
    
    inline def setFontVariationSettingsVarargs(value: FontVariationSettingsProperty*): Self = StObject.set(x, "fontVariationSettings", js.Array(value*))
    
    inline def setFontWeight(value: FontWeightProperty | js.Array[FontWeightProperty]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setFontWeightVarargs(value: FontWeightProperty*): Self = StObject.set(x, "fontWeight", js.Array(value*))
    
    inline def setGridAutoColumns(value: GridAutoColumnsProperty[TLength] | js.Array[GridAutoColumnsProperty[TLength]]): Self = StObject.set(x, "gridAutoColumns", value.asInstanceOf[js.Any])
    
    inline def setGridAutoColumnsUndefined: Self = StObject.set(x, "gridAutoColumns", js.undefined)
    
    inline def setGridAutoColumnsVarargs(value: GridAutoColumnsProperty[TLength]*): Self = StObject.set(x, "gridAutoColumns", js.Array(value*))
    
    inline def setGridAutoFlow(value: GridAutoFlowProperty | js.Array[GridAutoFlowProperty]): Self = StObject.set(x, "gridAutoFlow", value.asInstanceOf[js.Any])
    
    inline def setGridAutoFlowUndefined: Self = StObject.set(x, "gridAutoFlow", js.undefined)
    
    inline def setGridAutoFlowVarargs(value: GridAutoFlowProperty*): Self = StObject.set(x, "gridAutoFlow", js.Array(value*))
    
    inline def setGridAutoRows(value: GridAutoRowsProperty[TLength] | js.Array[GridAutoRowsProperty[TLength]]): Self = StObject.set(x, "gridAutoRows", value.asInstanceOf[js.Any])
    
    inline def setGridAutoRowsUndefined: Self = StObject.set(x, "gridAutoRows", js.undefined)
    
    inline def setGridAutoRowsVarargs(value: GridAutoRowsProperty[TLength]*): Self = StObject.set(x, "gridAutoRows", js.Array(value*))
    
    inline def setGridColumnEnd(value: GridColumnEndProperty | js.Array[GridColumnEndProperty]): Self = StObject.set(x, "gridColumnEnd", value.asInstanceOf[js.Any])
    
    inline def setGridColumnEndUndefined: Self = StObject.set(x, "gridColumnEnd", js.undefined)
    
    inline def setGridColumnEndVarargs(value: GridColumnEndProperty*): Self = StObject.set(x, "gridColumnEnd", js.Array(value*))
    
    inline def setGridColumnStart(value: GridColumnStartProperty | js.Array[GridColumnStartProperty]): Self = StObject.set(x, "gridColumnStart", value.asInstanceOf[js.Any])
    
    inline def setGridColumnStartUndefined: Self = StObject.set(x, "gridColumnStart", js.undefined)
    
    inline def setGridColumnStartVarargs(value: GridColumnStartProperty*): Self = StObject.set(x, "gridColumnStart", js.Array(value*))
    
    inline def setGridRowEnd(value: GridRowEndProperty | js.Array[GridRowEndProperty]): Self = StObject.set(x, "gridRowEnd", value.asInstanceOf[js.Any])
    
    inline def setGridRowEndUndefined: Self = StObject.set(x, "gridRowEnd", js.undefined)
    
    inline def setGridRowEndVarargs(value: GridRowEndProperty*): Self = StObject.set(x, "gridRowEnd", js.Array(value*))
    
    inline def setGridRowStart(value: GridRowStartProperty | js.Array[GridRowStartProperty]): Self = StObject.set(x, "gridRowStart", value.asInstanceOf[js.Any])
    
    inline def setGridRowStartUndefined: Self = StObject.set(x, "gridRowStart", js.undefined)
    
    inline def setGridRowStartVarargs(value: GridRowStartProperty*): Self = StObject.set(x, "gridRowStart", js.Array(value*))
    
    inline def setGridTemplateAreas(value: GridTemplateAreasProperty | js.Array[GridTemplateAreasProperty]): Self = StObject.set(x, "gridTemplateAreas", value.asInstanceOf[js.Any])
    
    inline def setGridTemplateAreasUndefined: Self = StObject.set(x, "gridTemplateAreas", js.undefined)
    
    inline def setGridTemplateAreasVarargs(value: GridTemplateAreasProperty*): Self = StObject.set(x, "gridTemplateAreas", js.Array(value*))
    
    inline def setGridTemplateColumns(value: GridTemplateColumnsProperty[TLength] | js.Array[GridTemplateColumnsProperty[TLength]]): Self = StObject.set(x, "gridTemplateColumns", value.asInstanceOf[js.Any])
    
    inline def setGridTemplateColumnsUndefined: Self = StObject.set(x, "gridTemplateColumns", js.undefined)
    
    inline def setGridTemplateColumnsVarargs(value: GridTemplateColumnsProperty[TLength]*): Self = StObject.set(x, "gridTemplateColumns", js.Array(value*))
    
    inline def setGridTemplateRows(value: GridTemplateRowsProperty[TLength] | js.Array[GridTemplateRowsProperty[TLength]]): Self = StObject.set(x, "gridTemplateRows", value.asInstanceOf[js.Any])
    
    inline def setGridTemplateRowsUndefined: Self = StObject.set(x, "gridTemplateRows", js.undefined)
    
    inline def setGridTemplateRowsVarargs(value: GridTemplateRowsProperty[TLength]*): Self = StObject.set(x, "gridTemplateRows", js.Array(value*))
    
    inline def setHangingPunctuation(value: HangingPunctuationProperty | js.Array[HangingPunctuationProperty]): Self = StObject.set(x, "hangingPunctuation", value.asInstanceOf[js.Any])
    
    inline def setHangingPunctuationUndefined: Self = StObject.set(x, "hangingPunctuation", js.undefined)
    
    inline def setHangingPunctuationVarargs(value: HangingPunctuationProperty*): Self = StObject.set(x, "hangingPunctuation", js.Array(value*))
    
    inline def setHeight(value: HeightProperty[TLength] | js.Array[HeightProperty[TLength]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHeightVarargs(value: HeightProperty[TLength]*): Self = StObject.set(x, "height", js.Array(value*))
    
    inline def setHyphens(value: HyphensProperty | js.Array[HyphensProperty]): Self = StObject.set(x, "hyphens", value.asInstanceOf[js.Any])
    
    inline def setHyphensUndefined: Self = StObject.set(x, "hyphens", js.undefined)
    
    inline def setHyphensVarargs(value: HyphensProperty*): Self = StObject.set(x, "hyphens", js.Array(value*))
    
    inline def setImageOrientation(value: ImageOrientationProperty | js.Array[ImageOrientationProperty]): Self = StObject.set(x, "imageOrientation", value.asInstanceOf[js.Any])
    
    inline def setImageOrientationUndefined: Self = StObject.set(x, "imageOrientation", js.undefined)
    
    inline def setImageOrientationVarargs(value: ImageOrientationProperty*): Self = StObject.set(x, "imageOrientation", js.Array(value*))
    
    inline def setImageRendering(value: ImageRenderingProperty | js.Array[ImageRenderingProperty]): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
    
    inline def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", js.undefined)
    
    inline def setImageRenderingVarargs(value: ImageRenderingProperty*): Self = StObject.set(x, "imageRendering", js.Array(value*))
    
    inline def setImageResolution(value: ImageResolutionProperty | js.Array[ImageResolutionProperty]): Self = StObject.set(x, "imageResolution", value.asInstanceOf[js.Any])
    
    inline def setImageResolutionUndefined: Self = StObject.set(x, "imageResolution", js.undefined)
    
    inline def setImageResolutionVarargs(value: ImageResolutionProperty*): Self = StObject.set(x, "imageResolution", js.Array(value*))
    
    inline def setInitialLetter(value: InitialLetterProperty | js.Array[InitialLetterProperty]): Self = StObject.set(x, "initialLetter", value.asInstanceOf[js.Any])
    
    inline def setInitialLetterUndefined: Self = StObject.set(x, "initialLetter", js.undefined)
    
    inline def setInitialLetterVarargs(value: InitialLetterProperty*): Self = StObject.set(x, "initialLetter", js.Array(value*))
    
    inline def setInlineSize(value: InlineSizeProperty[TLength] | js.Array[InlineSizeProperty[TLength]]): Self = StObject.set(x, "inlineSize", value.asInstanceOf[js.Any])
    
    inline def setInlineSizeUndefined: Self = StObject.set(x, "inlineSize", js.undefined)
    
    inline def setInlineSizeVarargs(value: InlineSizeProperty[TLength]*): Self = StObject.set(x, "inlineSize", js.Array(value*))
    
    inline def setInset(value: InsetProperty[TLength] | js.Array[InsetProperty[TLength]]): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def setInsetBlock(value: InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]): Self = StObject.set(x, "insetBlock", value.asInstanceOf[js.Any])
    
    inline def setInsetBlockEnd(value: InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]): Self = StObject.set(x, "insetBlockEnd", value.asInstanceOf[js.Any])
    
    inline def setInsetBlockEndUndefined: Self = StObject.set(x, "insetBlockEnd", js.undefined)
    
    inline def setInsetBlockEndVarargs(value: InsetBlockEndProperty[TLength]*): Self = StObject.set(x, "insetBlockEnd", js.Array(value*))
    
    inline def setInsetBlockStart(value: InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]): Self = StObject.set(x, "insetBlockStart", value.asInstanceOf[js.Any])
    
    inline def setInsetBlockStartUndefined: Self = StObject.set(x, "insetBlockStart", js.undefined)
    
    inline def setInsetBlockStartVarargs(value: InsetBlockStartProperty[TLength]*): Self = StObject.set(x, "insetBlockStart", js.Array(value*))
    
    inline def setInsetBlockUndefined: Self = StObject.set(x, "insetBlock", js.undefined)
    
    inline def setInsetBlockVarargs(value: InsetBlockProperty[TLength]*): Self = StObject.set(x, "insetBlock", js.Array(value*))
    
    inline def setInsetInline(value: InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]): Self = StObject.set(x, "insetInline", value.asInstanceOf[js.Any])
    
    inline def setInsetInlineEnd(value: InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]): Self = StObject.set(x, "insetInlineEnd", value.asInstanceOf[js.Any])
    
    inline def setInsetInlineEndUndefined: Self = StObject.set(x, "insetInlineEnd", js.undefined)
    
    inline def setInsetInlineEndVarargs(value: InsetInlineEndProperty[TLength]*): Self = StObject.set(x, "insetInlineEnd", js.Array(value*))
    
    inline def setInsetInlineStart(value: InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]): Self = StObject.set(x, "insetInlineStart", value.asInstanceOf[js.Any])
    
    inline def setInsetInlineStartUndefined: Self = StObject.set(x, "insetInlineStart", js.undefined)
    
    inline def setInsetInlineStartVarargs(value: InsetInlineStartProperty[TLength]*): Self = StObject.set(x, "insetInlineStart", js.Array(value*))
    
    inline def setInsetInlineUndefined: Self = StObject.set(x, "insetInline", js.undefined)
    
    inline def setInsetInlineVarargs(value: InsetInlineProperty[TLength]*): Self = StObject.set(x, "insetInline", js.Array(value*))
    
    inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    inline def setInsetVarargs(value: InsetProperty[TLength]*): Self = StObject.set(x, "inset", js.Array(value*))
    
    inline def setIsolation(value: IsolationProperty | js.Array[IsolationProperty]): Self = StObject.set(x, "isolation", value.asInstanceOf[js.Any])
    
    inline def setIsolationUndefined: Self = StObject.set(x, "isolation", js.undefined)
    
    inline def setIsolationVarargs(value: IsolationProperty*): Self = StObject.set(x, "isolation", js.Array(value*))
    
    inline def setJustifyContent(value: JustifyContentProperty | js.Array[JustifyContentProperty]): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
    
    inline def setJustifyContentVarargs(value: JustifyContentProperty*): Self = StObject.set(x, "justifyContent", js.Array(value*))
    
    inline def setJustifyItems(value: JustifyItemsProperty | js.Array[JustifyItemsProperty]): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
    
    inline def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
    
    inline def setJustifyItemsVarargs(value: JustifyItemsProperty*): Self = StObject.set(x, "justifyItems", js.Array(value*))
    
    inline def setJustifySelf(value: JustifySelfProperty | js.Array[JustifySelfProperty]): Self = StObject.set(x, "justifySelf", value.asInstanceOf[js.Any])
    
    inline def setJustifySelfUndefined: Self = StObject.set(x, "justifySelf", js.undefined)
    
    inline def setJustifySelfVarargs(value: JustifySelfProperty*): Self = StObject.set(x, "justifySelf", js.Array(value*))
    
    inline def setLeft(value: LeftProperty[TLength] | js.Array[LeftProperty[TLength]]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLeftVarargs(value: LeftProperty[TLength]*): Self = StObject.set(x, "left", js.Array(value*))
    
    inline def setLetterSpacing(value: LetterSpacingProperty[TLength] | js.Array[LetterSpacingProperty[TLength]]): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setLetterSpacingVarargs(value: LetterSpacingProperty[TLength]*): Self = StObject.set(x, "letterSpacing", js.Array(value*))
    
    inline def setLineBreak(value: LineBreakProperty | js.Array[LineBreakProperty]): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
    
    inline def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
    
    inline def setLineBreakVarargs(value: LineBreakProperty*): Self = StObject.set(x, "lineBreak", js.Array(value*))
    
    inline def setLineHeight(value: LineHeightProperty[TLength] | js.Array[LineHeightProperty[TLength]]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightStep(value: LineHeightStepProperty[TLength] | js.Array[LineHeightStepProperty[TLength]]): Self = StObject.set(x, "lineHeightStep", value.asInstanceOf[js.Any])
    
    inline def setLineHeightStepUndefined: Self = StObject.set(x, "lineHeightStep", js.undefined)
    
    inline def setLineHeightStepVarargs(value: LineHeightStepProperty[TLength]*): Self = StObject.set(x, "lineHeightStep", js.Array(value*))
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setLineHeightVarargs(value: LineHeightProperty[TLength]*): Self = StObject.set(x, "lineHeight", js.Array(value*))
    
    inline def setListStyleImage(value: ListStyleImageProperty | js.Array[ListStyleImageProperty]): Self = StObject.set(x, "listStyleImage", value.asInstanceOf[js.Any])
    
    inline def setListStyleImageUndefined: Self = StObject.set(x, "listStyleImage", js.undefined)
    
    inline def setListStyleImageVarargs(value: ListStyleImageProperty*): Self = StObject.set(x, "listStyleImage", js.Array(value*))
    
    inline def setListStylePosition(value: ListStylePositionProperty | js.Array[ListStylePositionProperty]): Self = StObject.set(x, "listStylePosition", value.asInstanceOf[js.Any])
    
    inline def setListStylePositionUndefined: Self = StObject.set(x, "listStylePosition", js.undefined)
    
    inline def setListStylePositionVarargs(value: ListStylePositionProperty*): Self = StObject.set(x, "listStylePosition", js.Array(value*))
    
    inline def setListStyleType(value: ListStyleTypeProperty | js.Array[ListStyleTypeProperty]): Self = StObject.set(x, "listStyleType", value.asInstanceOf[js.Any])
    
    inline def setListStyleTypeUndefined: Self = StObject.set(x, "listStyleType", js.undefined)
    
    inline def setListStyleTypeVarargs(value: ListStyleTypeProperty*): Self = StObject.set(x, "listStyleType", js.Array(value*))
    
    inline def setMarginBlock(value: MarginBlockProperty[TLength] | js.Array[MarginBlockProperty[TLength]]): Self = StObject.set(x, "marginBlock", value.asInstanceOf[js.Any])
    
    inline def setMarginBlockEnd(value: MarginBlockEndProperty[TLength] | js.Array[MarginBlockEndProperty[TLength]]): Self = StObject.set(x, "marginBlockEnd", value.asInstanceOf[js.Any])
    
    inline def setMarginBlockEndUndefined: Self = StObject.set(x, "marginBlockEnd", js.undefined)
    
    inline def setMarginBlockEndVarargs(value: MarginBlockEndProperty[TLength]*): Self = StObject.set(x, "marginBlockEnd", js.Array(value*))
    
    inline def setMarginBlockStart(value: MarginBlockStartProperty[TLength] | js.Array[MarginBlockStartProperty[TLength]]): Self = StObject.set(x, "marginBlockStart", value.asInstanceOf[js.Any])
    
    inline def setMarginBlockStartUndefined: Self = StObject.set(x, "marginBlockStart", js.undefined)
    
    inline def setMarginBlockStartVarargs(value: MarginBlockStartProperty[TLength]*): Self = StObject.set(x, "marginBlockStart", js.Array(value*))
    
    inline def setMarginBlockUndefined: Self = StObject.set(x, "marginBlock", js.undefined)
    
    inline def setMarginBlockVarargs(value: MarginBlockProperty[TLength]*): Self = StObject.set(x, "marginBlock", js.Array(value*))
    
    inline def setMarginBottom(value: MarginBottomProperty[TLength] | js.Array[MarginBottomProperty[TLength]]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    inline def setMarginBottomVarargs(value: MarginBottomProperty[TLength]*): Self = StObject.set(x, "marginBottom", js.Array(value*))
    
    inline def setMarginInline(value: MarginInlineProperty[TLength] | js.Array[MarginInlineProperty[TLength]]): Self = StObject.set(x, "marginInline", value.asInstanceOf[js.Any])
    
    inline def setMarginInlineEnd(value: MarginInlineEndProperty[TLength] | js.Array[MarginInlineEndProperty[TLength]]): Self = StObject.set(x, "marginInlineEnd", value.asInstanceOf[js.Any])
    
    inline def setMarginInlineEndUndefined: Self = StObject.set(x, "marginInlineEnd", js.undefined)
    
    inline def setMarginInlineEndVarargs(value: MarginInlineEndProperty[TLength]*): Self = StObject.set(x, "marginInlineEnd", js.Array(value*))
    
    inline def setMarginInlineStart(value: MarginInlineStartProperty[TLength] | js.Array[MarginInlineStartProperty[TLength]]): Self = StObject.set(x, "marginInlineStart", value.asInstanceOf[js.Any])
    
    inline def setMarginInlineStartUndefined: Self = StObject.set(x, "marginInlineStart", js.undefined)
    
    inline def setMarginInlineStartVarargs(value: MarginInlineStartProperty[TLength]*): Self = StObject.set(x, "marginInlineStart", js.Array(value*))
    
    inline def setMarginInlineUndefined: Self = StObject.set(x, "marginInline", js.undefined)
    
    inline def setMarginInlineVarargs(value: MarginInlineProperty[TLength]*): Self = StObject.set(x, "marginInline", js.Array(value*))
    
    inline def setMarginLeft(value: MarginLeftProperty[TLength] | js.Array[MarginLeftProperty[TLength]]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginLeftVarargs(value: MarginLeftProperty[TLength]*): Self = StObject.set(x, "marginLeft", js.Array(value*))
    
    inline def setMarginRight(value: MarginRightProperty[TLength] | js.Array[MarginRightProperty[TLength]]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    inline def setMarginRightVarargs(value: MarginRightProperty[TLength]*): Self = StObject.set(x, "marginRight", js.Array(value*))
    
    inline def setMarginTop(value: MarginTopProperty[TLength] | js.Array[MarginTopProperty[TLength]]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setMarginTopVarargs(value: MarginTopProperty[TLength]*): Self = StObject.set(x, "marginTop", js.Array(value*))
    
    inline def setMaskBorderMode(value: MaskBorderModeProperty | js.Array[MaskBorderModeProperty]): Self = StObject.set(x, "maskBorderMode", value.asInstanceOf[js.Any])
    
    inline def setMaskBorderModeUndefined: Self = StObject.set(x, "maskBorderMode", js.undefined)
    
    inline def setMaskBorderModeVarargs(value: MaskBorderModeProperty*): Self = StObject.set(x, "maskBorderMode", js.Array(value*))
    
    inline def setMaskBorderOutset(value: MaskBorderOutsetProperty[TLength] | js.Array[MaskBorderOutsetProperty[TLength]]): Self = StObject.set(x, "maskBorderOutset", value.asInstanceOf[js.Any])
    
    inline def setMaskBorderOutsetUndefined: Self = StObject.set(x, "maskBorderOutset", js.undefined)
    
    inline def setMaskBorderOutsetVarargs(value: MaskBorderOutsetProperty[TLength]*): Self = StObject.set(x, "maskBorderOutset", js.Array(value*))
    
    inline def setMaskBorderRepeat(value: MaskBorderRepeatProperty | js.Array[MaskBorderRepeatProperty]): Self = StObject.set(x, "maskBorderRepeat", value.asInstanceOf[js.Any])
    
    inline def setMaskBorderRepeatUndefined: Self = StObject.set(x, "maskBorderRepeat", js.undefined)
    
    inline def setMaskBorderRepeatVarargs(value: MaskBorderRepeatProperty*): Self = StObject.set(x, "maskBorderRepeat", js.Array(value*))
    
    inline def setMaskBorderSlice(value: MaskBorderSliceProperty | js.Array[MaskBorderSliceProperty]): Self = StObject.set(x, "maskBorderSlice", value.asInstanceOf[js.Any])
    
    inline def setMaskBorderSliceUndefined: Self = StObject.set(x, "maskBorderSlice", js.undefined)
    
    inline def setMaskBorderSliceVarargs(value: MaskBorderSliceProperty*): Self = StObject.set(x, "maskBorderSlice", js.Array(value*))
    
    inline def setMaskBorderSource(value: MaskBorderSourceProperty | js.Array[MaskBorderSourceProperty]): Self = StObject.set(x, "maskBorderSource", value.asInstanceOf[js.Any])
    
    inline def setMaskBorderSourceUndefined: Self = StObject.set(x, "maskBorderSource", js.undefined)
    
    inline def setMaskBorderSourceVarargs(value: MaskBorderSourceProperty*): Self = StObject.set(x, "maskBorderSource", js.Array(value*))
    
    inline def setMaskBorderWidth(value: MaskBorderWidthProperty[TLength] | js.Array[MaskBorderWidthProperty[TLength]]): Self = StObject.set(x, "maskBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setMaskBorderWidthUndefined: Self = StObject.set(x, "maskBorderWidth", js.undefined)
    
    inline def setMaskBorderWidthVarargs(value: MaskBorderWidthProperty[TLength]*): Self = StObject.set(x, "maskBorderWidth", js.Array(value*))
    
    inline def setMaskClip(value: MaskClipProperty | js.Array[MaskClipProperty]): Self = StObject.set(x, "maskClip", value.asInstanceOf[js.Any])
    
    inline def setMaskClipUndefined: Self = StObject.set(x, "maskClip", js.undefined)
    
    inline def setMaskClipVarargs(value: MaskClipProperty*): Self = StObject.set(x, "maskClip", js.Array(value*))
    
    inline def setMaskComposite(value: MaskCompositeProperty | js.Array[MaskCompositeProperty]): Self = StObject.set(x, "maskComposite", value.asInstanceOf[js.Any])
    
    inline def setMaskCompositeUndefined: Self = StObject.set(x, "maskComposite", js.undefined)
    
    inline def setMaskCompositeVarargs(value: MaskCompositeProperty*): Self = StObject.set(x, "maskComposite", js.Array(value*))
    
    inline def setMaskImage(value: MaskImageProperty | js.Array[MaskImageProperty]): Self = StObject.set(x, "maskImage", value.asInstanceOf[js.Any])
    
    inline def setMaskImageUndefined: Self = StObject.set(x, "maskImage", js.undefined)
    
    inline def setMaskImageVarargs(value: MaskImageProperty*): Self = StObject.set(x, "maskImage", js.Array(value*))
    
    inline def setMaskMode(value: MaskModeProperty | js.Array[MaskModeProperty]): Self = StObject.set(x, "maskMode", value.asInstanceOf[js.Any])
    
    inline def setMaskModeUndefined: Self = StObject.set(x, "maskMode", js.undefined)
    
    inline def setMaskModeVarargs(value: MaskModeProperty*): Self = StObject.set(x, "maskMode", js.Array(value*))
    
    inline def setMaskOrigin(value: MaskOriginProperty | js.Array[MaskOriginProperty]): Self = StObject.set(x, "maskOrigin", value.asInstanceOf[js.Any])
    
    inline def setMaskOriginUndefined: Self = StObject.set(x, "maskOrigin", js.undefined)
    
    inline def setMaskOriginVarargs(value: MaskOriginProperty*): Self = StObject.set(x, "maskOrigin", js.Array(value*))
    
    inline def setMaskPosition(value: MaskPositionProperty[TLength] | js.Array[MaskPositionProperty[TLength]]): Self = StObject.set(x, "maskPosition", value.asInstanceOf[js.Any])
    
    inline def setMaskPositionUndefined: Self = StObject.set(x, "maskPosition", js.undefined)
    
    inline def setMaskPositionVarargs(value: MaskPositionProperty[TLength]*): Self = StObject.set(x, "maskPosition", js.Array(value*))
    
    inline def setMaskRepeat(value: MaskRepeatProperty | js.Array[MaskRepeatProperty]): Self = StObject.set(x, "maskRepeat", value.asInstanceOf[js.Any])
    
    inline def setMaskRepeatUndefined: Self = StObject.set(x, "maskRepeat", js.undefined)
    
    inline def setMaskRepeatVarargs(value: MaskRepeatProperty*): Self = StObject.set(x, "maskRepeat", js.Array(value*))
    
    inline def setMaskSize(value: MaskSizeProperty[TLength] | js.Array[MaskSizeProperty[TLength]]): Self = StObject.set(x, "maskSize", value.asInstanceOf[js.Any])
    
    inline def setMaskSizeUndefined: Self = StObject.set(x, "maskSize", js.undefined)
    
    inline def setMaskSizeVarargs(value: MaskSizeProperty[TLength]*): Self = StObject.set(x, "maskSize", js.Array(value*))
    
    inline def setMaskType(value: MaskTypeProperty | js.Array[MaskTypeProperty]): Self = StObject.set(x, "maskType", value.asInstanceOf[js.Any])
    
    inline def setMaskTypeUndefined: Self = StObject.set(x, "maskType", js.undefined)
    
    inline def setMaskTypeVarargs(value: MaskTypeProperty*): Self = StObject.set(x, "maskType", js.Array(value*))
    
    inline def setMaxBlockSize(value: MaxBlockSizeProperty[TLength] | js.Array[MaxBlockSizeProperty[TLength]]): Self = StObject.set(x, "maxBlockSize", value.asInstanceOf[js.Any])
    
    inline def setMaxBlockSizeUndefined: Self = StObject.set(x, "maxBlockSize", js.undefined)
    
    inline def setMaxBlockSizeVarargs(value: MaxBlockSizeProperty[TLength]*): Self = StObject.set(x, "maxBlockSize", js.Array(value*))
    
    inline def setMaxHeight(value: MaxHeightProperty[TLength] | js.Array[MaxHeightProperty[TLength]]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxHeightVarargs(value: MaxHeightProperty[TLength]*): Self = StObject.set(x, "maxHeight", js.Array(value*))
    
    inline def setMaxInlineSize(value: MaxInlineSizeProperty[TLength] | js.Array[MaxInlineSizeProperty[TLength]]): Self = StObject.set(x, "maxInlineSize", value.asInstanceOf[js.Any])
    
    inline def setMaxInlineSizeUndefined: Self = StObject.set(x, "maxInlineSize", js.undefined)
    
    inline def setMaxInlineSizeVarargs(value: MaxInlineSizeProperty[TLength]*): Self = StObject.set(x, "maxInlineSize", js.Array(value*))
    
    inline def setMaxLines(value: MaxLinesProperty | js.Array[MaxLinesProperty]): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
    
    inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
    
    inline def setMaxLinesVarargs(value: MaxLinesProperty*): Self = StObject.set(x, "maxLines", js.Array(value*))
    
    inline def setMaxWidth(value: MaxWidthProperty[TLength] | js.Array[MaxWidthProperty[TLength]]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMaxWidthVarargs(value: MaxWidthProperty[TLength]*): Self = StObject.set(x, "maxWidth", js.Array(value*))
    
    inline def setMinBlockSize(value: MinBlockSizeProperty[TLength] | js.Array[MinBlockSizeProperty[TLength]]): Self = StObject.set(x, "minBlockSize", value.asInstanceOf[js.Any])
    
    inline def setMinBlockSizeUndefined: Self = StObject.set(x, "minBlockSize", js.undefined)
    
    inline def setMinBlockSizeVarargs(value: MinBlockSizeProperty[TLength]*): Self = StObject.set(x, "minBlockSize", js.Array(value*))
    
    inline def setMinHeight(value: MinHeightProperty[TLength] | js.Array[MinHeightProperty[TLength]]): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinHeightVarargs(value: MinHeightProperty[TLength]*): Self = StObject.set(x, "minHeight", js.Array(value*))
    
    inline def setMinInlineSize(value: MinInlineSizeProperty[TLength] | js.Array[MinInlineSizeProperty[TLength]]): Self = StObject.set(x, "minInlineSize", value.asInstanceOf[js.Any])
    
    inline def setMinInlineSizeUndefined: Self = StObject.set(x, "minInlineSize", js.undefined)
    
    inline def setMinInlineSizeVarargs(value: MinInlineSizeProperty[TLength]*): Self = StObject.set(x, "minInlineSize", js.Array(value*))
    
    inline def setMinWidth(value: MinWidthProperty[TLength] | js.Array[MinWidthProperty[TLength]]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setMinWidthVarargs(value: MinWidthProperty[TLength]*): Self = StObject.set(x, "minWidth", js.Array(value*))
    
    inline def setMixBlendMode(value: MixBlendModeProperty | js.Array[MixBlendModeProperty]): Self = StObject.set(x, "mixBlendMode", value.asInstanceOf[js.Any])
    
    inline def setMixBlendModeUndefined: Self = StObject.set(x, "mixBlendMode", js.undefined)
    
    inline def setMixBlendModeVarargs(value: MixBlendModeProperty*): Self = StObject.set(x, "mixBlendMode", js.Array(value*))
    
    inline def setMotionDistance(value: OffsetDistanceProperty[TLength] | js.Array[OffsetDistanceProperty[TLength]]): Self = StObject.set(x, "motionDistance", value.asInstanceOf[js.Any])
    
    inline def setMotionDistanceUndefined: Self = StObject.set(x, "motionDistance", js.undefined)
    
    inline def setMotionDistanceVarargs(value: OffsetDistanceProperty[TLength]*): Self = StObject.set(x, "motionDistance", js.Array(value*))
    
    inline def setMotionPath(value: OffsetPathProperty | js.Array[OffsetPathProperty]): Self = StObject.set(x, "motionPath", value.asInstanceOf[js.Any])
    
    inline def setMotionPathUndefined: Self = StObject.set(x, "motionPath", js.undefined)
    
    inline def setMotionPathVarargs(value: OffsetPathProperty*): Self = StObject.set(x, "motionPath", js.Array(value*))
    
    inline def setMotionRotation(value: OffsetRotateProperty | js.Array[OffsetRotateProperty]): Self = StObject.set(x, "motionRotation", value.asInstanceOf[js.Any])
    
    inline def setMotionRotationUndefined: Self = StObject.set(x, "motionRotation", js.undefined)
    
    inline def setMotionRotationVarargs(value: OffsetRotateProperty*): Self = StObject.set(x, "motionRotation", js.Array(value*))
    
    inline def setObjectFit(value: ObjectFitProperty | js.Array[ObjectFitProperty]): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
    
    inline def setObjectFitUndefined: Self = StObject.set(x, "objectFit", js.undefined)
    
    inline def setObjectFitVarargs(value: ObjectFitProperty*): Self = StObject.set(x, "objectFit", js.Array(value*))
    
    inline def setObjectPosition(value: ObjectPositionProperty[TLength] | js.Array[ObjectPositionProperty[TLength]]): Self = StObject.set(x, "objectPosition", value.asInstanceOf[js.Any])
    
    inline def setObjectPositionUndefined: Self = StObject.set(x, "objectPosition", js.undefined)
    
    inline def setObjectPositionVarargs(value: ObjectPositionProperty[TLength]*): Self = StObject.set(x, "objectPosition", js.Array(value*))
    
    inline def setOffsetAnchor(value: OffsetAnchorProperty[TLength] | js.Array[OffsetAnchorProperty[TLength]]): Self = StObject.set(x, "offsetAnchor", value.asInstanceOf[js.Any])
    
    inline def setOffsetAnchorUndefined: Self = StObject.set(x, "offsetAnchor", js.undefined)
    
    inline def setOffsetAnchorVarargs(value: OffsetAnchorProperty[TLength]*): Self = StObject.set(x, "offsetAnchor", js.Array(value*))
    
    inline def setOffsetDistance(value: OffsetDistanceProperty[TLength] | js.Array[OffsetDistanceProperty[TLength]]): Self = StObject.set(x, "offsetDistance", value.asInstanceOf[js.Any])
    
    inline def setOffsetDistanceUndefined: Self = StObject.set(x, "offsetDistance", js.undefined)
    
    inline def setOffsetDistanceVarargs(value: OffsetDistanceProperty[TLength]*): Self = StObject.set(x, "offsetDistance", js.Array(value*))
    
    inline def setOffsetPath(value: OffsetPathProperty | js.Array[OffsetPathProperty]): Self = StObject.set(x, "offsetPath", value.asInstanceOf[js.Any])
    
    inline def setOffsetPathUndefined: Self = StObject.set(x, "offsetPath", js.undefined)
    
    inline def setOffsetPathVarargs(value: OffsetPathProperty*): Self = StObject.set(x, "offsetPath", js.Array(value*))
    
    inline def setOffsetPosition(value: OffsetPositionProperty[TLength] | js.Array[OffsetPositionProperty[TLength]]): Self = StObject.set(x, "offsetPosition", value.asInstanceOf[js.Any])
    
    inline def setOffsetPositionUndefined: Self = StObject.set(x, "offsetPosition", js.undefined)
    
    inline def setOffsetPositionVarargs(value: OffsetPositionProperty[TLength]*): Self = StObject.set(x, "offsetPosition", js.Array(value*))
    
    inline def setOffsetRotate(value: OffsetRotateProperty | js.Array[OffsetRotateProperty]): Self = StObject.set(x, "offsetRotate", value.asInstanceOf[js.Any])
    
    inline def setOffsetRotateUndefined: Self = StObject.set(x, "offsetRotate", js.undefined)
    
    inline def setOffsetRotateVarargs(value: OffsetRotateProperty*): Self = StObject.set(x, "offsetRotate", js.Array(value*))
    
    inline def setOffsetRotation(value: OffsetRotateProperty | js.Array[OffsetRotateProperty]): Self = StObject.set(x, "offsetRotation", value.asInstanceOf[js.Any])
    
    inline def setOffsetRotationUndefined: Self = StObject.set(x, "offsetRotation", js.undefined)
    
    inline def setOffsetRotationVarargs(value: OffsetRotateProperty*): Self = StObject.set(x, "offsetRotation", js.Array(value*))
    
    inline def setOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOpacityVarargs(value: GlobalsNumber*): Self = StObject.set(x, "opacity", js.Array(value*))
    
    inline def setOrder(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: GlobalsNumber*): Self = StObject.set(x, "order", js.Array(value*))
    
    inline def setOrphans(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "orphans", value.asInstanceOf[js.Any])
    
    inline def setOrphansUndefined: Self = StObject.set(x, "orphans", js.undefined)
    
    inline def setOrphansVarargs(value: GlobalsNumber*): Self = StObject.set(x, "orphans", js.Array(value*))
    
    inline def setOutlineColor(value: OutlineColorProperty | js.Array[OutlineColorProperty]): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    inline def setOutlineColorVarargs(value: OutlineColorProperty*): Self = StObject.set(x, "outlineColor", js.Array(value*))
    
    inline def setOutlineOffset(value: OutlineOffsetProperty[TLength] | js.Array[OutlineOffsetProperty[TLength]]): Self = StObject.set(x, "outlineOffset", value.asInstanceOf[js.Any])
    
    inline def setOutlineOffsetUndefined: Self = StObject.set(x, "outlineOffset", js.undefined)
    
    inline def setOutlineOffsetVarargs(value: OutlineOffsetProperty[TLength]*): Self = StObject.set(x, "outlineOffset", js.Array(value*))
    
    inline def setOutlineStyle(value: OutlineStyleProperty | js.Array[OutlineStyleProperty]): Self = StObject.set(x, "outlineStyle", value.asInstanceOf[js.Any])
    
    inline def setOutlineStyleUndefined: Self = StObject.set(x, "outlineStyle", js.undefined)
    
    inline def setOutlineStyleVarargs(value: OutlineStyleProperty*): Self = StObject.set(x, "outlineStyle", js.Array(value*))
    
    inline def setOutlineWidth(value: OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
    
    inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
    
    inline def setOutlineWidthVarargs(value: OutlineWidthProperty[TLength]*): Self = StObject.set(x, "outlineWidth", js.Array(value*))
    
    inline def setOverflow(value: OverflowProperty | js.Array[OverflowProperty]): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowAnchor(value: OverflowAnchorProperty | js.Array[OverflowAnchorProperty]): Self = StObject.set(x, "overflowAnchor", value.asInstanceOf[js.Any])
    
    inline def setOverflowAnchorUndefined: Self = StObject.set(x, "overflowAnchor", js.undefined)
    
    inline def setOverflowAnchorVarargs(value: OverflowAnchorProperty*): Self = StObject.set(x, "overflowAnchor", js.Array(value*))
    
    inline def setOverflowBlock(value: OverflowBlockProperty | js.Array[OverflowBlockProperty]): Self = StObject.set(x, "overflowBlock", value.asInstanceOf[js.Any])
    
    inline def setOverflowBlockUndefined: Self = StObject.set(x, "overflowBlock", js.undefined)
    
    inline def setOverflowBlockVarargs(value: OverflowBlockProperty*): Self = StObject.set(x, "overflowBlock", js.Array(value*))
    
    inline def setOverflowClipBox(value: OverflowClipBoxProperty | js.Array[OverflowClipBoxProperty]): Self = StObject.set(x, "overflowClipBox", value.asInstanceOf[js.Any])
    
    inline def setOverflowClipBoxUndefined: Self = StObject.set(x, "overflowClipBox", js.undefined)
    
    inline def setOverflowClipBoxVarargs(value: OverflowClipBoxProperty*): Self = StObject.set(x, "overflowClipBox", js.Array(value*))
    
    inline def setOverflowInline(value: OverflowInlineProperty | js.Array[OverflowInlineProperty]): Self = StObject.set(x, "overflowInline", value.asInstanceOf[js.Any])
    
    inline def setOverflowInlineUndefined: Self = StObject.set(x, "overflowInline", js.undefined)
    
    inline def setOverflowInlineVarargs(value: OverflowInlineProperty*): Self = StObject.set(x, "overflowInline", js.Array(value*))
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setOverflowVarargs(value: OverflowProperty*): Self = StObject.set(x, "overflow", js.Array(value*))
    
    inline def setOverflowWrap(value: OverflowWrapProperty | js.Array[OverflowWrapProperty]): Self = StObject.set(x, "overflowWrap", value.asInstanceOf[js.Any])
    
    inline def setOverflowWrapUndefined: Self = StObject.set(x, "overflowWrap", js.undefined)
    
    inline def setOverflowWrapVarargs(value: OverflowWrapProperty*): Self = StObject.set(x, "overflowWrap", js.Array(value*))
    
    inline def setOverflowX(value: OverflowXProperty | js.Array[OverflowXProperty]): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
    
    inline def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
    
    inline def setOverflowXVarargs(value: OverflowXProperty*): Self = StObject.set(x, "overflowX", js.Array(value*))
    
    inline def setOverflowY(value: OverflowYProperty | js.Array[OverflowYProperty]): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
    
    inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
    
    inline def setOverflowYVarargs(value: OverflowYProperty*): Self = StObject.set(x, "overflowY", js.Array(value*))
    
    inline def setOverscrollBehavior(value: OverscrollBehaviorProperty | js.Array[OverscrollBehaviorProperty]): Self = StObject.set(x, "overscrollBehavior", value.asInstanceOf[js.Any])
    
    inline def setOverscrollBehaviorUndefined: Self = StObject.set(x, "overscrollBehavior", js.undefined)
    
    inline def setOverscrollBehaviorVarargs(value: OverscrollBehaviorProperty*): Self = StObject.set(x, "overscrollBehavior", js.Array(value*))
    
    inline def setOverscrollBehaviorX(value: OverscrollBehaviorXProperty | js.Array[OverscrollBehaviorXProperty]): Self = StObject.set(x, "overscrollBehaviorX", value.asInstanceOf[js.Any])
    
    inline def setOverscrollBehaviorXUndefined: Self = StObject.set(x, "overscrollBehaviorX", js.undefined)
    
    inline def setOverscrollBehaviorXVarargs(value: OverscrollBehaviorXProperty*): Self = StObject.set(x, "overscrollBehaviorX", js.Array(value*))
    
    inline def setOverscrollBehaviorY(value: OverscrollBehaviorYProperty | js.Array[OverscrollBehaviorYProperty]): Self = StObject.set(x, "overscrollBehaviorY", value.asInstanceOf[js.Any])
    
    inline def setOverscrollBehaviorYUndefined: Self = StObject.set(x, "overscrollBehaviorY", js.undefined)
    
    inline def setOverscrollBehaviorYVarargs(value: OverscrollBehaviorYProperty*): Self = StObject.set(x, "overscrollBehaviorY", js.Array(value*))
    
    inline def setPaddingBlock(value: PaddingBlockProperty[TLength] | js.Array[PaddingBlockProperty[TLength]]): Self = StObject.set(x, "paddingBlock", value.asInstanceOf[js.Any])
    
    inline def setPaddingBlockEnd(value: PaddingBlockEndProperty[TLength] | js.Array[PaddingBlockEndProperty[TLength]]): Self = StObject.set(x, "paddingBlockEnd", value.asInstanceOf[js.Any])
    
    inline def setPaddingBlockEndUndefined: Self = StObject.set(x, "paddingBlockEnd", js.undefined)
    
    inline def setPaddingBlockEndVarargs(value: PaddingBlockEndProperty[TLength]*): Self = StObject.set(x, "paddingBlockEnd", js.Array(value*))
    
    inline def setPaddingBlockStart(value: PaddingBlockStartProperty[TLength] | js.Array[PaddingBlockStartProperty[TLength]]): Self = StObject.set(x, "paddingBlockStart", value.asInstanceOf[js.Any])
    
    inline def setPaddingBlockStartUndefined: Self = StObject.set(x, "paddingBlockStart", js.undefined)
    
    inline def setPaddingBlockStartVarargs(value: PaddingBlockStartProperty[TLength]*): Self = StObject.set(x, "paddingBlockStart", js.Array(value*))
    
    inline def setPaddingBlockUndefined: Self = StObject.set(x, "paddingBlock", js.undefined)
    
    inline def setPaddingBlockVarargs(value: PaddingBlockProperty[TLength]*): Self = StObject.set(x, "paddingBlock", js.Array(value*))
    
    inline def setPaddingBottom(value: PaddingBottomProperty[TLength] | js.Array[PaddingBottomProperty[TLength]]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    inline def setPaddingBottomVarargs(value: PaddingBottomProperty[TLength]*): Self = StObject.set(x, "paddingBottom", js.Array(value*))
    
    inline def setPaddingInline(value: PaddingInlineProperty[TLength] | js.Array[PaddingInlineProperty[TLength]]): Self = StObject.set(x, "paddingInline", value.asInstanceOf[js.Any])
    
    inline def setPaddingInlineEnd(value: PaddingInlineEndProperty[TLength] | js.Array[PaddingInlineEndProperty[TLength]]): Self = StObject.set(x, "paddingInlineEnd", value.asInstanceOf[js.Any])
    
    inline def setPaddingInlineEndUndefined: Self = StObject.set(x, "paddingInlineEnd", js.undefined)
    
    inline def setPaddingInlineEndVarargs(value: PaddingInlineEndProperty[TLength]*): Self = StObject.set(x, "paddingInlineEnd", js.Array(value*))
    
    inline def setPaddingInlineStart(value: PaddingInlineStartProperty[TLength] | js.Array[PaddingInlineStartProperty[TLength]]): Self = StObject.set(x, "paddingInlineStart", value.asInstanceOf[js.Any])
    
    inline def setPaddingInlineStartUndefined: Self = StObject.set(x, "paddingInlineStart", js.undefined)
    
    inline def setPaddingInlineStartVarargs(value: PaddingInlineStartProperty[TLength]*): Self = StObject.set(x, "paddingInlineStart", js.Array(value*))
    
    inline def setPaddingInlineUndefined: Self = StObject.set(x, "paddingInline", js.undefined)
    
    inline def setPaddingInlineVarargs(value: PaddingInlineProperty[TLength]*): Self = StObject.set(x, "paddingInline", js.Array(value*))
    
    inline def setPaddingLeft(value: PaddingLeftProperty[TLength] | js.Array[PaddingLeftProperty[TLength]]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    inline def setPaddingLeftVarargs(value: PaddingLeftProperty[TLength]*): Self = StObject.set(x, "paddingLeft", js.Array(value*))
    
    inline def setPaddingRight(value: PaddingRightProperty[TLength] | js.Array[PaddingRightProperty[TLength]]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    inline def setPaddingRightVarargs(value: PaddingRightProperty[TLength]*): Self = StObject.set(x, "paddingRight", js.Array(value*))
    
    inline def setPaddingTop(value: PaddingTopProperty[TLength] | js.Array[PaddingTopProperty[TLength]]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    inline def setPaddingTopVarargs(value: PaddingTopProperty[TLength]*): Self = StObject.set(x, "paddingTop", js.Array(value*))
    
    inline def setPageBreakAfter(value: PageBreakAfterProperty | js.Array[PageBreakAfterProperty]): Self = StObject.set(x, "pageBreakAfter", value.asInstanceOf[js.Any])
    
    inline def setPageBreakAfterUndefined: Self = StObject.set(x, "pageBreakAfter", js.undefined)
    
    inline def setPageBreakAfterVarargs(value: PageBreakAfterProperty*): Self = StObject.set(x, "pageBreakAfter", js.Array(value*))
    
    inline def setPageBreakBefore(value: PageBreakBeforeProperty | js.Array[PageBreakBeforeProperty]): Self = StObject.set(x, "pageBreakBefore", value.asInstanceOf[js.Any])
    
    inline def setPageBreakBeforeUndefined: Self = StObject.set(x, "pageBreakBefore", js.undefined)
    
    inline def setPageBreakBeforeVarargs(value: PageBreakBeforeProperty*): Self = StObject.set(x, "pageBreakBefore", js.Array(value*))
    
    inline def setPageBreakInside(value: PageBreakInsideProperty | js.Array[PageBreakInsideProperty]): Self = StObject.set(x, "pageBreakInside", value.asInstanceOf[js.Any])
    
    inline def setPageBreakInsideUndefined: Self = StObject.set(x, "pageBreakInside", js.undefined)
    
    inline def setPageBreakInsideVarargs(value: PageBreakInsideProperty*): Self = StObject.set(x, "pageBreakInside", js.Array(value*))
    
    inline def setPaintOrder(value: PaintOrderProperty | js.Array[PaintOrderProperty]): Self = StObject.set(x, "paintOrder", value.asInstanceOf[js.Any])
    
    inline def setPaintOrderUndefined: Self = StObject.set(x, "paintOrder", js.undefined)
    
    inline def setPaintOrderVarargs(value: PaintOrderProperty*): Self = StObject.set(x, "paintOrder", js.Array(value*))
    
    inline def setPerspective(value: PerspectiveProperty[TLength] | js.Array[PerspectiveProperty[TLength]]): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
    
    inline def setPerspectiveOrigin(value: PerspectiveOriginProperty[TLength] | js.Array[PerspectiveOriginProperty[TLength]]): Self = StObject.set(x, "perspectiveOrigin", value.asInstanceOf[js.Any])
    
    inline def setPerspectiveOriginUndefined: Self = StObject.set(x, "perspectiveOrigin", js.undefined)
    
    inline def setPerspectiveOriginVarargs(value: PerspectiveOriginProperty[TLength]*): Self = StObject.set(x, "perspectiveOrigin", js.Array(value*))
    
    inline def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
    
    inline def setPerspectiveVarargs(value: PerspectiveProperty[TLength]*): Self = StObject.set(x, "perspective", js.Array(value*))
    
    inline def setPlaceContent(value: PlaceContentProperty | js.Array[PlaceContentProperty]): Self = StObject.set(x, "placeContent", value.asInstanceOf[js.Any])
    
    inline def setPlaceContentUndefined: Self = StObject.set(x, "placeContent", js.undefined)
    
    inline def setPlaceContentVarargs(value: PlaceContentProperty*): Self = StObject.set(x, "placeContent", js.Array(value*))
    
    inline def setPointerEvents(value: PointerEventsProperty | js.Array[PointerEventsProperty]): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    inline def setPointerEventsVarargs(value: PointerEventsProperty*): Self = StObject.set(x, "pointerEvents", js.Array(value*))
    
    inline def setPosition(value: PositionProperty | js.Array[PositionProperty]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPositionVarargs(value: PositionProperty*): Self = StObject.set(x, "position", js.Array(value*))
    
    inline def setQuotes(value: QuotesProperty | js.Array[QuotesProperty]): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
    
    inline def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
    
    inline def setQuotesVarargs(value: QuotesProperty*): Self = StObject.set(x, "quotes", js.Array(value*))
    
    inline def setResize(value: ResizeProperty | js.Array[ResizeProperty]): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setResizeVarargs(value: ResizeProperty*): Self = StObject.set(x, "resize", js.Array(value*))
    
    inline def setRight(value: RightProperty[TLength] | js.Array[RightProperty[TLength]]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setRightVarargs(value: RightProperty[TLength]*): Self = StObject.set(x, "right", js.Array(value*))
    
    inline def setRotate(value: RotateProperty | js.Array[RotateProperty]): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setRotateVarargs(value: RotateProperty*): Self = StObject.set(x, "rotate", js.Array(value*))
    
    inline def setRowGap(value: RowGapProperty[TLength] | js.Array[RowGapProperty[TLength]]): Self = StObject.set(x, "rowGap", value.asInstanceOf[js.Any])
    
    inline def setRowGapUndefined: Self = StObject.set(x, "rowGap", js.undefined)
    
    inline def setRowGapVarargs(value: RowGapProperty[TLength]*): Self = StObject.set(x, "rowGap", js.Array(value*))
    
    inline def setRubyAlign(value: RubyAlignProperty | js.Array[RubyAlignProperty]): Self = StObject.set(x, "rubyAlign", value.asInstanceOf[js.Any])
    
    inline def setRubyAlignUndefined: Self = StObject.set(x, "rubyAlign", js.undefined)
    
    inline def setRubyAlignVarargs(value: RubyAlignProperty*): Self = StObject.set(x, "rubyAlign", js.Array(value*))
    
    inline def setRubyMerge(value: RubyMergeProperty | js.Array[RubyMergeProperty]): Self = StObject.set(x, "rubyMerge", value.asInstanceOf[js.Any])
    
    inline def setRubyMergeUndefined: Self = StObject.set(x, "rubyMerge", js.undefined)
    
    inline def setRubyMergeVarargs(value: RubyMergeProperty*): Self = StObject.set(x, "rubyMerge", js.Array(value*))
    
    inline def setRubyPosition(value: RubyPositionProperty | js.Array[RubyPositionProperty]): Self = StObject.set(x, "rubyPosition", value.asInstanceOf[js.Any])
    
    inline def setRubyPositionUndefined: Self = StObject.set(x, "rubyPosition", js.undefined)
    
    inline def setRubyPositionVarargs(value: RubyPositionProperty*): Self = StObject.set(x, "rubyPosition", js.Array(value*))
    
    inline def setScale(value: ScaleProperty | js.Array[ScaleProperty]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setScaleVarargs(value: ScaleProperty*): Self = StObject.set(x, "scale", js.Array(value*))
    
    inline def setScrollBehavior(value: ScrollBehaviorProperty | js.Array[ScrollBehaviorProperty]): Self = StObject.set(x, "scrollBehavior", value.asInstanceOf[js.Any])
    
    inline def setScrollBehaviorUndefined: Self = StObject.set(x, "scrollBehavior", js.undefined)
    
    inline def setScrollBehaviorVarargs(value: ScrollBehaviorProperty*): Self = StObject.set(x, "scrollBehavior", js.Array(value*))
    
    inline def setScrollMargin(value: ScrollMarginProperty[TLength] | js.Array[ScrollMarginProperty[TLength]]): Self = StObject.set(x, "scrollMargin", value.asInstanceOf[js.Any])
    
    inline def setScrollMarginBlock(value: ScrollMarginBlockProperty[TLength] | js.Array[ScrollMarginBlockProperty[TLength]]): Self = StObject.set(x, "scrollMarginBlock", value.asInstanceOf[js.Any])
    
    inline def setScrollMarginBlockEnd(value: ScrollMarginBlockEndProperty[TLength] | js.Array[ScrollMarginBlockEndProperty[TLength]]): Self = StObject.set(x, "scrollMarginBlockEnd", value.asInstanceOf[js.Any])
    
    inline def setScrollMarginBlockEndUndefined: Self = StObject.set(x, "scrollMarginBlockEnd", js.undefined)
    
    inline def setScrollMarginBlockEndVarargs(value: ScrollMarginBlockEndProperty[TLength]*): Self = StObject.set(x, "scrollMarginBlockEnd", js.Array(value*))
    
    inline def setScrollMarginBlockStart(value: ScrollMarginBlockStartProperty[TLength] | js.Array[ScrollMarginBlockStartProperty[TLength]]): Self = StObject.set(x, "scrollMarginBlockStart", value.asInstanceOf[js.Any])
    
    inline def setScrollMarginBlockStartUndefined: Self = StObject.set(x, "scrollMarginBlockStart", js.undefined)
    
    inline def setScrollMarginBlockStartVarargs(value: ScrollMarginBlockStartProperty[TLength]*): Self = StObject.set(x, "scrollMarginBlockStart", js.Array(value*))
    
    inline def setScrollMarginBlockUndefined: Self = StObject.set(x, "scrollMarginBlock", js.undefined)
    
    inline def setScrollMarginBlockVarargs(value: ScrollMarginBlockProperty[TLength]*): Self = StObject.set(x, "scrollMarginBlock", js.Array(value*))
    
    inline def setScrollMarginBottom(value: ScrollMarginBottomProperty[TLength] | js.Array[ScrollMarginBottomProperty[TLength]]): Self = StObject.set(x, "scrollMarginBottom", value.asInstanceOf[js.Any])
    
    inline def setScrollMarginBottomUndefined: Self = StObject.set(x, "scrollMarginBottom", js.undefined)
    
    inline def setScrollMarginBottomVarargs(value: ScrollMarginBottomProperty[TLength]*): Self = StObject.set(x, "scrollMarginBottom", js.Array(value*))
    
    inline def setScrollMarginInlineEnd(value: ScrollMarginInlineEndProperty[TLength] | js.Array[ScrollMarginInlineEndProperty[TLength]]): Self = StObject.set(x, "scrollMarginInlineEnd", value.asInstanceOf[js.Any])
    
    inline def setScrollMarginInlineEndUndefined: Self = StObject.set(x, "scrollMarginInlineEnd", js.undefined)
    
    inline def setScrollMarginInlineEndVarargs(value: ScrollMarginInlineEndProperty[TLength]*): Self = StObject.set(x, "scrollMarginInlineEnd", js.Array(value*))
    
    inline def setScrollMarginInlineStart(
      value: ScrollMarginInlineStartProperty[TLength] | js.Array[ScrollMarginInlineStartProperty[TLength]]
    ): Self = StObject.set(x, "scrollMarginInlineStart", value.asInstanceOf[js.Any])
    
    inline def setScrollMarginInlineStartUndefined: Self = StObject.set(x, "scrollMarginInlineStart", js.undefined)
    
    inline def setScrollMarginInlineStartVarargs(value: ScrollMarginInlineStartProperty[TLength]*): Self = StObject.set(x, "scrollMarginInlineStart", js.Array(value*))
    
    inline def setScrollMarginLeft(value: ScrollMarginLeftProperty[TLength] | js.Array[ScrollMarginLeftProperty[TLength]]): Self = StObject.set(x, "scrollMarginLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollMarginLeftUndefined: Self = StObject.set(x, "scrollMarginLeft", js.undefined)
    
    inline def setScrollMarginLeftVarargs(value: ScrollMarginLeftProperty[TLength]*): Self = StObject.set(x, "scrollMarginLeft", js.Array(value*))
    
    inline def setScrollMarginRight(value: ScrollMarginRightProperty[TLength] | js.Array[ScrollMarginRightProperty[TLength]]): Self = StObject.set(x, "scrollMarginRight", value.asInstanceOf[js.Any])
    
    inline def setScrollMarginRightUndefined: Self = StObject.set(x, "scrollMarginRight", js.undefined)
    
    inline def setScrollMarginRightVarargs(value: ScrollMarginRightProperty[TLength]*): Self = StObject.set(x, "scrollMarginRight", js.Array(value*))
    
    inline def setScrollMarginTop(value: ScrollMarginTopProperty[TLength] | js.Array[ScrollMarginTopProperty[TLength]]): Self = StObject.set(x, "scrollMarginTop", value.asInstanceOf[js.Any])
    
    inline def setScrollMarginTopUndefined: Self = StObject.set(x, "scrollMarginTop", js.undefined)
    
    inline def setScrollMarginTopVarargs(value: ScrollMarginTopProperty[TLength]*): Self = StObject.set(x, "scrollMarginTop", js.Array(value*))
    
    inline def setScrollMarginUndefined: Self = StObject.set(x, "scrollMargin", js.undefined)
    
    inline def setScrollMarginVarargs(value: ScrollMarginProperty[TLength]*): Self = StObject.set(x, "scrollMargin", js.Array(value*))
    
    inline def setScrollPadding(value: ScrollPaddingProperty[TLength] | js.Array[ScrollPaddingProperty[TLength]]): Self = StObject.set(x, "scrollPadding", value.asInstanceOf[js.Any])
    
    inline def setScrollPaddingBlock(value: ScrollPaddingBlockProperty[TLength] | js.Array[ScrollPaddingBlockProperty[TLength]]): Self = StObject.set(x, "scrollPaddingBlock", value.asInstanceOf[js.Any])
    
    inline def setScrollPaddingBlockEnd(value: ScrollPaddingBlockEndProperty[TLength] | js.Array[ScrollPaddingBlockEndProperty[TLength]]): Self = StObject.set(x, "scrollPaddingBlockEnd", value.asInstanceOf[js.Any])
    
    inline def setScrollPaddingBlockEndUndefined: Self = StObject.set(x, "scrollPaddingBlockEnd", js.undefined)
    
    inline def setScrollPaddingBlockEndVarargs(value: ScrollPaddingBlockEndProperty[TLength]*): Self = StObject.set(x, "scrollPaddingBlockEnd", js.Array(value*))
    
    inline def setScrollPaddingBlockStart(
      value: ScrollPaddingBlockStartProperty[TLength] | js.Array[ScrollPaddingBlockStartProperty[TLength]]
    ): Self = StObject.set(x, "scrollPaddingBlockStart", value.asInstanceOf[js.Any])
    
    inline def setScrollPaddingBlockStartUndefined: Self = StObject.set(x, "scrollPaddingBlockStart", js.undefined)
    
    inline def setScrollPaddingBlockStartVarargs(value: ScrollPaddingBlockStartProperty[TLength]*): Self = StObject.set(x, "scrollPaddingBlockStart", js.Array(value*))
    
    inline def setScrollPaddingBlockUndefined: Self = StObject.set(x, "scrollPaddingBlock", js.undefined)
    
    inline def setScrollPaddingBlockVarargs(value: ScrollPaddingBlockProperty[TLength]*): Self = StObject.set(x, "scrollPaddingBlock", js.Array(value*))
    
    inline def setScrollPaddingBottom(value: ScrollPaddingBottomProperty[TLength] | js.Array[ScrollPaddingBottomProperty[TLength]]): Self = StObject.set(x, "scrollPaddingBottom", value.asInstanceOf[js.Any])
    
    inline def setScrollPaddingBottomUndefined: Self = StObject.set(x, "scrollPaddingBottom", js.undefined)
    
    inline def setScrollPaddingBottomVarargs(value: ScrollPaddingBottomProperty[TLength]*): Self = StObject.set(x, "scrollPaddingBottom", js.Array(value*))
    
    inline def setScrollPaddingInline(value: ScrollPaddingInlineProperty[TLength] | js.Array[ScrollPaddingInlineProperty[TLength]]): Self = StObject.set(x, "scrollPaddingInline", value.asInstanceOf[js.Any])
    
    inline def setScrollPaddingInlineEnd(value: ScrollPaddingInlineEndProperty[TLength] | js.Array[ScrollPaddingInlineEndProperty[TLength]]): Self = StObject.set(x, "scrollPaddingInlineEnd", value.asInstanceOf[js.Any])
    
    inline def setScrollPaddingInlineEndUndefined: Self = StObject.set(x, "scrollPaddingInlineEnd", js.undefined)
    
    inline def setScrollPaddingInlineEndVarargs(value: ScrollPaddingInlineEndProperty[TLength]*): Self = StObject.set(x, "scrollPaddingInlineEnd", js.Array(value*))
    
    inline def setScrollPaddingInlineStart(
      value: ScrollPaddingInlineStartProperty[TLength] | js.Array[ScrollPaddingInlineStartProperty[TLength]]
    ): Self = StObject.set(x, "scrollPaddingInlineStart", value.asInstanceOf[js.Any])
    
    inline def setScrollPaddingInlineStartUndefined: Self = StObject.set(x, "scrollPaddingInlineStart", js.undefined)
    
    inline def setScrollPaddingInlineStartVarargs(value: ScrollPaddingInlineStartProperty[TLength]*): Self = StObject.set(x, "scrollPaddingInlineStart", js.Array(value*))
    
    inline def setScrollPaddingInlineUndefined: Self = StObject.set(x, "scrollPaddingInline", js.undefined)
    
    inline def setScrollPaddingInlineVarargs(value: ScrollPaddingInlineProperty[TLength]*): Self = StObject.set(x, "scrollPaddingInline", js.Array(value*))
    
    inline def setScrollPaddingLeft(value: ScrollPaddingLeftProperty[TLength] | js.Array[ScrollPaddingLeftProperty[TLength]]): Self = StObject.set(x, "scrollPaddingLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollPaddingLeftUndefined: Self = StObject.set(x, "scrollPaddingLeft", js.undefined)
    
    inline def setScrollPaddingLeftVarargs(value: ScrollPaddingLeftProperty[TLength]*): Self = StObject.set(x, "scrollPaddingLeft", js.Array(value*))
    
    inline def setScrollPaddingRight(value: ScrollPaddingRightProperty[TLength] | js.Array[ScrollPaddingRightProperty[TLength]]): Self = StObject.set(x, "scrollPaddingRight", value.asInstanceOf[js.Any])
    
    inline def setScrollPaddingRightUndefined: Self = StObject.set(x, "scrollPaddingRight", js.undefined)
    
    inline def setScrollPaddingRightVarargs(value: ScrollPaddingRightProperty[TLength]*): Self = StObject.set(x, "scrollPaddingRight", js.Array(value*))
    
    inline def setScrollPaddingTop(value: ScrollPaddingTopProperty[TLength] | js.Array[ScrollPaddingTopProperty[TLength]]): Self = StObject.set(x, "scrollPaddingTop", value.asInstanceOf[js.Any])
    
    inline def setScrollPaddingTopUndefined: Self = StObject.set(x, "scrollPaddingTop", js.undefined)
    
    inline def setScrollPaddingTopVarargs(value: ScrollPaddingTopProperty[TLength]*): Self = StObject.set(x, "scrollPaddingTop", js.Array(value*))
    
    inline def setScrollPaddingUndefined: Self = StObject.set(x, "scrollPadding", js.undefined)
    
    inline def setScrollPaddingVarargs(value: ScrollPaddingProperty[TLength]*): Self = StObject.set(x, "scrollPadding", js.Array(value*))
    
    inline def setScrollSnapAlign(value: ScrollSnapAlignProperty | js.Array[ScrollSnapAlignProperty]): Self = StObject.set(x, "scrollSnapAlign", value.asInstanceOf[js.Any])
    
    inline def setScrollSnapAlignUndefined: Self = StObject.set(x, "scrollSnapAlign", js.undefined)
    
    inline def setScrollSnapAlignVarargs(value: ScrollSnapAlignProperty*): Self = StObject.set(x, "scrollSnapAlign", js.Array(value*))
    
    inline def setScrollSnapType(value: ScrollSnapTypeProperty | js.Array[ScrollSnapTypeProperty]): Self = StObject.set(x, "scrollSnapType", value.asInstanceOf[js.Any])
    
    inline def setScrollSnapTypeUndefined: Self = StObject.set(x, "scrollSnapType", js.undefined)
    
    inline def setScrollSnapTypeVarargs(value: ScrollSnapTypeProperty*): Self = StObject.set(x, "scrollSnapType", js.Array(value*))
    
    inline def setScrollbarColor(value: ScrollbarColorProperty | js.Array[ScrollbarColorProperty]): Self = StObject.set(x, "scrollbarColor", value.asInstanceOf[js.Any])
    
    inline def setScrollbarColorUndefined: Self = StObject.set(x, "scrollbarColor", js.undefined)
    
    inline def setScrollbarColorVarargs(value: ScrollbarColorProperty*): Self = StObject.set(x, "scrollbarColor", js.Array(value*))
    
    inline def setScrollbarWidth(value: ScrollbarWidthProperty | js.Array[ScrollbarWidthProperty]): Self = StObject.set(x, "scrollbarWidth", value.asInstanceOf[js.Any])
    
    inline def setScrollbarWidthUndefined: Self = StObject.set(x, "scrollbarWidth", js.undefined)
    
    inline def setScrollbarWidthVarargs(value: ScrollbarWidthProperty*): Self = StObject.set(x, "scrollbarWidth", js.Array(value*))
    
    inline def setShapeImageThreshold(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "shapeImageThreshold", value.asInstanceOf[js.Any])
    
    inline def setShapeImageThresholdUndefined: Self = StObject.set(x, "shapeImageThreshold", js.undefined)
    
    inline def setShapeImageThresholdVarargs(value: GlobalsNumber*): Self = StObject.set(x, "shapeImageThreshold", js.Array(value*))
    
    inline def setShapeMargin(value: ShapeMarginProperty[TLength] | js.Array[ShapeMarginProperty[TLength]]): Self = StObject.set(x, "shapeMargin", value.asInstanceOf[js.Any])
    
    inline def setShapeMarginUndefined: Self = StObject.set(x, "shapeMargin", js.undefined)
    
    inline def setShapeMarginVarargs(value: ShapeMarginProperty[TLength]*): Self = StObject.set(x, "shapeMargin", js.Array(value*))
    
    inline def setShapeOutside(value: ShapeOutsideProperty | js.Array[ShapeOutsideProperty]): Self = StObject.set(x, "shapeOutside", value.asInstanceOf[js.Any])
    
    inline def setShapeOutsideUndefined: Self = StObject.set(x, "shapeOutside", js.undefined)
    
    inline def setShapeOutsideVarargs(value: ShapeOutsideProperty*): Self = StObject.set(x, "shapeOutside", js.Array(value*))
    
    inline def setTabSize(value: TabSizeProperty[TLength] | js.Array[TabSizeProperty[TLength]]): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
    
    inline def setTabSizeVarargs(value: TabSizeProperty[TLength]*): Self = StObject.set(x, "tabSize", js.Array(value*))
    
    inline def setTableLayout(value: TableLayoutProperty | js.Array[TableLayoutProperty]): Self = StObject.set(x, "tableLayout", value.asInstanceOf[js.Any])
    
    inline def setTableLayoutUndefined: Self = StObject.set(x, "tableLayout", js.undefined)
    
    inline def setTableLayoutVarargs(value: TableLayoutProperty*): Self = StObject.set(x, "tableLayout", js.Array(value*))
    
    inline def setTextAlign(value: TextAlignProperty | js.Array[TextAlignProperty]): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignLast(value: TextAlignLastProperty | js.Array[TextAlignLastProperty]): Self = StObject.set(x, "textAlignLast", value.asInstanceOf[js.Any])
    
    inline def setTextAlignLastUndefined: Self = StObject.set(x, "textAlignLast", js.undefined)
    
    inline def setTextAlignLastVarargs(value: TextAlignLastProperty*): Self = StObject.set(x, "textAlignLast", js.Array(value*))
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextAlignVarargs(value: TextAlignProperty*): Self = StObject.set(x, "textAlign", js.Array(value*))
    
    inline def setTextCombineUpright(value: TextCombineUprightProperty | js.Array[TextCombineUprightProperty]): Self = StObject.set(x, "textCombineUpright", value.asInstanceOf[js.Any])
    
    inline def setTextCombineUprightUndefined: Self = StObject.set(x, "textCombineUpright", js.undefined)
    
    inline def setTextCombineUprightVarargs(value: TextCombineUprightProperty*): Self = StObject.set(x, "textCombineUpright", js.Array(value*))
    
    inline def setTextDecorationColor(value: TextDecorationColorProperty | js.Array[TextDecorationColorProperty]): Self = StObject.set(x, "textDecorationColor", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationColorUndefined: Self = StObject.set(x, "textDecorationColor", js.undefined)
    
    inline def setTextDecorationColorVarargs(value: TextDecorationColorProperty*): Self = StObject.set(x, "textDecorationColor", js.Array(value*))
    
    inline def setTextDecorationLine(value: TextDecorationLineProperty | js.Array[TextDecorationLineProperty]): Self = StObject.set(x, "textDecorationLine", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationLineUndefined: Self = StObject.set(x, "textDecorationLine", js.undefined)
    
    inline def setTextDecorationLineVarargs(value: TextDecorationLineProperty*): Self = StObject.set(x, "textDecorationLine", js.Array(value*))
    
    inline def setTextDecorationSkip(value: TextDecorationSkipProperty | js.Array[TextDecorationSkipProperty]): Self = StObject.set(x, "textDecorationSkip", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationSkipInk(value: TextDecorationSkipInkProperty | js.Array[TextDecorationSkipInkProperty]): Self = StObject.set(x, "textDecorationSkipInk", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationSkipInkUndefined: Self = StObject.set(x, "textDecorationSkipInk", js.undefined)
    
    inline def setTextDecorationSkipInkVarargs(value: TextDecorationSkipInkProperty*): Self = StObject.set(x, "textDecorationSkipInk", js.Array(value*))
    
    inline def setTextDecorationSkipUndefined: Self = StObject.set(x, "textDecorationSkip", js.undefined)
    
    inline def setTextDecorationSkipVarargs(value: TextDecorationSkipProperty*): Self = StObject.set(x, "textDecorationSkip", js.Array(value*))
    
    inline def setTextDecorationStyle(value: TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]): Self = StObject.set(x, "textDecorationStyle", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationStyleUndefined: Self = StObject.set(x, "textDecorationStyle", js.undefined)
    
    inline def setTextDecorationStyleVarargs(value: TextDecorationStyleProperty*): Self = StObject.set(x, "textDecorationStyle", js.Array(value*))
    
    inline def setTextEmphasisColor(value: TextEmphasisColorProperty | js.Array[TextEmphasisColorProperty]): Self = StObject.set(x, "textEmphasisColor", value.asInstanceOf[js.Any])
    
    inline def setTextEmphasisColorUndefined: Self = StObject.set(x, "textEmphasisColor", js.undefined)
    
    inline def setTextEmphasisColorVarargs(value: TextEmphasisColorProperty*): Self = StObject.set(x, "textEmphasisColor", js.Array(value*))
    
    inline def setTextEmphasisPosition(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "textEmphasisPosition", value.asInstanceOf[js.Any])
    
    inline def setTextEmphasisPositionUndefined: Self = StObject.set(x, "textEmphasisPosition", js.undefined)
    
    inline def setTextEmphasisPositionVarargs(value: GlobalsString*): Self = StObject.set(x, "textEmphasisPosition", js.Array(value*))
    
    inline def setTextEmphasisStyle(value: TextEmphasisStyleProperty | js.Array[TextEmphasisStyleProperty]): Self = StObject.set(x, "textEmphasisStyle", value.asInstanceOf[js.Any])
    
    inline def setTextEmphasisStyleUndefined: Self = StObject.set(x, "textEmphasisStyle", js.undefined)
    
    inline def setTextEmphasisStyleVarargs(value: TextEmphasisStyleProperty*): Self = StObject.set(x, "textEmphasisStyle", js.Array(value*))
    
    inline def setTextIndent(value: TextIndentProperty[TLength] | js.Array[TextIndentProperty[TLength]]): Self = StObject.set(x, "textIndent", value.asInstanceOf[js.Any])
    
    inline def setTextIndentUndefined: Self = StObject.set(x, "textIndent", js.undefined)
    
    inline def setTextIndentVarargs(value: TextIndentProperty[TLength]*): Self = StObject.set(x, "textIndent", js.Array(value*))
    
    inline def setTextJustify(value: TextJustifyProperty | js.Array[TextJustifyProperty]): Self = StObject.set(x, "textJustify", value.asInstanceOf[js.Any])
    
    inline def setTextJustifyUndefined: Self = StObject.set(x, "textJustify", js.undefined)
    
    inline def setTextJustifyVarargs(value: TextJustifyProperty*): Self = StObject.set(x, "textJustify", js.Array(value*))
    
    inline def setTextOrientation(value: TextOrientationProperty | js.Array[TextOrientationProperty]): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
    
    inline def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
    
    inline def setTextOrientationVarargs(value: TextOrientationProperty*): Self = StObject.set(x, "textOrientation", js.Array(value*))
    
    inline def setTextOverflow(value: TextOverflowProperty | js.Array[TextOverflowProperty]): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    inline def setTextOverflowVarargs(value: TextOverflowProperty*): Self = StObject.set(x, "textOverflow", js.Array(value*))
    
    inline def setTextRendering(value: TextRenderingProperty | js.Array[TextRenderingProperty]): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
    
    inline def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
    
    inline def setTextRenderingVarargs(value: TextRenderingProperty*): Self = StObject.set(x, "textRendering", js.Array(value*))
    
    inline def setTextShadow(value: TextShadowProperty | js.Array[TextShadowProperty]): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
    
    inline def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
    
    inline def setTextShadowVarargs(value: TextShadowProperty*): Self = StObject.set(x, "textShadow", js.Array(value*))
    
    inline def setTextSizeAdjust(value: TextSizeAdjustProperty | js.Array[TextSizeAdjustProperty]): Self = StObject.set(x, "textSizeAdjust", value.asInstanceOf[js.Any])
    
    inline def setTextSizeAdjustUndefined: Self = StObject.set(x, "textSizeAdjust", js.undefined)
    
    inline def setTextSizeAdjustVarargs(value: TextSizeAdjustProperty*): Self = StObject.set(x, "textSizeAdjust", js.Array(value*))
    
    inline def setTextTransform(value: TextTransformProperty | js.Array[TextTransformProperty]): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
    
    inline def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
    
    inline def setTextTransformVarargs(value: TextTransformProperty*): Self = StObject.set(x, "textTransform", js.Array(value*))
    
    inline def setTextUnderlinePosition(value: TextUnderlinePositionProperty | js.Array[TextUnderlinePositionProperty]): Self = StObject.set(x, "textUnderlinePosition", value.asInstanceOf[js.Any])
    
    inline def setTextUnderlinePositionUndefined: Self = StObject.set(x, "textUnderlinePosition", js.undefined)
    
    inline def setTextUnderlinePositionVarargs(value: TextUnderlinePositionProperty*): Self = StObject.set(x, "textUnderlinePosition", js.Array(value*))
    
    inline def setTop(value: TopProperty[TLength] | js.Array[TopProperty[TLength]]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setTopVarargs(value: TopProperty[TLength]*): Self = StObject.set(x, "top", js.Array(value*))
    
    inline def setTouchAction(value: TouchActionProperty | js.Array[TouchActionProperty]): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
    
    inline def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
    
    inline def setTouchActionVarargs(value: TouchActionProperty*): Self = StObject.set(x, "touchAction", js.Array(value*))
    
    inline def setTransform(value: TransformProperty | js.Array[TransformProperty]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformBox(value: TransformBoxProperty | js.Array[TransformBoxProperty]): Self = StObject.set(x, "transformBox", value.asInstanceOf[js.Any])
    
    inline def setTransformBoxUndefined: Self = StObject.set(x, "transformBox", js.undefined)
    
    inline def setTransformBoxVarargs(value: TransformBoxProperty*): Self = StObject.set(x, "transformBox", js.Array(value*))
    
    inline def setTransformOrigin(value: TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
    
    inline def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
    
    inline def setTransformOriginVarargs(value: TransformOriginProperty[TLength]*): Self = StObject.set(x, "transformOrigin", js.Array(value*))
    
    inline def setTransformStyle(value: TransformStyleProperty | js.Array[TransformStyleProperty]): Self = StObject.set(x, "transformStyle", value.asInstanceOf[js.Any])
    
    inline def setTransformStyleUndefined: Self = StObject.set(x, "transformStyle", js.undefined)
    
    inline def setTransformStyleVarargs(value: TransformStyleProperty*): Self = StObject.set(x, "transformStyle", js.Array(value*))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTransformVarargs(value: TransformProperty*): Self = StObject.set(x, "transform", js.Array(value*))
    
    inline def setTransitionDelay(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "transitionDelay", value.asInstanceOf[js.Any])
    
    inline def setTransitionDelayUndefined: Self = StObject.set(x, "transitionDelay", js.undefined)
    
    inline def setTransitionDelayVarargs(value: GlobalsString*): Self = StObject.set(x, "transitionDelay", js.Array(value*))
    
    inline def setTransitionDuration(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    inline def setTransitionDurationVarargs(value: GlobalsString*): Self = StObject.set(x, "transitionDuration", js.Array(value*))
    
    inline def setTransitionProperty(value: TransitionPropertyProperty | js.Array[TransitionPropertyProperty]): Self = StObject.set(x, "transitionProperty", value.asInstanceOf[js.Any])
    
    inline def setTransitionPropertyUndefined: Self = StObject.set(x, "transitionProperty", js.undefined)
    
    inline def setTransitionPropertyVarargs(value: TransitionPropertyProperty*): Self = StObject.set(x, "transitionProperty", js.Array(value*))
    
    inline def setTransitionTimingFunction(value: TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]): Self = StObject.set(x, "transitionTimingFunction", value.asInstanceOf[js.Any])
    
    inline def setTransitionTimingFunctionUndefined: Self = StObject.set(x, "transitionTimingFunction", js.undefined)
    
    inline def setTransitionTimingFunctionVarargs(value: TransitionTimingFunctionProperty*): Self = StObject.set(x, "transitionTimingFunction", js.Array(value*))
    
    inline def setTranslate(value: TranslateProperty[TLength] | js.Array[TranslateProperty[TLength]]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def setTranslateVarargs(value: TranslateProperty[TLength]*): Self = StObject.set(x, "translate", js.Array(value*))
    
    inline def setUnicodeBidi(value: UnicodeBidiProperty | js.Array[UnicodeBidiProperty]): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
    
    inline def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
    
    inline def setUnicodeBidiVarargs(value: UnicodeBidiProperty*): Self = StObject.set(x, "unicodeBidi", js.Array(value*))
    
    inline def setUserSelect(value: UserSelectProperty | js.Array[UserSelectProperty]): Self = StObject.set(x, "userSelect", value.asInstanceOf[js.Any])
    
    inline def setUserSelectUndefined: Self = StObject.set(x, "userSelect", js.undefined)
    
    inline def setUserSelectVarargs(value: UserSelectProperty*): Self = StObject.set(x, "userSelect", js.Array(value*))
    
    inline def setVerticalAlign(value: VerticalAlignProperty[TLength] | js.Array[VerticalAlignProperty[TLength]]): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setVerticalAlignVarargs(value: VerticalAlignProperty[TLength]*): Self = StObject.set(x, "verticalAlign", js.Array(value*))
    
    inline def setVisibility(value: VisibilityProperty | js.Array[VisibilityProperty]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    inline def setVisibilityVarargs(value: VisibilityProperty*): Self = StObject.set(x, "visibility", js.Array(value*))
    
    inline def setWhiteSpace(value: WhiteSpaceProperty | js.Array[WhiteSpaceProperty]): Self = StObject.set(x, "whiteSpace", value.asInstanceOf[js.Any])
    
    inline def setWhiteSpaceUndefined: Self = StObject.set(x, "whiteSpace", js.undefined)
    
    inline def setWhiteSpaceVarargs(value: WhiteSpaceProperty*): Self = StObject.set(x, "whiteSpace", js.Array(value*))
    
    inline def setWidows(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "widows", value.asInstanceOf[js.Any])
    
    inline def setWidowsUndefined: Self = StObject.set(x, "widows", js.undefined)
    
    inline def setWidowsVarargs(value: GlobalsNumber*): Self = StObject.set(x, "widows", js.Array(value*))
    
    inline def setWidth(value: WidthProperty[TLength] | js.Array[WidthProperty[TLength]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWidthVarargs(value: WidthProperty[TLength]*): Self = StObject.set(x, "width", js.Array(value*))
    
    inline def setWillChange(value: WillChangeProperty | js.Array[WillChangeProperty]): Self = StObject.set(x, "willChange", value.asInstanceOf[js.Any])
    
    inline def setWillChangeUndefined: Self = StObject.set(x, "willChange", js.undefined)
    
    inline def setWillChangeVarargs(value: WillChangeProperty*): Self = StObject.set(x, "willChange", js.Array(value*))
    
    inline def setWordBreak(value: WordBreakProperty | js.Array[WordBreakProperty]): Self = StObject.set(x, "wordBreak", value.asInstanceOf[js.Any])
    
    inline def setWordBreakUndefined: Self = StObject.set(x, "wordBreak", js.undefined)
    
    inline def setWordBreakVarargs(value: WordBreakProperty*): Self = StObject.set(x, "wordBreak", js.Array(value*))
    
    inline def setWordSpacing(value: WordSpacingProperty[TLength] | js.Array[WordSpacingProperty[TLength]]): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
    
    inline def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
    
    inline def setWordSpacingVarargs(value: WordSpacingProperty[TLength]*): Self = StObject.set(x, "wordSpacing", js.Array(value*))
    
    inline def setWordWrap(value: WordWrapProperty | js.Array[WordWrapProperty]): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
    
    inline def setWordWrapVarargs(value: WordWrapProperty*): Self = StObject.set(x, "wordWrap", js.Array(value*))
    
    inline def setWritingMode(value: WritingModeProperty | js.Array[WritingModeProperty]): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
    
    inline def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
    
    inline def setWritingModeVarargs(value: WritingModeProperty*): Self = StObject.set(x, "writingMode", js.Array(value*))
    
    inline def setZIndex(value: ZIndexProperty | js.Array[ZIndexProperty]): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    
    inline def setZIndexVarargs(value: ZIndexProperty*): Self = StObject.set(x, "zIndex", js.Array(value*))
    
    inline def setZoom(value: ZoomProperty | js.Array[ZoomProperty]): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    
    inline def setZoomVarargs(value: ZoomProperty*): Self = StObject.set(x, "zoom", js.Array(value*))
  }
}
