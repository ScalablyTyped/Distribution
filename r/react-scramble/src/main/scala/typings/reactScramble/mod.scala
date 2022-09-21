package typings.reactScramble

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.reactScramble.reactScrambleStrings.Plussign
import typings.reactScramble.reactScrambleStrings.`-_`
import typings.reactScramble.reactScrambleStrings.all
import typings.reactScramble.reactScrambleStrings.fast
import typings.reactScramble.reactScrambleStrings.forward
import typings.reactScramble.reactScrambleStrings.medium
import typings.reactScramble.reactScrambleStrings.pause
import typings.reactScramble.reactScrambleStrings.random
import typings.reactScramble.reactScrambleStrings.reset
import typings.reactScramble.reactScrambleStrings.restart
import typings.reactScramble.reactScrambleStrings.slow
import typings.reactScramble.reactScrambleStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * @example
    * ```
    * import React from 'react'
    * import Scramble from 'react-scramble'
    *
    * class App extends React.Component {
    *   render() {
    *    return (
    *      <Scramble
    *        autoStart
    *        text="Scramble me!"
    *        steps={[
    *          {
    *            roll: 10,
    *            action: '+',
    *            type: 'all',
    *          },
    *          {
    *            action: '-',
    *            type: 'forward',
    *          },
    *        ]}
    *      />
    *    )
    *  }
    * }
    * ```
    */
  @JSImport("react-scramble", JSImport.Default)
  @js.native
  val default: FC[Props] = js.native
  
  trait AnimationControls extends StObject {
    
    def pause(): Unit
    
    def start(): Unit
  }
  object AnimationControls {
    
    inline def apply(pause: () => Unit, start: () => Unit): AnimationControls = {
      val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), start = js.Any.fromFunction0(start))
      __obj.asInstanceOf[AnimationControls]
    }
    
    extension [Self <: AnimationControls](x: Self) {
      
      inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    }
  }
  
  trait Props extends StObject {
    
    /**
      * Set true to auto start animation after render.
      */
    var autoStart: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Method binding callback function.
      */
    var bindMethod: js.UndefOr[js.Function1[/* c */ AnimationControls, Unit]] = js.undefined
    
    /**
      * Event trigger type when mouse enter.
      */
    var mouseEnterTrigger: js.UndefOr[start | pause | reset | restart] = js.undefined
    
    /**
      * Event trigger type when mouse leave.
      */
    var mouseLeaveTrigger: js.UndefOr[start | pause | reset | restart] = js.undefined
    
    /**
      * Using no-break space or not.
      */
    var noBreakSpace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Scramble the text after render.
      */
    var preScramble: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Speed of scramble per second.
      */
    var speed: js.UndefOr[slow | medium | fast] = js.undefined
    
    /**
      * Scramble steps, a list of Object in Step format.
      */
    var steps: js.Array[Step]
    
    /**
      * Original text.
      */
    var text: String
  }
  object Props {
    
    inline def apply(steps: js.Array[Step], text: String): Props = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      inline def setBindMethod(value: /* c */ AnimationControls => Unit): Self = StObject.set(x, "bindMethod", js.Any.fromFunction1(value))
      
      inline def setBindMethodUndefined: Self = StObject.set(x, "bindMethod", js.undefined)
      
      inline def setMouseEnterTrigger(value: start | pause | reset | restart): Self = StObject.set(x, "mouseEnterTrigger", value.asInstanceOf[js.Any])
      
      inline def setMouseEnterTriggerUndefined: Self = StObject.set(x, "mouseEnterTrigger", js.undefined)
      
      inline def setMouseLeaveTrigger(value: start | pause | reset | restart): Self = StObject.set(x, "mouseLeaveTrigger", value.asInstanceOf[js.Any])
      
      inline def setMouseLeaveTriggerUndefined: Self = StObject.set(x, "mouseLeaveTrigger", js.undefined)
      
      inline def setNoBreakSpace(value: Boolean): Self = StObject.set(x, "noBreakSpace", value.asInstanceOf[js.Any])
      
      inline def setNoBreakSpaceUndefined: Self = StObject.set(x, "noBreakSpace", js.undefined)
      
      inline def setPreScramble(value: Boolean): Self = StObject.set(x, "preScramble", value.asInstanceOf[js.Any])
      
      inline def setPreScrambleUndefined: Self = StObject.set(x, "preScramble", js.undefined)
      
      inline def setSpeed(value: slow | medium | fast): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setSteps(value: js.Array[Step]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Step extends StObject {
    
    /**
      * Action of the step, + as scramble, - as descramble and leave blank to do nothing.
      */
    var action: Plussign | `-_`
    
    /**
      * Times of action in the step.
      */
    var roll: js.UndefOr[Double] = js.undefined
    
    /**
      * Change the original text.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /**
      * Scramble/descrmble type of the step.
      */
    var `type`: js.UndefOr[all | random | forward] = js.undefined
  }
  object Step {
    
    inline def apply(action: Plussign | `-_`): Step = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[Step]
    }
    
    extension [Self <: Step](x: Self) {
      
      inline def setAction(value: Plussign | `-_`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
      
      inline def setRollUndefined: Self = StObject.set(x, "roll", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: all | random | forward): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type _To = FC[Props]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[Props] = default
}
