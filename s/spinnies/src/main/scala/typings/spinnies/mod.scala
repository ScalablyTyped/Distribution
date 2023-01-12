package typings.spinnies

import org.scalablytyped.runtime.StringDictionary
import typings.spinnies.anon.PartialOptions
import typings.spinnies.anon.PartialSpinnerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A class that manages multiple CLI spinners.
    */
  @JSImport("spinnies", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Spinnies {
    def this(options: PartialOptions) = this()
  }
  
  @JSImport("spinnies", "dashes")
  @js.native
  val dashes: Spinner = js.native
  
  @JSImport("spinnies", "dots")
  @js.native
  val dots: Spinner = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.spinnies.spinniesStrings.black
    - typings.spinnies.spinniesStrings.red
    - typings.spinnies.spinniesStrings.green
    - typings.spinnies.spinniesStrings.yellow
    - typings.spinnies.spinniesStrings.blue
    - typings.spinnies.spinniesStrings.magenta
    - typings.spinnies.spinniesStrings.cyan
    - typings.spinnies.spinniesStrings.white
    - typings.spinnies.spinniesStrings.gray
    - typings.spinnies.spinniesStrings.redBright
    - typings.spinnies.spinniesStrings.greenBright
    - typings.spinnies.spinniesStrings.yellowBright
    - typings.spinnies.spinniesStrings.blueBright
    - typings.spinnies.spinniesStrings.magentaBright
    - typings.spinnies.spinniesStrings.cyanBright
    - typings.spinnies.spinniesStrings.whiteBright
  */
  trait Color extends StObject
  object Color {
    
    inline def black: typings.spinnies.spinniesStrings.black = "black".asInstanceOf[typings.spinnies.spinniesStrings.black]
    
    inline def blue: typings.spinnies.spinniesStrings.blue = "blue".asInstanceOf[typings.spinnies.spinniesStrings.blue]
    
    inline def blueBright: typings.spinnies.spinniesStrings.blueBright = "blueBright".asInstanceOf[typings.spinnies.spinniesStrings.blueBright]
    
    inline def cyan: typings.spinnies.spinniesStrings.cyan = "cyan".asInstanceOf[typings.spinnies.spinniesStrings.cyan]
    
    inline def cyanBright: typings.spinnies.spinniesStrings.cyanBright = "cyanBright".asInstanceOf[typings.spinnies.spinniesStrings.cyanBright]
    
    inline def gray: typings.spinnies.spinniesStrings.gray = "gray".asInstanceOf[typings.spinnies.spinniesStrings.gray]
    
    inline def green: typings.spinnies.spinniesStrings.green = "green".asInstanceOf[typings.spinnies.spinniesStrings.green]
    
    inline def greenBright: typings.spinnies.spinniesStrings.greenBright = "greenBright".asInstanceOf[typings.spinnies.spinniesStrings.greenBright]
    
    inline def magenta: typings.spinnies.spinniesStrings.magenta = "magenta".asInstanceOf[typings.spinnies.spinniesStrings.magenta]
    
    inline def magentaBright: typings.spinnies.spinniesStrings.magentaBright = "magentaBright".asInstanceOf[typings.spinnies.spinniesStrings.magentaBright]
    
    inline def red: typings.spinnies.spinniesStrings.red = "red".asInstanceOf[typings.spinnies.spinniesStrings.red]
    
    inline def redBright: typings.spinnies.spinniesStrings.redBright = "redBright".asInstanceOf[typings.spinnies.spinniesStrings.redBright]
    
    inline def white: typings.spinnies.spinniesStrings.white = "white".asInstanceOf[typings.spinnies.spinniesStrings.white]
    
    inline def whiteBright: typings.spinnies.spinniesStrings.whiteBright = "whiteBright".asInstanceOf[typings.spinnies.spinniesStrings.whiteBright]
    
    inline def yellow: typings.spinnies.spinniesStrings.yellow = "yellow".asInstanceOf[typings.spinnies.spinniesStrings.yellow]
    
    inline def yellowBright: typings.spinnies.spinniesStrings.yellowBright = "yellowBright".asInstanceOf[typings.spinnies.spinniesStrings.yellowBright]
  }
  
  /**
    * Contains top-level configuration for the Spinnies class. Also allows the
    * caller to override default values used in `SpinnerOptions`.
    */
  trait Options extends StObject {
    
    /**
      * The color of the text that accompanies the spinner. If not specified, the console's default foreground color is used.
      */
    var color: js.UndefOr[Color] = js.undefined
    
    /**
      * Disable spinner animations (will still print raw messages if `true`). The default value is `false`.
      */
    var disableSpins: Boolean
    
    /**
      * The color for the text on failure. Default value is `"red"`.
      */
    var failColor: Color
    
    /**
      * The symbol to be used in place of the spinner on failure. The default value is ✖.
      */
    var failPrefix: String
    
    /**
      * Defines the animated spinner to be used while each spinner is active/spinning.
      */
    var spinner: Spinner
    
    /**
      * The color of the spinner, when active. The default value is `"greenBright"`
      */
    var spinnerColor: Color
    
    /**
      * The color for the text on success. Default value is `"green"`
      */
    var succeedColor: Color
    
    /**
      * The symbol to be used in place of the spinner on success. The default value is ✓.
      */
    var succeedPrefix: String
  }
  object Options {
    
    inline def apply(
      disableSpins: Boolean,
      failColor: Color,
      failPrefix: String,
      spinner: Spinner,
      spinnerColor: Color,
      succeedColor: Color,
      succeedPrefix: String
    ): Options = {
      val __obj = js.Dynamic.literal(disableSpins = disableSpins.asInstanceOf[js.Any], failColor = failColor.asInstanceOf[js.Any], failPrefix = failPrefix.asInstanceOf[js.Any], spinner = spinner.asInstanceOf[js.Any], spinnerColor = spinnerColor.asInstanceOf[js.Any], succeedColor = succeedColor.asInstanceOf[js.Any], succeedPrefix = succeedPrefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisableSpins(value: Boolean): Self = StObject.set(x, "disableSpins", value.asInstanceOf[js.Any])
      
      inline def setFailColor(value: Color): Self = StObject.set(x, "failColor", value.asInstanceOf[js.Any])
      
      inline def setFailPrefix(value: String): Self = StObject.set(x, "failPrefix", value.asInstanceOf[js.Any])
      
      inline def setSpinner(value: Spinner): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      inline def setSpinnerColor(value: Color): Self = StObject.set(x, "spinnerColor", value.asInstanceOf[js.Any])
      
      inline def setSucceedColor(value: Color): Self = StObject.set(x, "succeedColor", value.asInstanceOf[js.Any])
      
      inline def setSucceedPrefix(value: String): Self = StObject.set(x, "succeedPrefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait Spinner extends StObject {
    
    var frames: js.Array[String]
    
    var interval: Double
  }
  object Spinner {
    
    inline def apply(frames: js.Array[String], interval: Double): Spinner = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
      __obj.asInstanceOf[Spinner]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Spinner] (val x: Self) extends AnyVal {
      
      inline def setFrames(value: js.Array[String]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesVarargs(value: String*): Self = StObject.set(x, "frames", js.Array(value*))
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The configuration for a given spinner
    */
  trait SpinnerOptions extends StObject {
    
    /**
      * The color of the text that accompanies the spinner. If not specified, the console's default foreground color is used.
      */
    var color: js.UndefOr[Color] = js.undefined
    
    /**
      * The color for the text on failure. Default value is `"red"`.
      */
    var failColor: Color
    
    /**
      * Indent the spinner with the given number of spaces.
      */
    var indent: Double
    
    /**
      * The color of the spinner, when active. The default value is `"greenBright"`
      */
    var spinnerColor: Color
    
    /**
      * Initial status of the spinner.
      */
    var status: SpinnerStatus
    
    /**
      * The color for the text on success. Default value is `"green"`
      */
    var succeedColor: Color
    
    /**
      * Text to show in the spinner. If none is provided, the name field will be shown.
      */
    var text: String
  }
  object SpinnerOptions {
    
    inline def apply(
      failColor: Color,
      indent: Double,
      spinnerColor: Color,
      status: SpinnerStatus,
      succeedColor: Color,
      text: String
    ): SpinnerOptions = {
      val __obj = js.Dynamic.literal(failColor = failColor.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], spinnerColor = spinnerColor.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], succeedColor = succeedColor.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpinnerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpinnerOptions] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFailColor(value: Color): Self = StObject.set(x, "failColor", value.asInstanceOf[js.Any])
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setSpinnerColor(value: Color): Self = StObject.set(x, "spinnerColor", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: SpinnerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSucceedColor(value: Color): Self = StObject.set(x, "succeedColor", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.spinnies.spinniesStrings.spinning
    - typings.spinnies.spinniesStrings.`non-spinnable`
    - typings.spinnies.spinniesStrings.succeed
    - typings.spinnies.spinniesStrings.fail
    - typings.spinnies.spinniesStrings.stopped
  */
  trait SpinnerStatus extends StObject
  object SpinnerStatus {
    
    inline def fail: typings.spinnies.spinniesStrings.fail = "fail".asInstanceOf[typings.spinnies.spinniesStrings.fail]
    
    inline def `non-spinnable`: typings.spinnies.spinniesStrings.`non-spinnable` = "non-spinnable".asInstanceOf[typings.spinnies.spinniesStrings.`non-spinnable`]
    
    inline def spinning: typings.spinnies.spinniesStrings.spinning = "spinning".asInstanceOf[typings.spinnies.spinniesStrings.spinning]
    
    inline def stopped: typings.spinnies.spinniesStrings.stopped = "stopped".asInstanceOf[typings.spinnies.spinniesStrings.stopped]
    
    inline def succeed: typings.spinnies.spinniesStrings.succeed = "succeed".asInstanceOf[typings.spinnies.spinniesStrings.succeed]
  }
  
  /**
    * A class that manages multiple CLI spinners.
    */
  @js.native
  trait Spinnies extends StObject {
    
    /**
      * Add a new spinner with the given name.
      *
      * @returns full `SpinnerOptions` object for the given spinner, with
      * defaults applied
      */
    def add(name: String): SpinnerOptions = js.native
    def add(name: String, options: PartialSpinnerOptions): SpinnerOptions = js.native
    
    /**
      * Disables the spinner loop after all spinners have deactivated. Must be
      * called after calling `remove` on the final spinner, otherwise the
      * spinner loop will prevent the process from exiting.
      */
    def checkIfActiveSpinners(): Unit = js.native
    
    /**
      * Sets the specified spinner status as fail.
      *
      * @returns full `SpinnerOptions` object for the given spinner, with
      * defaults applied
      */
    def fail(name: String): SpinnerOptions = js.native
    def fail(name: String, options: PartialSpinnerOptions): SpinnerOptions = js.native
    
    /**
      * @returns false if all spinners have succeeded, failed or have been stopped
      */
    def hasActiveSpinners(): Boolean = js.native
    
    /**
      * The current configuration of this Spinnies object.
      */
    var options: Options = js.native
    
    /**
      * Get spinner by name.
      *
      * @returns full `SpinnerOptions` object for the given spinner, with
      * defaults applied
      */
    def pick(name: String): SpinnerOptions = js.native
    
    /**
      * Remove spinner with name.
      *
      * @returns full `SpinnerOptions` object for the given spinner, with
      * defaults applied
      */
    def remove(name: String): SpinnerOptions = js.native
    
    /**
      * Stops the spinners and sets the non-succeeded and non-failed ones to the provided status.
      *
      * @returns an object that maps spinner names to final `SpinnerOptions` objects for each spinner, with
      * defaults applied
      */
    def stopAll(): StringDictionary[SpinnerOptions] = js.native
    def stopAll(status: StopAllStatus): StringDictionary[SpinnerOptions] = js.native
    
    /**
      * Sets the specified spinner status as succeed.
      *
      * @returns full `SpinnerOptions` object for the given spinner, with
      * defaults applied
      */
    def succeed(name: String): SpinnerOptions = js.native
    def succeed(name: String, options: PartialSpinnerOptions): SpinnerOptions = js.native
    
    /**
      * Updates the spinner with name name with the provided options. Retains
      * the value of options that aren't specified.
      *
      * @returns full `SpinnerOptions` object for the given spinner, with
      * defaults applied
      */
    def update(name: String): SpinnerOptions = js.native
    def update(name: String, options: PartialSpinnerOptions): SpinnerOptions = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.spinnies.spinniesStrings.succeed
    - typings.spinnies.spinniesStrings.fail
    - typings.spinnies.spinniesStrings.stopped
  */
  trait StopAllStatus extends StObject
  object StopAllStatus {
    
    inline def fail: typings.spinnies.spinniesStrings.fail = "fail".asInstanceOf[typings.spinnies.spinniesStrings.fail]
    
    inline def stopped: typings.spinnies.spinniesStrings.stopped = "stopped".asInstanceOf[typings.spinnies.spinniesStrings.stopped]
    
    inline def succeed: typings.spinnies.spinniesStrings.succeed = "succeed".asInstanceOf[typings.spinnies.spinniesStrings.succeed]
  }
}
