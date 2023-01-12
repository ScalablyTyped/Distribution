package typings.seleniumWebdriver

import typings.seleniumWebdriver.anon.Async
import typings.seleniumWebdriver.anon.AsyncBoolean
import typings.seleniumWebdriver.anon.Bridge
import typings.seleniumWebdriver.anon.X
import typings.seleniumWebdriver.libCommandMod.Executor
import typings.seleniumWebdriver.mod.WebElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputMod {
  
  @JSImport("selenium-webdriver/lib/input", "Actions")
  @js.native
  open class Actions protected () extends StObject {
    // region Constructors
    def this(executor: Executor) = this()
    def this(executor: Executor, options: Async) = this()
    def this(executor: Executor, options: AsyncBoolean) = this()
    def this(executor: Executor, options: Bridge) = this()
    
    /**
      * Executes this action sequence.
      * @return {!Promise} A promise that will be resolved once
      *     this sequence has completed.
      */
    def clear(): js.Promise[Unit] = js.native
    
    /**
      * Short-hand for performing a simple left-click (down/up) with the mouse.
      *
      * @param {./WebElement=} element If specified, the mouse will
      *     first be moved to the center of the element before performing the
      *     click.
      * @return {!Actions} a self reference.
      */
    def click(): Actions = js.native
    def click(element: WebElement): Actions = js.native
    
    /**
      * Short-hand for performing a simple right-click (down/up) with the mouse.
      *
      * @param {./WebElement=} element If specified, the mouse will
      *     first be moved to the center of the element before performing the
      *     click.
      * @return {!Actions} a self reference.
      */
    def contextClick(): Actions = js.native
    def contextClick(element: WebElement): Actions = js.native
    
    /**
      * Short-hand for performing a double left-click with the mouse.
      *
      * @param {./WebElement=} element If specified, the mouse will
      *     first be moved to the center of the element before performing the
      *     click.
      * @return {!Actions} a self reference.
      */
    def doubleClick(): Actions = js.native
    def doubleClick(element: WebElement): Actions = js.native
    
    /**
      * Convenience function for performing a 'drag and drop' manuever. The target
      * element may be moved to the location of another element, or by an offset (in
      * pixels).
      */
    def dragAndDrop(from: WebElement): Actions = js.native
    def dragAndDrop(from: WebElement, to: X): Actions = js.native
    def dragAndDrop(from: WebElement, to: WebElement): Actions = js.native
    
    /**
      * Performs a modifier key press. The modifier key is <em>not released</em>
      * until {@link #keyUp} or {@link #sendKeys} is called. The key press will be
      * targetted at the currently focused element.
      * @param {!Key} key The modifier key to push. Must be one of
      *     {ALT, CONTROL, SHIFT, COMMAND, META}.
      * @return {!Actions} A self reference.
      * @throws {Error} If the key is not a valid modifier key.
      */
    def keyDown(key: String): Actions = js.native
    
    /**
      * Performs a modifier key release. The release is targetted at the currently
      * focused element.
      * @param {!Key} key The modifier key to release. Must be one of
      *     {ALT, CONTROL, SHIFT, COMMAND, META}.
      * @return {!Actions} A self reference.
      * @throws {Error} If the key is not a valid modifier key.
      */
    def keyUp(key: String): Actions = js.native
    
    // endregion
    // region Methods
    def keyboard(): Keyboard = js.native
    
    def mouse(): Pointer = js.native
    
    /**
      * Inserts an action for moving the mouse `x` and `y` pixels relative to the
      * specified `origin`. The `origin` may be defined as the mouse's
      * {@linkplain ./input.Origin.POINTER current position}, the
      * {@linkplain ./input.Origin.VIEWPORT viewport}, or the center of a specific
      * {@linkplain ./webdriver.WebElement WebElement}.
      *
      * You may adjust how long the remote end should take, in milliseconds, to
      * perform the move using the `duration` parameter (defaults to 100 ms).
      * The number of incremental move events generated over this duration is an
      * implementation detail for the remote end.
      *
      * Defaults to moving the mouse to the top-left
      *     corner of the viewport over 100ms.
      */
    def move(direction: IDirection): Actions = js.native
    
    def pause(duration: Double, devices: Device*): Actions = js.native
    def pause(duration: Unit, devices: Device*): Actions = js.native
    def pause(duration: Device, devices: Device*): Actions = js.native
    
    /**
      * Executes this action sequence.
      * @return {!Promise} A promise that will be resolved once
      *     this sequence has completed.
      */
    def perform(): js.Promise[Unit] = js.native
    
    /**
      * Inserts an action to press a mouse button at the mouse's current location.
      * Defaults to `LEFT`.
      */
    def press(): Actions = js.native
    def press(button: Button): Actions = js.native
    
    /**
      * Inserts an action to release a mouse button at the mouse's current
      * location.  Defaults to `LEFT`.
      */
    def release(): Actions = js.native
    def release(button: Button): Actions = js.native
    
    /**
      * Simulates typing multiple keys. Each modifier key encountered in the
      * sequence will not be released until it is encountered again. All key events
      * will be targeted at the currently focused element.
      *
      * @param {...(string|!input.Key|!Array<(string|!input.Key)>)} var_args
      *     The keys to type.
      * @return {!Actions} A self reference.
      * @throws {Error} If the key is not a valid modifier key.
      */
    def sendKeys(var_args: (String | js.Promise[String])*): Actions = js.native
  }
  
  @js.native
  sealed trait Button extends StObject
  @JSImport("selenium-webdriver/lib/input", "Button")
  @js.native
  object Button extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Button & Double] = js.native
    
    @js.native
    sealed trait LEFT
      extends StObject
         with Button
    /* 0 */ val LEFT: typings.seleniumWebdriver.libInputMod.Button.LEFT & Double = js.native
    
    @js.native
    sealed trait MIDDLE
      extends StObject
         with Button
    /* 1 */ val MIDDLE: typings.seleniumWebdriver.libInputMod.Button.MIDDLE & Double = js.native
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with Button
    /* 2 */ val RIGHT: typings.seleniumWebdriver.libInputMod.Button.RIGHT & Double = js.native
  }
  
  @JSImport("selenium-webdriver/lib/input", "Device")
  @js.native
  open class Device protected () extends StObject {
    def this(`type`: String, id: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/input", "INTERNAL_COMPUTE_OFFSET_SCRIPT")
  @js.native
  val INTERNAL_COMPUTE_OFFSET_SCRIPT: String = js.native
  
  @JSImport("selenium-webdriver/lib/input", "Key")
  @js.native
  val Key: IKey = js.native
  
  @JSImport("selenium-webdriver/lib/input", "Keyboard")
  @js.native
  open class Keyboard protected () extends Device {
    def this(`type`: String, id: String) = this()
  }
  
  @js.native
  sealed trait Origin extends StObject
  @JSImport("selenium-webdriver/lib/input", "Origin")
  @js.native
  object Origin extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Origin & String] = js.native
    
    /** Compute offsets relative to the pointer's current position. */
    @js.native
    sealed trait POINTER
      extends StObject
         with Origin
    /* "pointer" */ val POINTER: typings.seleniumWebdriver.libInputMod.Origin.POINTER & String = js.native
    
    /** Compute offsets relative to the viewport. */
    @js.native
    sealed trait VIEWPORT
      extends StObject
         with Origin
    /* "viewport" */ val VIEWPORT: typings.seleniumWebdriver.libInputMod.Origin.VIEWPORT & String = js.native
  }
  
  @JSImport("selenium-webdriver/lib/input", "Pointer")
  @js.native
  open class Pointer protected () extends Device {
    def this(`type`: String, id: String) = this()
  }
  
  trait IDirection extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var origin: js.UndefOr[Origin | WebElement] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object IDirection {
    
    inline def apply(): IDirection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDirection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDirection] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setOrigin(value: Origin | WebElement): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait IKey extends StObject {
    
    var ADD: String
    
    var ALT: String
    
    var ARROW_DOWN: String
    
    var ARROW_LEFT: String
    
    var ARROW_RIGHT: String
    
    var ARROW_UP: String
    
    var BACK_SPACE: String
    
    var CANCEL: String
    
    var CLEAR: String
    
    var COMMAND: String
    
    var CONTROL: String
    
    var DECIMAL: String
    
    var DELETE: String
    
    var DIVIDE: String
    
    var DOWN: String
    
    var END: String
    
    var ENTER: String
    
    var EQUALS: String
    
    var ESCAPE: String
    
    var F1: String
    
    var F10: String
    
    var F11: String
    
    var F12: String
    
    // function keys
    var F2: String
    
    var F3: String
    
    var F4: String
    
    var F5: String
    
    var F6: String
    
    var F7: String
    
    var F8: String
    
    var F9: String
    
    // ^break
    var HELP: String
    
    var HOME: String
    
    var INSERT: String
    
    var LEFT: String
    
    // Apple command key
    var META: String
    
    var MULTIPLY: String
    
    var NULL: String
    
    var NUMPAD0: String
    
    // number pad keys
    var NUMPAD1: String
    
    var NUMPAD2: String
    
    var NUMPAD3: String
    
    var NUMPAD4: String
    
    var NUMPAD5: String
    
    var NUMPAD6: String
    
    var NUMPAD7: String
    
    var NUMPAD8: String
    
    var NUMPAD9: String
    
    var PAGE_DOWN: String
    
    var PAGE_UP: String
    
    var PAUSE: String
    
    var RETURN: String
    
    var RIGHT: String
    
    var SEMICOLON: String
    
    var SEPARATOR: String
    
    var SHIFT: String
    
    var SPACE: String
    
    var SUBTRACT: String
    
    var TAB: String
    
    var UP: String
    
    // alias for Windows key
    /**
      * Simulate pressing many keys at once in a 'chord'. Takes a sequence of
      * keys or strings, appends each of the values to a string,
      * and adds the chord termination key ({@link Key.NULL}) and returns
      * the resulting string.
      *
      * Note: when the low-level webdriver key handlers see Keys.NULL, active
      * modifier keys (CTRL/ALT/SHIFT/etc) release via a keyup event.
      *
      * @param {...string} var_args The key sequence to concatenate.
      * @return {string} The null-terminated key sequence.
      */
    def chord(var_args: (String | IKey)*): String
  }
  object IKey {
    
    inline def apply(
      ADD: String,
      ALT: String,
      ARROW_DOWN: String,
      ARROW_LEFT: String,
      ARROW_RIGHT: String,
      ARROW_UP: String,
      BACK_SPACE: String,
      CANCEL: String,
      CLEAR: String,
      COMMAND: String,
      CONTROL: String,
      DECIMAL: String,
      DELETE: String,
      DIVIDE: String,
      DOWN: String,
      END: String,
      ENTER: String,
      EQUALS: String,
      ESCAPE: String,
      F1: String,
      F10: String,
      F11: String,
      F12: String,
      F2: String,
      F3: String,
      F4: String,
      F5: String,
      F6: String,
      F7: String,
      F8: String,
      F9: String,
      HELP: String,
      HOME: String,
      INSERT: String,
      LEFT: String,
      META: String,
      MULTIPLY: String,
      NULL: String,
      NUMPAD0: String,
      NUMPAD1: String,
      NUMPAD2: String,
      NUMPAD3: String,
      NUMPAD4: String,
      NUMPAD5: String,
      NUMPAD6: String,
      NUMPAD7: String,
      NUMPAD8: String,
      NUMPAD9: String,
      PAGE_DOWN: String,
      PAGE_UP: String,
      PAUSE: String,
      RETURN: String,
      RIGHT: String,
      SEMICOLON: String,
      SEPARATOR: String,
      SHIFT: String,
      SPACE: String,
      SUBTRACT: String,
      TAB: String,
      UP: String,
      chord: /* repeated */ String | IKey => String
    ): IKey = {
      val __obj = js.Dynamic.literal(ADD = ADD.asInstanceOf[js.Any], ALT = ALT.asInstanceOf[js.Any], ARROW_DOWN = ARROW_DOWN.asInstanceOf[js.Any], ARROW_LEFT = ARROW_LEFT.asInstanceOf[js.Any], ARROW_RIGHT = ARROW_RIGHT.asInstanceOf[js.Any], ARROW_UP = ARROW_UP.asInstanceOf[js.Any], BACK_SPACE = BACK_SPACE.asInstanceOf[js.Any], CANCEL = CANCEL.asInstanceOf[js.Any], CLEAR = CLEAR.asInstanceOf[js.Any], COMMAND = COMMAND.asInstanceOf[js.Any], CONTROL = CONTROL.asInstanceOf[js.Any], DECIMAL = DECIMAL.asInstanceOf[js.Any], DELETE = DELETE.asInstanceOf[js.Any], DIVIDE = DIVIDE.asInstanceOf[js.Any], DOWN = DOWN.asInstanceOf[js.Any], END = END.asInstanceOf[js.Any], ENTER = ENTER.asInstanceOf[js.Any], EQUALS = EQUALS.asInstanceOf[js.Any], ESCAPE = ESCAPE.asInstanceOf[js.Any], F1 = F1.asInstanceOf[js.Any], F10 = F10.asInstanceOf[js.Any], F11 = F11.asInstanceOf[js.Any], F12 = F12.asInstanceOf[js.Any], F2 = F2.asInstanceOf[js.Any], F3 = F3.asInstanceOf[js.Any], F4 = F4.asInstanceOf[js.Any], F5 = F5.asInstanceOf[js.Any], F6 = F6.asInstanceOf[js.Any], F7 = F7.asInstanceOf[js.Any], F8 = F8.asInstanceOf[js.Any], F9 = F9.asInstanceOf[js.Any], HELP = HELP.asInstanceOf[js.Any], HOME = HOME.asInstanceOf[js.Any], INSERT = INSERT.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], META = META.asInstanceOf[js.Any], MULTIPLY = MULTIPLY.asInstanceOf[js.Any], NULL = NULL.asInstanceOf[js.Any], NUMPAD0 = NUMPAD0.asInstanceOf[js.Any], NUMPAD1 = NUMPAD1.asInstanceOf[js.Any], NUMPAD2 = NUMPAD2.asInstanceOf[js.Any], NUMPAD3 = NUMPAD3.asInstanceOf[js.Any], NUMPAD4 = NUMPAD4.asInstanceOf[js.Any], NUMPAD5 = NUMPAD5.asInstanceOf[js.Any], NUMPAD6 = NUMPAD6.asInstanceOf[js.Any], NUMPAD7 = NUMPAD7.asInstanceOf[js.Any], NUMPAD8 = NUMPAD8.asInstanceOf[js.Any], NUMPAD9 = NUMPAD9.asInstanceOf[js.Any], PAGE_DOWN = PAGE_DOWN.asInstanceOf[js.Any], PAGE_UP = PAGE_UP.asInstanceOf[js.Any], PAUSE = PAUSE.asInstanceOf[js.Any], RETURN = RETURN.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], SEMICOLON = SEMICOLON.asInstanceOf[js.Any], SEPARATOR = SEPARATOR.asInstanceOf[js.Any], SHIFT = SHIFT.asInstanceOf[js.Any], SPACE = SPACE.asInstanceOf[js.Any], SUBTRACT = SUBTRACT.asInstanceOf[js.Any], TAB = TAB.asInstanceOf[js.Any], UP = UP.asInstanceOf[js.Any], chord = js.Any.fromFunction1(chord))
      __obj.asInstanceOf[IKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IKey] (val x: Self) extends AnyVal {
      
      inline def setADD(value: String): Self = StObject.set(x, "ADD", value.asInstanceOf[js.Any])
      
      inline def setALT(value: String): Self = StObject.set(x, "ALT", value.asInstanceOf[js.Any])
      
      inline def setARROW_DOWN(value: String): Self = StObject.set(x, "ARROW_DOWN", value.asInstanceOf[js.Any])
      
      inline def setARROW_LEFT(value: String): Self = StObject.set(x, "ARROW_LEFT", value.asInstanceOf[js.Any])
      
      inline def setARROW_RIGHT(value: String): Self = StObject.set(x, "ARROW_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setARROW_UP(value: String): Self = StObject.set(x, "ARROW_UP", value.asInstanceOf[js.Any])
      
      inline def setBACK_SPACE(value: String): Self = StObject.set(x, "BACK_SPACE", value.asInstanceOf[js.Any])
      
      inline def setCANCEL(value: String): Self = StObject.set(x, "CANCEL", value.asInstanceOf[js.Any])
      
      inline def setCLEAR(value: String): Self = StObject.set(x, "CLEAR", value.asInstanceOf[js.Any])
      
      inline def setCOMMAND(value: String): Self = StObject.set(x, "COMMAND", value.asInstanceOf[js.Any])
      
      inline def setCONTROL(value: String): Self = StObject.set(x, "CONTROL", value.asInstanceOf[js.Any])
      
      inline def setChord(value: /* repeated */ String | IKey => String): Self = StObject.set(x, "chord", js.Any.fromFunction1(value))
      
      inline def setDECIMAL(value: String): Self = StObject.set(x, "DECIMAL", value.asInstanceOf[js.Any])
      
      inline def setDELETE(value: String): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
      
      inline def setDIVIDE(value: String): Self = StObject.set(x, "DIVIDE", value.asInstanceOf[js.Any])
      
      inline def setDOWN(value: String): Self = StObject.set(x, "DOWN", value.asInstanceOf[js.Any])
      
      inline def setEND(value: String): Self = StObject.set(x, "END", value.asInstanceOf[js.Any])
      
      inline def setENTER(value: String): Self = StObject.set(x, "ENTER", value.asInstanceOf[js.Any])
      
      inline def setEQUALS(value: String): Self = StObject.set(x, "EQUALS", value.asInstanceOf[js.Any])
      
      inline def setESCAPE(value: String): Self = StObject.set(x, "ESCAPE", value.asInstanceOf[js.Any])
      
      inline def setF1(value: String): Self = StObject.set(x, "F1", value.asInstanceOf[js.Any])
      
      inline def setF10(value: String): Self = StObject.set(x, "F10", value.asInstanceOf[js.Any])
      
      inline def setF11(value: String): Self = StObject.set(x, "F11", value.asInstanceOf[js.Any])
      
      inline def setF12(value: String): Self = StObject.set(x, "F12", value.asInstanceOf[js.Any])
      
      inline def setF2(value: String): Self = StObject.set(x, "F2", value.asInstanceOf[js.Any])
      
      inline def setF3(value: String): Self = StObject.set(x, "F3", value.asInstanceOf[js.Any])
      
      inline def setF4(value: String): Self = StObject.set(x, "F4", value.asInstanceOf[js.Any])
      
      inline def setF5(value: String): Self = StObject.set(x, "F5", value.asInstanceOf[js.Any])
      
      inline def setF6(value: String): Self = StObject.set(x, "F6", value.asInstanceOf[js.Any])
      
      inline def setF7(value: String): Self = StObject.set(x, "F7", value.asInstanceOf[js.Any])
      
      inline def setF8(value: String): Self = StObject.set(x, "F8", value.asInstanceOf[js.Any])
      
      inline def setF9(value: String): Self = StObject.set(x, "F9", value.asInstanceOf[js.Any])
      
      inline def setHELP(value: String): Self = StObject.set(x, "HELP", value.asInstanceOf[js.Any])
      
      inline def setHOME(value: String): Self = StObject.set(x, "HOME", value.asInstanceOf[js.Any])
      
      inline def setINSERT(value: String): Self = StObject.set(x, "INSERT", value.asInstanceOf[js.Any])
      
      inline def setLEFT(value: String): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
      
      inline def setMETA(value: String): Self = StObject.set(x, "META", value.asInstanceOf[js.Any])
      
      inline def setMULTIPLY(value: String): Self = StObject.set(x, "MULTIPLY", value.asInstanceOf[js.Any])
      
      inline def setNULL(value: String): Self = StObject.set(x, "NULL", value.asInstanceOf[js.Any])
      
      inline def setNUMPAD0(value: String): Self = StObject.set(x, "NUMPAD0", value.asInstanceOf[js.Any])
      
      inline def setNUMPAD1(value: String): Self = StObject.set(x, "NUMPAD1", value.asInstanceOf[js.Any])
      
      inline def setNUMPAD2(value: String): Self = StObject.set(x, "NUMPAD2", value.asInstanceOf[js.Any])
      
      inline def setNUMPAD3(value: String): Self = StObject.set(x, "NUMPAD3", value.asInstanceOf[js.Any])
      
      inline def setNUMPAD4(value: String): Self = StObject.set(x, "NUMPAD4", value.asInstanceOf[js.Any])
      
      inline def setNUMPAD5(value: String): Self = StObject.set(x, "NUMPAD5", value.asInstanceOf[js.Any])
      
      inline def setNUMPAD6(value: String): Self = StObject.set(x, "NUMPAD6", value.asInstanceOf[js.Any])
      
      inline def setNUMPAD7(value: String): Self = StObject.set(x, "NUMPAD7", value.asInstanceOf[js.Any])
      
      inline def setNUMPAD8(value: String): Self = StObject.set(x, "NUMPAD8", value.asInstanceOf[js.Any])
      
      inline def setNUMPAD9(value: String): Self = StObject.set(x, "NUMPAD9", value.asInstanceOf[js.Any])
      
      inline def setPAGE_DOWN(value: String): Self = StObject.set(x, "PAGE_DOWN", value.asInstanceOf[js.Any])
      
      inline def setPAGE_UP(value: String): Self = StObject.set(x, "PAGE_UP", value.asInstanceOf[js.Any])
      
      inline def setPAUSE(value: String): Self = StObject.set(x, "PAUSE", value.asInstanceOf[js.Any])
      
      inline def setRETURN(value: String): Self = StObject.set(x, "RETURN", value.asInstanceOf[js.Any])
      
      inline def setRIGHT(value: String): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
      
      inline def setSEMICOLON(value: String): Self = StObject.set(x, "SEMICOLON", value.asInstanceOf[js.Any])
      
      inline def setSEPARATOR(value: String): Self = StObject.set(x, "SEPARATOR", value.asInstanceOf[js.Any])
      
      inline def setSHIFT(value: String): Self = StObject.set(x, "SHIFT", value.asInstanceOf[js.Any])
      
      inline def setSPACE(value: String): Self = StObject.set(x, "SPACE", value.asInstanceOf[js.Any])
      
      inline def setSUBTRACT(value: String): Self = StObject.set(x, "SUBTRACT", value.asInstanceOf[js.Any])
      
      inline def setTAB(value: String): Self = StObject.set(x, "TAB", value.asInstanceOf[js.Any])
      
      inline def setUP(value: String): Self = StObject.set(x, "UP", value.asInstanceOf[js.Any])
    }
  }
}
