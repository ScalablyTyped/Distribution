package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.semanticUiReact.semanticUiReactStrings.down
import typings.semanticUiReact.semanticUiReactStrings.events
import typings.semanticUiReact.semanticUiReactStrings.repaint
import typings.semanticUiReact.semanticUiReactStrings.up
import typings.std.Document
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsBehaviorsVisibilityVisibilityMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/behaviors/Visibility/Visibility", JSImport.Default)
  @js.native
  open class default protected () extends Component[VisibilityProps, ComponentState, Any] {
    def this(props: VisibilityProps) = this()
    def this(props: VisibilityProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/behaviors/Visibility/Visibility", JSImport.Default)
  @js.native
  val default: ComponentClass[VisibilityProps, ComponentState] = js.native
  
  trait StrictVisibilityProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Context which sticky element should stick to. */
    var context: js.UndefOr[Document | Window | HTMLElement] = js.undefined
    
    /**
      * When set to true a callback will occur anytime an element passes a condition not just immediately after the
      * threshold is met.
      */
    var continuous: js.UndefOr[Boolean] = js.undefined
    
    /** Fires callbacks immediately after mount. */
    var fireOnMount: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Value that context should be adjusted in pixels. Useful for making content appear below content fixed to the
      * page.
      */
    var offset: js.UndefOr[Double | String | (js.Array[Double | String])] = js.undefined
    
    /**
      * Element's bottom edge has passed top of screen.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onBottomPassed: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
    
    /**
      * Element's bottom edge has not passed top of screen.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onBottomPassedReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
    
    /**
      * Element's bottom edge has passed bottom of screen
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onBottomVisible: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
    
    /**
      * Element's bottom edge has not passed bottom of screen.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onBottomVisibleReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
    
    /**
      * Element is not visible on the screen.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onOffScreen: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
    
    /**
      * Element is visible on the screen.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onOnScreen: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
    
    /** Element is not visible on the screen. */
    var onPassed: js.UndefOr[VisibilityOnPassed] = js.undefined
    
    /**
      * Any part of an element is visible on screen.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onPassing: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
    
    /**
      * Element's top has not passed top of screen but bottom has.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onPassingReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
    
    /**
      * Element's top edge has passed top of the screen.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onTopPassed: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
    
    /**
      * Element's top edge has not passed top of the screen.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onTopPassedReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
    
    /**
      * Element's top edge has passed bottom of screen.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onTopVisible: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
    
    /**
      * Element's top edge has not passed bottom of screen.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onTopVisibleReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
    
    /**
      * Element's top edge has passed bottom of screen.
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onUpdate: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
    
    /** When set to false a callback will occur each time an element passes the threshold for a condition. */
    var once: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows to choose the mode of the position calculations:
      * - `events` - (default) update and fire callbacks only on scroll/resize events
      * - `repaint` - update and fire callbacks on browser repaint (animation frames)
      */
    var updateOn: js.UndefOr[events | repaint] = js.undefined
  }
  object StrictVisibilityProps {
    
    inline def apply(): StrictVisibilityProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictVisibilityProps]
    }
    
    extension [Self <: StrictVisibilityProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContext(value: Document | Window | HTMLElement): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
      
      inline def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
      
      inline def setFireOnMount(value: Boolean): Self = StObject.set(x, "fireOnMount", value.asInstanceOf[js.Any])
      
      inline def setFireOnMountUndefined: Self = StObject.set(x, "fireOnMount", js.undefined)
      
      inline def setOffset(value: Double | String | (js.Array[Double | String])): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOffsetVarargs(value: (Double | String)*): Self = StObject.set(x, "offset", js.Array(value*))
      
      inline def setOnBottomPassed(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = StObject.set(x, "onBottomPassed", js.Any.fromFunction2(value))
      
      inline def setOnBottomPassedReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = StObject.set(x, "onBottomPassedReverse", js.Any.fromFunction2(value))
      
      inline def setOnBottomPassedReverseUndefined: Self = StObject.set(x, "onBottomPassedReverse", js.undefined)
      
      inline def setOnBottomPassedUndefined: Self = StObject.set(x, "onBottomPassed", js.undefined)
      
      inline def setOnBottomVisible(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = StObject.set(x, "onBottomVisible", js.Any.fromFunction2(value))
      
      inline def setOnBottomVisibleReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = StObject.set(x, "onBottomVisibleReverse", js.Any.fromFunction2(value))
      
      inline def setOnBottomVisibleReverseUndefined: Self = StObject.set(x, "onBottomVisibleReverse", js.undefined)
      
      inline def setOnBottomVisibleUndefined: Self = StObject.set(x, "onBottomVisible", js.undefined)
      
      inline def setOnOffScreen(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = StObject.set(x, "onOffScreen", js.Any.fromFunction2(value))
      
      inline def setOnOffScreenUndefined: Self = StObject.set(x, "onOffScreen", js.undefined)
      
      inline def setOnOnScreen(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = StObject.set(x, "onOnScreen", js.Any.fromFunction2(value))
      
      inline def setOnOnScreenUndefined: Self = StObject.set(x, "onOnScreen", js.undefined)
      
      inline def setOnPassed(value: VisibilityOnPassed): Self = StObject.set(x, "onPassed", value.asInstanceOf[js.Any])
      
      inline def setOnPassedUndefined: Self = StObject.set(x, "onPassed", js.undefined)
      
      inline def setOnPassing(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = StObject.set(x, "onPassing", js.Any.fromFunction2(value))
      
      inline def setOnPassingReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = StObject.set(x, "onPassingReverse", js.Any.fromFunction2(value))
      
      inline def setOnPassingReverseUndefined: Self = StObject.set(x, "onPassingReverse", js.undefined)
      
      inline def setOnPassingUndefined: Self = StObject.set(x, "onPassing", js.undefined)
      
      inline def setOnTopPassed(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = StObject.set(x, "onTopPassed", js.Any.fromFunction2(value))
      
      inline def setOnTopPassedReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = StObject.set(x, "onTopPassedReverse", js.Any.fromFunction2(value))
      
      inline def setOnTopPassedReverseUndefined: Self = StObject.set(x, "onTopPassedReverse", js.undefined)
      
      inline def setOnTopPassedUndefined: Self = StObject.set(x, "onTopPassed", js.undefined)
      
      inline def setOnTopVisible(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = StObject.set(x, "onTopVisible", js.Any.fromFunction2(value))
      
      inline def setOnTopVisibleReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = StObject.set(x, "onTopVisibleReverse", js.Any.fromFunction2(value))
      
      inline def setOnTopVisibleReverseUndefined: Self = StObject.set(x, "onTopVisibleReverse", js.undefined)
      
      inline def setOnTopVisibleUndefined: Self = StObject.set(x, "onTopVisible", js.undefined)
      
      inline def setOnUpdate(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction2(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setUpdateOn(value: events | repaint): Self = StObject.set(x, "updateOn", value.asInstanceOf[js.Any])
      
      inline def setUpdateOnUndefined: Self = StObject.set(x, "updateOn", js.undefined)
    }
  }
  
  trait VisibilityCalculations extends StObject {
    
    var bottomPassed: Boolean
    
    var bottomVisible: Boolean
    
    var direction: down | up
    
    var fits: Boolean
    
    var height: Double
    
    var offScreen: Boolean
    
    var onScreen: Boolean
    
    var passing: Boolean
    
    var percentagePassed: Double
    
    var pixelsPassed: Double
    
    var topPassed: Boolean
    
    var topVisible: Boolean
    
    var width: Double
  }
  object VisibilityCalculations {
    
    inline def apply(
      bottomPassed: Boolean,
      bottomVisible: Boolean,
      direction: down | up,
      fits: Boolean,
      height: Double,
      offScreen: Boolean,
      onScreen: Boolean,
      passing: Boolean,
      percentagePassed: Double,
      pixelsPassed: Double,
      topPassed: Boolean,
      topVisible: Boolean,
      width: Double
    ): VisibilityCalculations = {
      val __obj = js.Dynamic.literal(bottomPassed = bottomPassed.asInstanceOf[js.Any], bottomVisible = bottomVisible.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], fits = fits.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offScreen = offScreen.asInstanceOf[js.Any], onScreen = onScreen.asInstanceOf[js.Any], passing = passing.asInstanceOf[js.Any], percentagePassed = percentagePassed.asInstanceOf[js.Any], pixelsPassed = pixelsPassed.asInstanceOf[js.Any], topPassed = topPassed.asInstanceOf[js.Any], topVisible = topVisible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisibilityCalculations]
    }
    
    extension [Self <: VisibilityCalculations](x: Self) {
      
      inline def setBottomPassed(value: Boolean): Self = StObject.set(x, "bottomPassed", value.asInstanceOf[js.Any])
      
      inline def setBottomVisible(value: Boolean): Self = StObject.set(x, "bottomVisible", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: down | up): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setFits(value: Boolean): Self = StObject.set(x, "fits", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOffScreen(value: Boolean): Self = StObject.set(x, "offScreen", value.asInstanceOf[js.Any])
      
      inline def setOnScreen(value: Boolean): Self = StObject.set(x, "onScreen", value.asInstanceOf[js.Any])
      
      inline def setPassing(value: Boolean): Self = StObject.set(x, "passing", value.asInstanceOf[js.Any])
      
      inline def setPercentagePassed(value: Double): Self = StObject.set(x, "percentagePassed", value.asInstanceOf[js.Any])
      
      inline def setPixelsPassed(value: Double): Self = StObject.set(x, "pixelsPassed", value.asInstanceOf[js.Any])
      
      inline def setTopPassed(value: Boolean): Self = StObject.set(x, "topPassed", value.asInstanceOf[js.Any])
      
      inline def setTopVisible(value: Boolean): Self = StObject.set(x, "topVisible", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait VisibilityEventData
    extends StObject
       with VisibilityProps {
    
    var calculations: VisibilityCalculations
  }
  object VisibilityEventData {
    
    inline def apply(calculations: VisibilityCalculations): VisibilityEventData = {
      val __obj = js.Dynamic.literal(calculations = calculations.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisibilityEventData]
    }
    
    extension [Self <: VisibilityEventData](x: Self) {
      
      inline def setCalculations(value: VisibilityCalculations): Self = StObject.set(x, "calculations", value.asInstanceOf[js.Any])
    }
  }
  
  type VisibilityOnPassed = StringDictionary[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]]
  
  trait VisibilityProps
    extends StObject
       with StrictVisibilityProps
       with /* key */ StringDictionary[Any]
  object VisibilityProps {
    
    inline def apply(): VisibilityProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisibilityProps]
    }
  }
  
  type _To = ComponentClass[VisibilityProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsBehaviorsVisibilityVisibilityMod.foo` */
  override def _to: ComponentClass[VisibilityProps, ComponentState] = default
}
