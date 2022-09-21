package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.device.sqlite.IDatabase
import typings.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object device {
  
  @JSGlobal("Ext.device.Accelerometer")
  @js.native
  open class Accelerometer_ ()
    extends StObject
       with typings.senchaTouch.Ext.device.Accelerometer_
  /* static members */
  object Accelerometer_ {
    
    @JSGlobal("Ext.device.Accelerometer")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the value of frequency
      * @returns Number
      */
    inline def getFrequency(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFrequency")().asInstanceOf[Double]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
    inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Accelerometer.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of frequency
      * @param frequency Number The new value.
      */
    inline def setFrequency(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFrequency")().asInstanceOf[Unit]
    inline def setFrequency(frequency: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFrequency")(frequency.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.device.Browser")
  @js.native
  open class Browser_ ()
    extends StObject
       with typings.senchaTouch.Ext.device.Browser_
  /* static members */
  object Browser_ {
    
    @JSGlobal("Ext.device.Browser")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Used to close the browser if one is opened  */
    inline def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
    inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Used to open a new browser window
      * @param options Object The options to use when opening a new browser window.
      */
    inline def open(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[Unit]
    inline def open(options: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Browser.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.device.Camera")
  @js.native
  open class Camera_ ()
    extends StObject
       with typings.senchaTouch.Ext.device.Camera_
  /* static members */
  object Camera_ {
    
    @JSGlobal("Ext.device.Camera")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Allows you to capture a photo
      * @param options Object The options to use when taking a photo.
      * @param scope Object The scope in which to call the success and failure functions, if specified.
      * @param destination String The destination of the image which is returned. Available options are:  data - returns a base64 encoded string file - returns the file's URI
      * @param encoding String The encoding of the returned image. Available options are:  jpg png
      * @param width Number The width of the image to return
      * @param height Number The height of the image to return
      */
    inline def capture(
      options: js.UndefOr[Any],
      scope: js.UndefOr[Any],
      destination: js.UndefOr[java.lang.String],
      encoding: js.UndefOr[java.lang.String],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(options.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
    inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Camera.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.device.Capture")
  @js.native
  open class Capture_ ()
    extends StObject
       with typings.senchaTouch.Ext.device.Capture_
  /* static members */
  object Capture_ {
    
    @JSGlobal("Ext.device.Capture")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Start the audio recorder application and return information about captured audio clip file s
      * @param config Object The configuration object to be passed:
      */
    inline def captureAudio(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("captureAudio")().asInstanceOf[Unit]
    inline def captureAudio(config: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("captureAudio")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Start the video recorder application and return information about captured video clip file s
      * @param config Object The configuration object to be passed:
      */
    inline def captureVideo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("captureVideo")().asInstanceOf[Unit]
    inline def captureVideo(config: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("captureVideo")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
    inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Capture.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.device.Communicator")
  @js.native
  open class Communicator_ ()
    extends StObject
       with typings.senchaTouch.Ext.device.Communicator_
  /* static members */
  object Communicator_ {
    
    @JSGlobal("Ext.device.Communicator")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
    inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Communicator.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.device.Compass")
  @js.native
  open class Compass_ ()
    extends StObject
       with typings.senchaTouch.Ext.device.Compass_
  /* static members */
  object Compass_ {
    
    @JSGlobal("Ext.device.Compass")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the value of frequency
      * @returns Number
      */
    inline def getFrequency(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFrequency")().asInstanceOf[Double]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
    inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Compass.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of frequency
      * @param frequency Number The new value.
      */
    inline def setFrequency(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFrequency")().asInstanceOf[Unit]
    inline def setFrequency(frequency: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFrequency")(frequency.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.device.Connection")
  @js.native
  open class Connection_ ()
    extends StObject
       with typings.senchaTouch.Ext.device.Connection_
  /* static members */
  object Connection_ {
    
    @JSGlobal("Ext.device.Connection")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Connection.CELL_2G")
    @js.native
    def CELL_2G: java.lang.String = js.native
    inline def CELL_2G_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CELL_2G")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Connection.CELL_3G")
    @js.native
    def CELL_3G: java.lang.String = js.native
    inline def CELL_3G_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CELL_3G")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Connection.CELL_4G")
    @js.native
    def CELL_4G: java.lang.String = js.native
    inline def CELL_4G_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CELL_4G")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Connection.ETHERNET")
    @js.native
    def ETHERNET: java.lang.String = js.native
    inline def ETHERNET_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ETHERNET")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Connection.NONE")
    @js.native
    def NONE: java.lang.String = js.native
    inline def NONE_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Connection.UNKNOWN")
    @js.native
    def UNKNOWN: java.lang.String = js.native
    inline def UNKNOWN_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Connection.WIFI")
    @js.native
    def WIFI: java.lang.String = js.native
    inline def WIFI_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WIFI")(x.asInstanceOf[js.Any])
    
    /** [Method] Appends an after event handler
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def addAfterListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")().asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Appends a before event handler
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def addBeforeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")().asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
      */
    inline def addEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")().asInstanceOf[Unit]
    inline def addEvents(eventNames: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")(eventNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    inline def addListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")().asInstanceOf[Unit]
    inline def addListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    inline def addManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")().asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Removes all listeners for this object  */
    inline def clearListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearListeners")().asInstanceOf[Unit]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param events String/String[] The event name to bubble, or an Array of event names.
      */
    inline def enableBubble(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")().asInstanceOf[Unit]
    inline def enableBubble(events: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")(events.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
      * @param eventName String The name of the event to fire.
      * @param args Array Arguments to pass to handers.
      * @param fn Function Action.
      * @param scope Object Scope of fn.
      * @returns Object
      */
    inline def fireAction(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")().asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean Returns false if any of the handlers return false.
      */
    inline def fireEvent(eventName: java.lang.String, args: Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(List(eventName.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
    
    /** [Method] Returns the value of bubbleEvents
      * @returns String/String[]
      */
    inline def getBubbleEvents(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBubbleEvents")().asInstanceOf[Any]
    
    /** [Method] Retrieves the id of this component
      * @returns String id
      */
    inline def getId(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[java.lang.String]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns the value of listeners
      * @returns Object
      */
    inline def getListeners(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getListeners")().asInstanceOf[Any]
    
    /** [Method] Returns the value of online
      * @returns Boolean
      */
    inline def getOnline(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getOnline")().asInstanceOf[Boolean]
    
    /** [Method] Returns the current connection type
      * @returns String type
      */
    inline def getType(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")().asInstanceOf[java.lang.String]
    
    /** [Method] Checks to see if this object has any listeners for a specified event
      * @param eventName String The name of the event to check for
      * @returns Boolean True if the event is being listened for, else false
      */
    inline def hasListener(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")().asInstanceOf[Boolean]
    inline def hasListener(eventName: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
    inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] True if the device is currently online
      * @returns Boolean online
      */
    inline def isOnline(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOnline")().asInstanceOf[Boolean]
    
    /** [Method] Alias for addManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    inline def mon(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")().asInstanceOf[Unit]
    inline def mon(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for removeManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    inline def mun(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")().asInstanceOf[Unit]
    inline def mun(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for addListener
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    inline def on(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")().asInstanceOf[Unit]
    inline def on(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for addAfterListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def onAfter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")().asInstanceOf[Unit]
    inline def onAfter(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for addBeforeListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def onBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")().asInstanceOf[Unit]
    inline def onBefore(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    inline def relayEvents(): IObservable = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")().asInstanceOf[IObservable]
    inline def relayEvents(`object`: Any): IObservable = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any]).asInstanceOf[IObservable]
    inline def relayEvents(`object`: Any, events: Any): IObservable = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[IObservable]
    inline def relayEvents(`object`: Unit, events: Any): IObservable = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[IObservable]
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def removeAfterListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")().asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def removeBeforeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")().asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Removes an event handler
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    inline def removeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")().asInstanceOf[Unit]
    inline def removeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    inline def removeManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")().asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Resumes firing events see suspendEvents
      * @param discardQueuedEvents Boolean Pass as true to discard any queued events.
      */
    inline def resumeEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")().asInstanceOf[Unit]
    inline def resumeEvents(discardQueuedEvents: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")(discardQueuedEvents.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Connection.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of bubbleEvents
      * @param bubbleEvents String/String[] The new value.
      */
    inline def setBubbleEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBubbleEvents")().asInstanceOf[Unit]
    inline def setBubbleEvents(bubbleEvents: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBubbleEvents")(bubbleEvents.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of listeners
      * @param listeners Object The new value.
      */
    inline def setListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setListeners")().asInstanceOf[Unit]
    inline def setListeners(listeners: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setListeners")(listeners.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of online
      * @param online Boolean The new value.
      */
    inline def setOnline(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOnline")().asInstanceOf[Unit]
    inline def setOnline(online: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOnline")(online.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of type
      * @param type Object The new value.
      */
    inline def setType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setType")().asInstanceOf[Unit]
    inline def setType(`type`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Suspends the firing of all events  */
    inline def suspendEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvents")().asInstanceOf[Unit]
    
    /** [Method] Alias for removeListener
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    inline def un(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")().asInstanceOf[Unit]
    inline def un(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for removeAfterListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def unAfter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")().asInstanceOf[Unit]
    inline def unAfter(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for removeBeforeListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def unBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")().asInstanceOf[Unit]
    inline def unBefore(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("Ext.device.Contacts")
  @js.native
  open class Contacts_ ()
    extends StObject
       with typings.senchaTouch.Ext.device.Contacts_
  /* static members */
  object Contacts_ {
    
    @JSGlobal("Ext.device.Contacts")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Appends an after event handler
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def addAfterListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")().asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Appends a before event handler
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def addBeforeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")().asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
      */
    inline def addEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")().asInstanceOf[Unit]
    inline def addEvents(eventNames: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")(eventNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    inline def addListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")().asInstanceOf[Unit]
    inline def addListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    inline def addManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")().asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Removes all listeners for this object  */
    inline def clearListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearListeners")().asInstanceOf[Unit]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param events String/String[] The event name to bubble, or an Array of event names.
      */
    inline def enableBubble(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")().asInstanceOf[Unit]
    inline def enableBubble(events: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")(events.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
      * @param eventName String The name of the event to fire.
      * @param args Array Arguments to pass to handers.
      * @param fn Function Action.
      * @param scope Object Scope of fn.
      * @returns Object
      */
    inline def fireAction(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")().asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean Returns false if any of the handlers return false.
      */
    inline def fireEvent(eventName: java.lang.String, args: Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(List(eventName.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
    
    /** [Method] Returns the value of bubbleEvents
      * @returns String/String[]
      */
    inline def getBubbleEvents(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBubbleEvents")().asInstanceOf[Any]
    
    /** [Method] Returns an Array of contact objects
      * @param config Object
      * @returns Object[] An array of contact objects.
      */
    inline def getContacts(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getContacts")().asInstanceOf[typings.senchaTouch.Ext.Array]
    inline def getContacts(config: Any): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getContacts")(config.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
    
    /** [Method] Retrieves the id of this component
      * @returns String id
      */
    inline def getId(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[java.lang.String]
    
    /** [Method] Returns the value of includeImages
      * @returns Boolean
      */
    inline def getIncludeImages(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIncludeImages")().asInstanceOf[Boolean]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns the value of listeners
      * @returns Object
      */
    inline def getListeners(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getListeners")().asInstanceOf[Any]
    
    /** [Method] Returns localized user readable label for a contact field i e
      * @param config Object
      * @returns String user readable string
      */
    inline def getLocalizedLabel(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalizedLabel")().asInstanceOf[java.lang.String]
    inline def getLocalizedLabel(config: Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalizedLabel")(config.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Returns base64 encoded image thumbnail for a contact specified in config id This method is for Sencha Native Packager
      * @param config Object
      * @returns String base64 string
      */
    inline def getThumbnail(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getThumbnail")().asInstanceOf[java.lang.String]
    inline def getThumbnail(config: Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getThumbnail")(config.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Checks to see if this object has any listeners for a specified event
      * @param eventName String The name of the event to check for
      * @returns Boolean True if the event is being listened for, else false
      */
    inline def hasListener(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")().asInstanceOf[Boolean]
    inline def hasListener(eventName: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
    inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Alias for addManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    inline def mon(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")().asInstanceOf[Unit]
    inline def mon(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for removeManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    inline def mun(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")().asInstanceOf[Unit]
    inline def mun(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for addListener
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    inline def on(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")().asInstanceOf[Unit]
    inline def on(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for addAfterListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def onAfter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")().asInstanceOf[Unit]
    inline def onAfter(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for addBeforeListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def onBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")().asInstanceOf[Unit]
    inline def onBefore(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    inline def relayEvents(): IObservable = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")().asInstanceOf[IObservable]
    inline def relayEvents(`object`: Any): IObservable = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any]).asInstanceOf[IObservable]
    inline def relayEvents(`object`: Any, events: Any): IObservable = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[IObservable]
    inline def relayEvents(`object`: Unit, events: Any): IObservable = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[IObservable]
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def removeAfterListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")().asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def removeBeforeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")().asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Removes an event handler
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    inline def removeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")().asInstanceOf[Unit]
    inline def removeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    inline def removeManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")().asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Resumes firing events see suspendEvents
      * @param discardQueuedEvents Boolean Pass as true to discard any queued events.
      */
    inline def resumeEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")().asInstanceOf[Unit]
    inline def resumeEvents(discardQueuedEvents: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")(discardQueuedEvents.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Contacts.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of bubbleEvents
      * @param bubbleEvents String/String[] The new value.
      */
    inline def setBubbleEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBubbleEvents")().asInstanceOf[Unit]
    inline def setBubbleEvents(bubbleEvents: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBubbleEvents")(bubbleEvents.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of includeImages
      * @param includeImages Boolean The new value.
      */
    inline def setIncludeImages(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setIncludeImages")().asInstanceOf[Unit]
    inline def setIncludeImages(includeImages: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setIncludeImages")(includeImages.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of listeners
      * @param listeners Object The new value.
      */
    inline def setListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setListeners")().asInstanceOf[Unit]
    inline def setListeners(listeners: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setListeners")(listeners.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Suspends the firing of all events  */
    inline def suspendEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvents")().asInstanceOf[Unit]
    
    /** [Method] Alias for removeListener
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    inline def un(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")().asInstanceOf[Unit]
    inline def un(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for removeAfterListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def unAfter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")().asInstanceOf[Unit]
    inline def unAfter(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for removeBeforeListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def unBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")().asInstanceOf[Unit]
    inline def unBefore(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("Ext.device.Device")
  @js.native
  open class Device_ ()
    extends StObject
       with typings.senchaTouch.Ext.device.Device_
  /* static members */
  object Device_ {
    
    @JSGlobal("Ext.device.Device")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Appends an after event handler
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def addAfterListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")().asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Appends a before event handler
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def addBeforeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")().asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
      */
    inline def addEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")().asInstanceOf[Unit]
    inline def addEvents(eventNames: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")(eventNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    inline def addListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")().asInstanceOf[Unit]
    inline def addListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    inline def addManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")().asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Removes all listeners for this object  */
    inline def clearListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearListeners")().asInstanceOf[Unit]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param events String/String[] The event name to bubble, or an Array of event names.
      */
    inline def enableBubble(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")().asInstanceOf[Unit]
    inline def enableBubble(events: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")(events.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
      * @param eventName String The name of the event to fire.
      * @param args Array Arguments to pass to handers.
      * @param fn Function Action.
      * @param scope Object Scope of fn.
      * @returns Object
      */
    inline def fireAction(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")().asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean Returns false if any of the handlers return false.
      */
    inline def fireEvent(eventName: java.lang.String, args: Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(List(eventName.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
    
    /** [Method] Returns the value of bubbleEvents
      * @returns String/String[]
      */
    inline def getBubbleEvents(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBubbleEvents")().asInstanceOf[Any]
    
    /** [Method] Retrieves the id of this component
      * @returns String id
      */
    inline def getId(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[java.lang.String]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns the value of listeners
      * @returns Object
      */
    inline def getListeners(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getListeners")().asInstanceOf[Any]
    
    /** [Method] Checks to see if this object has any listeners for a specified event
      * @param eventName String The name of the event to check for
      * @returns Boolean True if the event is being listened for, else false
      */
    inline def hasListener(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")().asInstanceOf[Boolean]
    inline def hasListener(eventName: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
    inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Alias for addManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    inline def mon(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")().asInstanceOf[Unit]
    inline def mon(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for removeManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    inline def mun(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")().asInstanceOf[Unit]
    inline def mun(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Device.name")
    @js.native
    def name: java.lang.String = js.native
    inline def name_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    /** [Method] Alias for addListener
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    inline def on(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")().asInstanceOf[Unit]
    inline def on(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for addAfterListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def onAfter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")().asInstanceOf[Unit]
    inline def onAfter(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for addBeforeListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def onBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")().asInstanceOf[Unit]
    inline def onBefore(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Opens a specified URL
      * @param url String The URL to open
      */
    inline def openURL(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openURL")().asInstanceOf[Unit]
    inline def openURL(url: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Device.platform")
    @js.native
    def platform: java.lang.String = js.native
    inline def platform_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("platform")(x.asInstanceOf[js.Any])
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    inline def relayEvents(): IObservable = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")().asInstanceOf[IObservable]
    inline def relayEvents(`object`: Any): IObservable = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any]).asInstanceOf[IObservable]
    inline def relayEvents(`object`: Any, events: Any): IObservable = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[IObservable]
    inline def relayEvents(`object`: Unit, events: Any): IObservable = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[IObservable]
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def removeAfterListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")().asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def removeBeforeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")().asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Removes an event handler
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    inline def removeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")().asInstanceOf[Unit]
    inline def removeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    inline def removeManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")().asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Resumes firing events see suspendEvents
      * @param discardQueuedEvents Boolean Pass as true to discard any queued events.
      */
    inline def resumeEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")().asInstanceOf[Unit]
    inline def resumeEvents(discardQueuedEvents: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")(discardQueuedEvents.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Object/Boolean) */
    @JSGlobal("Ext.device.Device.scheme")
    @js.native
    def scheme: Any = js.native
    inline def scheme_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheme")(x.asInstanceOf[js.Any])
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Device.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of bubbleEvents
      * @param bubbleEvents String/String[] The new value.
      */
    inline def setBubbleEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBubbleEvents")().asInstanceOf[Unit]
    inline def setBubbleEvents(bubbleEvents: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBubbleEvents")(bubbleEvents.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of listeners
      * @param listeners Object The new value.
      */
    inline def setListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setListeners")().asInstanceOf[Unit]
    inline def setListeners(listeners: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setListeners")(listeners.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Suspends the firing of all events  */
    inline def suspendEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvents")().asInstanceOf[Unit]
    
    /** [Method] Alias for removeListener
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    inline def un(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")().asInstanceOf[Unit]
    inline def un(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for removeAfterListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def unAfter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")().asInstanceOf[Unit]
    inline def unAfter(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for removeBeforeListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def unBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")().asInstanceOf[Unit]
    inline def unBefore(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Device.uuid")
    @js.native
    def uuid: java.lang.String = js.native
    inline def uuid_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uuid")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Ext.device.FileSystem")
  @js.native
  open class FileSystem_ ()
    extends StObject
       with typings.senchaTouch.Ext.device.FileSystem_
  /* static members */
  object FileSystem_ {
    
    @JSGlobal("Ext.device.FileSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the value of fileSystemSize
      * @returns Number
      */
    inline def getFileSystemSize(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileSystemSize")().asInstanceOf[Double]
    
    /** [Method] Returns the value of fileSystemType
      * @returns Number
      */
    inline def getFileSystemType(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileSystemType")().asInstanceOf[Double]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns the value of readerType
      * @returns String
      */
    inline def getReaderType(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getReaderType")().asInstanceOf[java.lang.String]
    
    /** [Method] Returns the value of stringEncoding
      * @returns String
      */
    inline def getStringEncoding(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringEncoding")().asInstanceOf[java.lang.String]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
    inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Requests a Ext device filesystem FileSystem instance
      * @param config Object The object which contains the following config options:
      */
    inline def requestFileSystem(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestFileSystem")().asInstanceOf[Unit]
    inline def requestFileSystem(config: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestFileSystem")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.FileSystem.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of fileSystemSize
      * @param fileSystemSize Number The new value.
      */
    inline def setFileSystemSize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFileSystemSize")().asInstanceOf[Unit]
    inline def setFileSystemSize(fileSystemSize: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFileSystemSize")(fileSystemSize.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of fileSystemType
      * @param fileSystemType Number The new value.
      */
    inline def setFileSystemType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFileSystemType")().asInstanceOf[Unit]
    inline def setFileSystemType(fileSystemType: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFileSystemType")(fileSystemType.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of readerType
      * @param readerType String The new value.
      */
    inline def setReaderType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setReaderType")().asInstanceOf[Unit]
    inline def setReaderType(readerType: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setReaderType")(readerType.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of stringEncoding
      * @param stringEncoding String The new value.
      */
    inline def setStringEncoding(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStringEncoding")().asInstanceOf[Unit]
    inline def setStringEncoding(stringEncoding: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStringEncoding")(stringEncoding.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.device.Geolocation")
  @js.native
  open class Geolocation_ ()
    extends StObject
       with typings.senchaTouch.Ext.device.Geolocation_
  /* static members */
  object Geolocation_ {
    
    @JSGlobal("Ext.device.Geolocation")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] If you are currently watching for the current position this will stop that task  */
    inline def clearWatch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearWatch")().asInstanceOf[Unit]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the value of allowHighAccuracy
      * @returns Boolean
      */
    inline def getAllowHighAccuracy(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllowHighAccuracy")().asInstanceOf[Boolean]
    
    /** [Method] Attempts to get the current position of this device
      * @param config Object An object which contains the following config options:
      */
    inline def getCurrentPosition(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPosition")().asInstanceOf[Unit]
    inline def getCurrentPosition(config: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPosition")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Returns the value of frequency
      * @returns Number
      */
    inline def getFrequency(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFrequency")().asInstanceOf[Double]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns the value of maximumAge
      * @returns Number
      */
    inline def getMaximumAge(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumAge")().asInstanceOf[Double]
    
    /** [Method] Returns the value of timeout
      * @returns Number
      */
    inline def getTimeout(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeout")().asInstanceOf[Double]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
    inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Geolocation.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of allowHighAccuracy
      * @param allowHighAccuracy Boolean The new value.
      */
    inline def setAllowHighAccuracy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAllowHighAccuracy")().asInstanceOf[Unit]
    inline def setAllowHighAccuracy(allowHighAccuracy: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAllowHighAccuracy")(allowHighAccuracy.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of frequency
      * @param frequency Number The new value.
      */
    inline def setFrequency(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFrequency")().asInstanceOf[Unit]
    inline def setFrequency(frequency: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFrequency")(frequency.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of maximumAge
      * @param maximumAge Number The new value.
      */
    inline def setMaximumAge(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaximumAge")().asInstanceOf[Unit]
    inline def setMaximumAge(maximumAge: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaximumAge")(maximumAge.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of timeout
      * @param timeout Number The new value.
      */
    inline def setTimeout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")().asInstanceOf[Unit]
    inline def setTimeout(timeout: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(timeout.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Watches for the current position and calls the callback when successful depending on the specified frequency
      * @param config Object An object which contains the following config options:
      */
    inline def watchPosition(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("watchPosition")().asInstanceOf[Unit]
    inline def watchPosition(config: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("watchPosition")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSGlobal("Ext.device.Globalization")
  @js.native
  open class Globalization_ ()
    extends StObject
       with typings.senchaTouch.Ext.device.Globalization_
  /* static members */
  object Globalization_ {
    
    @JSGlobal("Ext.device.Globalization")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
    inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Globalization.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.device.Media")
  @js.native
  open class Media_ ()
    extends StObject
       with typings.senchaTouch.Ext.device.Media_
  /* static members */
  object Media_ {
    
    @JSGlobal("Ext.device.Media")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Appends an after event handler
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def addAfterListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")().asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Appends a before event handler
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def addBeforeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")().asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
      */
    inline def addEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")().asInstanceOf[Unit]
    inline def addEvents(eventNames: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")(eventNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    inline def addListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")().asInstanceOf[Unit]
    inline def addListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    inline def addManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")().asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Removes all listeners for this object  */
    inline def clearListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearListeners")().asInstanceOf[Unit]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param events String/String[] The event name to bubble, or an Array of event names.
      */
    inline def enableBubble(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")().asInstanceOf[Unit]
    inline def enableBubble(events: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")(events.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
      * @param eventName String The name of the event to fire.
      * @param args Array Arguments to pass to handers.
      * @param fn Function Action.
      * @param scope Object Scope of fn.
      * @returns Object
      */
    inline def fireAction(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")().asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean Returns false if any of the handlers return false.
      */
    inline def fireEvent(eventName: java.lang.String, args: Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(List(eventName.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
    
    /** [Method] Returns the value of bubbleEvents
      * @returns String/String[]
      */
    inline def getBubbleEvents(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBubbleEvents")().asInstanceOf[Any]
    
    /** [Method] Retrieves the id of this component
      * @returns String id
      */
    inline def getId(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[java.lang.String]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns the value of listeners
      * @returns Object
      */
    inline def getListeners(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getListeners")().asInstanceOf[Any]
    
    /** [Method] Returns the value of src
      * @returns Object
      */
    inline def getSrc(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSrc")().asInstanceOf[Any]
    
    /** [Method] Checks to see if this object has any listeners for a specified event
      * @param eventName String The name of the event to check for
      * @returns Boolean True if the event is being listened for, else false
      */
    inline def hasListener(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")().asInstanceOf[Boolean]
    inline def hasListener(eventName: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
    inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Alias for addManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    inline def mon(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")().asInstanceOf[Unit]
    inline def mon(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for removeManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    inline def mun(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")().asInstanceOf[Unit]
    inline def mun(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for addListener
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    inline def on(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")().asInstanceOf[Unit]
    inline def on(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for addAfterListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def onAfter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")().asInstanceOf[Unit]
    inline def onAfter(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for addBeforeListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def onBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")().asInstanceOf[Unit]
    inline def onBefore(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    inline def relayEvents(): IObservable = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")().asInstanceOf[IObservable]
    inline def relayEvents(`object`: Any): IObservable = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any]).asInstanceOf[IObservable]
    inline def relayEvents(`object`: Any, events: Any): IObservable = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[IObservable]
    inline def relayEvents(`object`: Unit, events: Any): IObservable = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[IObservable]
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def removeAfterListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")().asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def removeBeforeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")().asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Removes an event handler
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    inline def removeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")().asInstanceOf[Unit]
    inline def removeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    inline def removeManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")().asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Resumes firing events see suspendEvents
      * @param discardQueuedEvents Boolean Pass as true to discard any queued events.
      */
    inline def resumeEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")().asInstanceOf[Unit]
    inline def resumeEvents(discardQueuedEvents: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")(discardQueuedEvents.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Media.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of bubbleEvents
      * @param bubbleEvents String/String[] The new value.
      */
    inline def setBubbleEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBubbleEvents")().asInstanceOf[Unit]
    inline def setBubbleEvents(bubbleEvents: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBubbleEvents")(bubbleEvents.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of listeners
      * @param listeners Object The new value.
      */
    inline def setListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setListeners")().asInstanceOf[Unit]
    inline def setListeners(listeners: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setListeners")(listeners.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of src
      * @param src Object The new value.
      */
    inline def setSrc(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSrc")().asInstanceOf[Unit]
    inline def setSrc(src: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSrc")(src.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Suspends the firing of all events  */
    inline def suspendEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvents")().asInstanceOf[Unit]
    
    /** [Method] Alias for removeListener
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    inline def un(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")().asInstanceOf[Unit]
    inline def un(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for removeAfterListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def unAfter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")().asInstanceOf[Unit]
    inline def unAfter(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for removeBeforeListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def unBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")().asInstanceOf[Unit]
    inline def unBefore(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("Ext.device.Notification")
  @js.native
  open class Notification_ ()
    extends StObject
       with typings.senchaTouch.Ext.device.Notification_
  /* static members */
  object Notification_ {
    
    @JSGlobal("Ext.device.Notification")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
    inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Notification.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] A simple way to show a notification
      * @param config Object An object which contains the following config options:
      */
    inline def show(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Unit]
    inline def show(config: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Vibrates the device  */
    inline def vibrate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("vibrate")().asInstanceOf[Unit]
  }
  
  @JSGlobal("Ext.device.Orientation")
  @js.native
  open class Orientation_ ()
    extends StObject
       with typings.senchaTouch.Ext.device.Orientation_
  /* static members */
  object Orientation_ {
    
    @JSGlobal("Ext.device.Orientation")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Appends an after event handler
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def addAfterListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")().asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addAfterListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Appends a before event handler
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def addBeforeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")().asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBeforeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
      */
    inline def addEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")().asInstanceOf[Unit]
    inline def addEvents(eventNames: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")(eventNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    inline def addListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")().asInstanceOf[Unit]
    inline def addListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addListener(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    inline def addManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")().asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Removes all listeners for this object  */
    inline def clearListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearListeners")().asInstanceOf[Unit]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param events String/String[] The event name to bubble, or an Array of event names.
      */
    inline def enableBubble(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")().asInstanceOf[Unit]
    inline def enableBubble(events: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBubble")(events.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
      * @param eventName String The name of the event to fire.
      * @param args Array Arguments to pass to handers.
      * @param fn Function Action.
      * @param scope Object Scope of fn.
      * @returns Object
      */
    inline def fireAction(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")().asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: Unit, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: Unit, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: Unit, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def fireAction(eventName: Unit, args: typings.senchaTouch.Ext.Array, fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fireAction")(eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean Returns false if any of the handlers return false.
      */
    inline def fireEvent(eventName: java.lang.String, args: Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(List(eventName.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
    
    /** [Method] Returns the value of bubbleEvents
      * @returns String/String[]
      */
    inline def getBubbleEvents(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBubbleEvents")().asInstanceOf[Any]
    
    /** [Method] Retrieves the id of this component
      * @returns String id
      */
    inline def getId(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[java.lang.String]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns the value of listeners
      * @returns Object
      */
    inline def getListeners(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getListeners")().asInstanceOf[Any]
    
    /** [Method] Checks to see if this object has any listeners for a specified event
      * @param eventName String The name of the event to check for
      * @returns Boolean True if the event is being listened for, else false
      */
    inline def hasListener(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")().asInstanceOf[Boolean]
    inline def hasListener(eventName: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
    inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Alias for addManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    inline def mon(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")().asInstanceOf[Unit]
    inline def mon(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Any, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mon(`object`: Unit, eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mon")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for removeManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    inline def mun(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")().asInstanceOf[Unit]
    inline def mun(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mun(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mun")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for addListener
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    inline def on(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")().asInstanceOf[Unit]
    inline def on(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for addAfterListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def onAfter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")().asInstanceOf[Unit]
    inline def onAfter(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onAfter(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for addBeforeListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    inline def onBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")().asInstanceOf[Unit]
    inline def onBefore(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def onBefore(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    inline def relayEvents(): IObservable = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")().asInstanceOf[IObservable]
    inline def relayEvents(`object`: Any): IObservable = ^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any]).asInstanceOf[IObservable]
    inline def relayEvents(`object`: Any, events: Any): IObservable = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[IObservable]
    inline def relayEvents(`object`: Unit, events: Any): IObservable = (^.asInstanceOf[js.Dynamic].applyDynamic("relayEvents")(`object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[IObservable]
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def removeAfterListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")().asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeAfterListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAfterListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def removeBeforeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")().asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeBeforeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBeforeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Removes an event handler
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    inline def removeListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")().asInstanceOf[Unit]
    inline def removeListener(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeListener(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    inline def removeManagedListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")().asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Any, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeManagedListener(`object`: Unit, eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManagedListener")(`object`.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Resumes firing events see suspendEvents
      * @param discardQueuedEvents Boolean Pass as true to discard any queued events.
      */
    inline def resumeEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")().asInstanceOf[Unit]
    inline def resumeEvents(discardQueuedEvents: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeEvents")(discardQueuedEvents.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Orientation.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of bubbleEvents
      * @param bubbleEvents String/String[] The new value.
      */
    inline def setBubbleEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBubbleEvents")().asInstanceOf[Unit]
    inline def setBubbleEvents(bubbleEvents: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBubbleEvents")(bubbleEvents.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Sets the value of listeners
      * @param listeners Object The new value.
      */
    inline def setListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setListeners")().asInstanceOf[Unit]
    inline def setListeners(listeners: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setListeners")(listeners.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Suspends the firing of all events  */
    inline def suspendEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("suspendEvents")().asInstanceOf[Unit]
    
    /** [Method] Alias for removeListener
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    inline def un(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")().asInstanceOf[Unit]
    inline def un(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Any, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Any, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Any, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Any, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def un(eventName: Unit, fn: Unit, scope: Unit, options: Unit, order: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("un")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for removeAfterListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def unAfter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")().asInstanceOf[Unit]
    inline def unAfter(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unAfter(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unAfter")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Alias for removeBeforeListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    inline def unBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")().asInstanceOf[Unit]
    inline def unBefore(eventName: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Any, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Any, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Unit, scope: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unBefore(eventName: Unit, fn: Unit, scope: Unit, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unBefore")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("Ext.device.Purchases")
  @js.native
  open class Purchases_ ()
    extends StObject
       with typings.senchaTouch.Ext.device.Purchases_
  /* static members */
  object Purchases_ {
    
    @JSGlobal("Ext.device.Purchases")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Checks if the current user is able to make payments
      * @param config Object
      */
    inline def canMakePayments(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("canMakePayments")().asInstanceOf[Unit]
    inline def canMakePayments(config: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("canMakePayments")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns a Ext data Store instance of all purchases delivered to the current user
      * @param config Object
      */
    inline def getCompletedPurchases(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompletedPurchases")().asInstanceOf[Unit]
    inline def getCompletedPurchases(config: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompletedPurchases")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns a Ext data Store instance of all products available to purchase
      * @param config Object
      */
    inline def getProducts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getProducts")().asInstanceOf[Unit]
    inline def getProducts(config: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getProducts")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Returns a Ext data Store instance of all purchases the current user has been charged
      * @param config Object
      */
    inline def getPurchases(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPurchases")().asInstanceOf[Unit]
    inline def getPurchases(config: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPurchases")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
    inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Purchases.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.device.Push")
  @js.native
  open class Push_ ()
    extends StObject
       with typings.senchaTouch.Ext.device.Push_
  /* static members */
  object Push_ {
    
    @JSGlobal("Ext.device.Push")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.device.Push.ALERT")
    @js.native
    def ALERT: Double = js.native
    inline def ALERT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALERT")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.device.Push.BADGE")
    @js.native
    def BADGE: Double = js.native
    inline def BADGE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BADGE")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.device.Push.SOUND")
    @js.native
    def SOUND: Double = js.native
    inline def SOUND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SOUND")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
    inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Registers a push notification
      * @param config Object The configuration for to pass when registering this push notification service.
      */
    inline def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
    inline def register(config: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Push.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.device.SQLite")
  @js.native
  open class SQLite_ ()
    extends StObject
       with typings.senchaTouch.Ext.device.SQLite_
  /* static members */
  object SQLite_ {
    
    @JSGlobal("Ext.device.SQLite")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
    inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Returns a Ext device sqlite Database instance
      * @param config Object The object which contains the following config options:
      * @returns Ext.device.sqlite.Database The opened database, null if an error occured.
      */
    inline def openDatabase(): IDatabase = ^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")().asInstanceOf[IDatabase]
    inline def openDatabase(config: Any): IDatabase = ^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(config.asInstanceOf[js.Any]).asInstanceOf[IDatabase]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.SQLite.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.device.Splashscreen")
  @js.native
  open class Splashscreen_ ()
    extends StObject
       with typings.senchaTouch.Ext.device.Splashscreen_
  /* static members */
  object Splashscreen_ {
    
    @JSGlobal("Ext.device.Splashscreen")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
    inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
    inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
    inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
    inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
    inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Splashscreen.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
}
