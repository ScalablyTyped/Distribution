package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.device.sqlite.IDatabase
import typings.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object device {
  
  @JSGlobal("Ext.device.Accelerometer")
  @js.native
  class Accelerometer_ ()
    extends typings.senchaTouch.Ext.device.Accelerometer_
  /* static members */
  object Accelerometer_ {
    
    @JSGlobal("Ext.device.Accelerometer")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.device.Accelerometer.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.device.Accelerometer.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.device.Accelerometer.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.device.Accelerometer.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.device.Accelerometer.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.device.Accelerometer.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.device.Accelerometer.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the value of frequency
      * @returns Number
      */
    @JSGlobal("Ext.device.Accelerometer.getFrequency")
    @js.native
    def getFrequency(): Double = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.device.Accelerometer.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Accelerometer.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.device.Accelerometer.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Accelerometer.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Accelerometer.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of frequency
      * @param frequency Number The new value.
      */
    @JSGlobal("Ext.device.Accelerometer.setFrequency")
    @js.native
    def setFrequency(): Unit = js.native
    @JSGlobal("Ext.device.Accelerometer.setFrequency")
    @js.native
    def setFrequency(frequency: Double): Unit = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.device.Accelerometer.statics")
    @js.native
    def statics(): IClass = js.native
  }
  
  @JSGlobal("Ext.device.Browser")
  @js.native
  class Browser_ ()
    extends typings.senchaTouch.Ext.device.Browser_
  /* static members */
  object Browser_ {
    
    @JSGlobal("Ext.device.Browser")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.device.Browser.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.device.Browser.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.device.Browser.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.device.Browser.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.device.Browser.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.device.Browser.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Used to close the browser if one is opened  */
    @JSGlobal("Ext.device.Browser.close")
    @js.native
    def close(): Unit = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.device.Browser.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.device.Browser.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Browser.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.device.Browser.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Browser.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method] Used to open a new browser window
      * @param options Object The options to use when opening a new browser window.
      */
    @JSGlobal("Ext.device.Browser.open")
    @js.native
    def open(): Unit = js.native
    @JSGlobal("Ext.device.Browser.open")
    @js.native
    def open(options: js.Any): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Browser.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.device.Browser.statics")
    @js.native
    def statics(): IClass = js.native
  }
  
  @JSGlobal("Ext.device.Camera")
  @js.native
  class Camera_ ()
    extends typings.senchaTouch.Ext.device.Camera_
  /* static members */
  object Camera_ {
    
    @JSGlobal("Ext.device.Camera")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.device.Camera.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.device.Camera.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.device.Camera.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.device.Camera.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.device.Camera.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.device.Camera.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Allows you to capture a photo
      * @param options Object The options to use when taking a photo.
      * @param scope Object The scope in which to call the success and failure functions, if specified.
      * @param destination String The destination of the image which is returned. Available options are:  data - returns a base64 encoded string file - returns the file's URI
      * @param encoding String The encoding of the returned image. Available options are:  jpg png
      * @param width Number The width of the image to return
      * @param height Number The height of the image to return
      */
    @JSGlobal("Ext.device.Camera.capture")
    @js.native
    def capture(
      options: js.UndefOr[js.Any],
      scope: js.UndefOr[js.Any],
      destination: js.UndefOr[java.lang.String],
      encoding: js.UndefOr[java.lang.String],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double]
    ): Unit = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.device.Camera.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.device.Camera.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Camera.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.device.Camera.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Camera.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Camera.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.device.Camera.statics")
    @js.native
    def statics(): IClass = js.native
  }
  
  @JSGlobal("Ext.device.Capture")
  @js.native
  class Capture_ ()
    extends typings.senchaTouch.Ext.device.Capture_
  /* static members */
  object Capture_ {
    
    @JSGlobal("Ext.device.Capture")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.device.Capture.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.device.Capture.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.device.Capture.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.device.Capture.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.device.Capture.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.device.Capture.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Start the audio recorder application and return information about captured audio clip file s
      * @param config Object The configuration object to be passed:
      */
    @JSGlobal("Ext.device.Capture.captureAudio")
    @js.native
    def captureAudio(): Unit = js.native
    @JSGlobal("Ext.device.Capture.captureAudio")
    @js.native
    def captureAudio(config: js.Any): Unit = js.native
    
    /** [Method] Start the video recorder application and return information about captured video clip file s
      * @param config Object The configuration object to be passed:
      */
    @JSGlobal("Ext.device.Capture.captureVideo")
    @js.native
    def captureVideo(): Unit = js.native
    @JSGlobal("Ext.device.Capture.captureVideo")
    @js.native
    def captureVideo(config: js.Any): Unit = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.device.Capture.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.device.Capture.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Capture.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.device.Capture.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Capture.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Capture.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.device.Capture.statics")
    @js.native
    def statics(): IClass = js.native
  }
  
  @JSGlobal("Ext.device.Communicator")
  @js.native
  class Communicator_ ()
    extends typings.senchaTouch.Ext.device.Communicator_
  /* static members */
  object Communicator_ {
    
    @JSGlobal("Ext.device.Communicator")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.device.Communicator.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.device.Communicator.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.device.Communicator.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.device.Communicator.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.device.Communicator.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.device.Communicator.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.device.Communicator.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.device.Communicator.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Communicator.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.device.Communicator.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Communicator.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Communicator.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.device.Communicator.statics")
    @js.native
    def statics(): IClass = js.native
  }
  
  @JSGlobal("Ext.device.Compass")
  @js.native
  class Compass_ ()
    extends typings.senchaTouch.Ext.device.Compass_
  /* static members */
  object Compass_ {
    
    @JSGlobal("Ext.device.Compass")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.device.Compass.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.device.Compass.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.device.Compass.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.device.Compass.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.device.Compass.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.device.Compass.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.device.Compass.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the value of frequency
      * @returns Number
      */
    @JSGlobal("Ext.device.Compass.getFrequency")
    @js.native
    def getFrequency(): Double = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.device.Compass.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Compass.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.device.Compass.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Compass.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Compass.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of frequency
      * @param frequency Number The new value.
      */
    @JSGlobal("Ext.device.Compass.setFrequency")
    @js.native
    def setFrequency(): Unit = js.native
    @JSGlobal("Ext.device.Compass.setFrequency")
    @js.native
    def setFrequency(frequency: Double): Unit = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.device.Compass.statics")
    @js.native
    def statics(): IClass = js.native
  }
  
  @JSGlobal("Ext.device.Connection")
  @js.native
  class Connection_ ()
    extends typings.senchaTouch.Ext.device.Connection_
  /* static members */
  object Connection_ {
    
    @JSGlobal("Ext.device.Connection")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Connection.CELL_2G")
    @js.native
    def CELL_2G: java.lang.String = js.native
    @scala.inline
    def CELL_2G_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CELL_2G")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Connection.CELL_3G")
    @js.native
    def CELL_3G: java.lang.String = js.native
    @scala.inline
    def CELL_3G_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CELL_3G")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Connection.CELL_4G")
    @js.native
    def CELL_4G: java.lang.String = js.native
    @scala.inline
    def CELL_4G_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CELL_4G")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Connection.ETHERNET")
    @js.native
    def ETHERNET: java.lang.String = js.native
    @scala.inline
    def ETHERNET_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ETHERNET")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Connection.NONE")
    @js.native
    def NONE: java.lang.String = js.native
    @scala.inline
    def NONE_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Connection.UNKNOWN")
    @js.native
    def UNKNOWN: java.lang.String = js.native
    @scala.inline
    def UNKNOWN_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Connection.WIFI")
    @js.native
    def WIFI: java.lang.String = js.native
    @scala.inline
    def WIFI_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WIFI")(x.asInstanceOf[js.Any])
    
    /** [Method] Appends an after event handler
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    @JSGlobal("Ext.device.Connection.addAfterListener")
    @js.native
    def addAfterListener(): Unit = js.native
    @JSGlobal("Ext.device.Connection.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Appends a before event handler
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    @JSGlobal("Ext.device.Connection.addBeforeListener")
    @js.native
    def addBeforeListener(): Unit = js.native
    @JSGlobal("Ext.device.Connection.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
      */
    @JSGlobal("Ext.device.Connection.addEvents")
    @js.native
    def addEvents(): Unit = js.native
    @JSGlobal("Ext.device.Connection.addEvents")
    @js.native
    def addEvents(eventNames: js.Any): Unit = js.native
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.device.Connection.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.device.Connection.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.device.Connection.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.device.Connection.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.device.Connection.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.device.Connection.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Removes all listeners for this object  */
    @JSGlobal("Ext.device.Connection.clearListeners")
    @js.native
    def clearListeners(): Unit = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.device.Connection.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param events String/String[] The event name to bubble, or an Array of event names.
      */
    @JSGlobal("Ext.device.Connection.enableBubble")
    @js.native
    def enableBubble(): Unit = js.native
    @JSGlobal("Ext.device.Connection.enableBubble")
    @js.native
    def enableBubble(events: js.Any): Unit = js.native
    
    /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
      * @param eventName String The name of the event to fire.
      * @param args Array Arguments to pass to handers.
      * @param fn Function Action.
      * @param scope Object Scope of fn.
      * @returns Object
      */
    @JSGlobal("Ext.device.Connection.fireAction")
    @js.native
    def fireAction(): js.Any = js.native
    @JSGlobal("Ext.device.Connection.fireAction")
    @js.native
    def fireAction(
      eventName: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Connection.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Connection.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Connection.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: typings.senchaTouch.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.device.Connection.fireAction")
    @js.native
    def fireAction(
      eventName: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Connection.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: typings.senchaTouch.Ext.Array, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Connection.fireAction")
    @js.native
    def fireAction(
      eventName: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      fn: js.Any,
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Connection.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.device.Connection.fireAction")
    @js.native
    def fireAction(
      eventName: java.lang.String,
      args: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Connection.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Connection.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Connection.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.device.Connection.fireAction")
    @js.native
    def fireAction(
      eventName: java.lang.String,
      args: typings.senchaTouch.Ext.Array,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Connection.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Connection.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): js.Any = js.native
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean Returns false if any of the handlers return false.
      */
    @JSGlobal("Ext.device.Connection.fireEvent")
    @js.native
    def fireEvent(eventName: java.lang.String, args: js.Any*): Boolean = js.native
    
    /** [Method] Returns the value of bubbleEvents
      * @returns String/String[]
      */
    @JSGlobal("Ext.device.Connection.getBubbleEvents")
    @js.native
    def getBubbleEvents(): js.Any = js.native
    
    /** [Method] Retrieves the id of this component
      * @returns String id
      */
    @JSGlobal("Ext.device.Connection.getId")
    @js.native
    def getId(): java.lang.String = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.device.Connection.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Connection.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Returns the value of listeners
      * @returns Object
      */
    @JSGlobal("Ext.device.Connection.getListeners")
    @js.native
    def getListeners(): js.Any = js.native
    
    /** [Method] Returns the value of online
      * @returns Boolean
      */
    @JSGlobal("Ext.device.Connection.getOnline")
    @js.native
    def getOnline(): Boolean = js.native
    
    /** [Method] Returns the current connection type
      * @returns String type
      */
    @JSGlobal("Ext.device.Connection.getType")
    @js.native
    def getType(): java.lang.String = js.native
    
    /** [Method] Checks to see if this object has any listeners for a specified event
      * @param eventName String The name of the event to check for
      * @returns Boolean True if the event is being listened for, else false
      */
    @JSGlobal("Ext.device.Connection.hasListener")
    @js.native
    def hasListener(): Boolean = js.native
    @JSGlobal("Ext.device.Connection.hasListener")
    @js.native
    def hasListener(eventName: java.lang.String): Boolean = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.device.Connection.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Connection.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method] True if the device is currently online
      * @returns Boolean online
      */
    @JSGlobal("Ext.device.Connection.isOnline")
    @js.native
    def isOnline(): Boolean = js.native
    
    /** [Method] Alias for addManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Alias for removeManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    @JSGlobal("Ext.device.Connection.mun")
    @js.native
    def mun(): Unit = js.native
    @JSGlobal("Ext.device.Connection.mun")
    @js.native
    def mun(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mun")
    @js.native
    def mun(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mun")
    @js.native
    def mun(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mun")
    @js.native
    def mun(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mun")
    @js.native
    def mun(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Alias for addListener
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Alias for addAfterListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    @JSGlobal("Ext.device.Connection.onAfter")
    @js.native
    def onAfter(): Unit = js.native
    @JSGlobal("Ext.device.Connection.onAfter")
    @js.native
    def onAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onAfter")
    @js.native
    def onAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onAfter")
    @js.native
    def onAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onAfter")
    @js.native
    def onAfter(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onAfter")
    @js.native
    def onAfter(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Alias for addBeforeListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    @JSGlobal("Ext.device.Connection.onBefore")
    @js.native
    def onBefore(): Unit = js.native
    @JSGlobal("Ext.device.Connection.onBefore")
    @js.native
    def onBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onBefore")
    @js.native
    def onBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onBefore")
    @js.native
    def onBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onBefore")
    @js.native
    def onBefore(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onBefore")
    @js.native
    def onBefore(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSGlobal("Ext.device.Connection.relayEvents")
    @js.native
    def relayEvents(): IObservable = js.native
    @JSGlobal("Ext.device.Connection.relayEvents")
    @js.native
    def relayEvents(`object`: js.UndefOr[scala.Nothing], events: js.Any): IObservable = js.native
    @JSGlobal("Ext.device.Connection.relayEvents")
    @js.native
    def relayEvents(`object`: js.Any): IObservable = js.native
    @JSGlobal("Ext.device.Connection.relayEvents")
    @js.native
    def relayEvents(`object`: js.Any, events: js.Any): IObservable = js.native
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Connection.removeAfterListener")
    @js.native
    def removeAfterListener(): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Connection.removeBeforeListener")
    @js.native
    def removeBeforeListener(): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Removes an event handler
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    @JSGlobal("Ext.device.Connection.removeManagedListener")
    @js.native
    def removeManagedListener(): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Resumes firing events see suspendEvents
      * @param discardQueuedEvents Boolean Pass as true to discard any queued events.
      */
    @JSGlobal("Ext.device.Connection.resumeEvents")
    @js.native
    def resumeEvents(): Unit = js.native
    @JSGlobal("Ext.device.Connection.resumeEvents")
    @js.native
    def resumeEvents(discardQueuedEvents: Boolean): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Connection.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of bubbleEvents
      * @param bubbleEvents String/String[] The new value.
      */
    @JSGlobal("Ext.device.Connection.setBubbleEvents")
    @js.native
    def setBubbleEvents(): Unit = js.native
    @JSGlobal("Ext.device.Connection.setBubbleEvents")
    @js.native
    def setBubbleEvents(bubbleEvents: js.Any): Unit = js.native
    
    /** [Method] Sets the value of listeners
      * @param listeners Object The new value.
      */
    @JSGlobal("Ext.device.Connection.setListeners")
    @js.native
    def setListeners(): Unit = js.native
    @JSGlobal("Ext.device.Connection.setListeners")
    @js.native
    def setListeners(listeners: js.Any): Unit = js.native
    
    /** [Method] Sets the value of online
      * @param online Boolean The new value.
      */
    @JSGlobal("Ext.device.Connection.setOnline")
    @js.native
    def setOnline(): Unit = js.native
    @JSGlobal("Ext.device.Connection.setOnline")
    @js.native
    def setOnline(online: Boolean): Unit = js.native
    
    /** [Method] Sets the value of type
      * @param type Object The new value.
      */
    @JSGlobal("Ext.device.Connection.setType")
    @js.native
    def setType(): Unit = js.native
    @JSGlobal("Ext.device.Connection.setType")
    @js.native
    def setType(`type`: js.Any): Unit = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.device.Connection.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Suspends the firing of all events  */
    @JSGlobal("Ext.device.Connection.suspendEvents")
    @js.native
    def suspendEvents(): Unit = js.native
    
    /** [Method] Alias for removeListener
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Alias for removeAfterListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Connection.unAfter")
    @js.native
    def unAfter(): Unit = js.native
    @JSGlobal("Ext.device.Connection.unAfter")
    @js.native
    def unAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unAfter")
    @js.native
    def unAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unAfter")
    @js.native
    def unAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unAfter")
    @js.native
    def unAfter(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unAfter")
    @js.native
    def unAfter(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Alias for removeBeforeListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Connection.unBefore")
    @js.native
    def unBefore(): Unit = js.native
    @JSGlobal("Ext.device.Connection.unBefore")
    @js.native
    def unBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unBefore")
    @js.native
    def unBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unBefore")
    @js.native
    def unBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unBefore")
    @js.native
    def unBefore(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unBefore")
    @js.native
    def unBefore(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Connection.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Connection.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  }
  
  @JSGlobal("Ext.device.Contacts")
  @js.native
  class Contacts_ ()
    extends typings.senchaTouch.Ext.device.Contacts_
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
    @JSGlobal("Ext.device.Contacts.addAfterListener")
    @js.native
    def addAfterListener(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Appends a before event handler
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    @JSGlobal("Ext.device.Contacts.addBeforeListener")
    @js.native
    def addBeforeListener(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
      */
    @JSGlobal("Ext.device.Contacts.addEvents")
    @js.native
    def addEvents(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addEvents")
    @js.native
    def addEvents(eventNames: js.Any): Unit = js.native
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.device.Contacts.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.device.Contacts.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.device.Contacts.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Removes all listeners for this object  */
    @JSGlobal("Ext.device.Contacts.clearListeners")
    @js.native
    def clearListeners(): Unit = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.device.Contacts.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param events String/String[] The event name to bubble, or an Array of event names.
      */
    @JSGlobal("Ext.device.Contacts.enableBubble")
    @js.native
    def enableBubble(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.enableBubble")
    @js.native
    def enableBubble(events: js.Any): Unit = js.native
    
    /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
      * @param eventName String The name of the event to fire.
      * @param args Array Arguments to pass to handers.
      * @param fn Function Action.
      * @param scope Object Scope of fn.
      * @returns Object
      */
    @JSGlobal("Ext.device.Contacts.fireAction")
    @js.native
    def fireAction(): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.fireAction")
    @js.native
    def fireAction(
      eventName: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: typings.senchaTouch.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.fireAction")
    @js.native
    def fireAction(
      eventName: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: typings.senchaTouch.Ext.Array, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.fireAction")
    @js.native
    def fireAction(
      eventName: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      fn: js.Any,
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.fireAction")
    @js.native
    def fireAction(
      eventName: java.lang.String,
      args: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.fireAction")
    @js.native
    def fireAction(
      eventName: java.lang.String,
      args: typings.senchaTouch.Ext.Array,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): js.Any = js.native
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean Returns false if any of the handlers return false.
      */
    @JSGlobal("Ext.device.Contacts.fireEvent")
    @js.native
    def fireEvent(eventName: java.lang.String, args: js.Any*): Boolean = js.native
    
    /** [Method] Returns the value of bubbleEvents
      * @returns String/String[]
      */
    @JSGlobal("Ext.device.Contacts.getBubbleEvents")
    @js.native
    def getBubbleEvents(): js.Any = js.native
    
    /** [Method] Returns an Array of contact objects
      * @param config Object
      * @returns Object[] An array of contact objects.
      */
    @JSGlobal("Ext.device.Contacts.getContacts")
    @js.native
    def getContacts(): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.device.Contacts.getContacts")
    @js.native
    def getContacts(config: js.Any): typings.senchaTouch.Ext.Array = js.native
    
    /** [Method] Retrieves the id of this component
      * @returns String id
      */
    @JSGlobal("Ext.device.Contacts.getId")
    @js.native
    def getId(): java.lang.String = js.native
    
    /** [Method] Returns the value of includeImages
      * @returns Boolean
      */
    @JSGlobal("Ext.device.Contacts.getIncludeImages")
    @js.native
    def getIncludeImages(): Boolean = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.device.Contacts.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Returns the value of listeners
      * @returns Object
      */
    @JSGlobal("Ext.device.Contacts.getListeners")
    @js.native
    def getListeners(): js.Any = js.native
    
    /** [Method] Returns localized user readable label for a contact field i e
      * @param config Object
      * @returns String user readable string
      */
    @JSGlobal("Ext.device.Contacts.getLocalizedLabel")
    @js.native
    def getLocalizedLabel(): java.lang.String = js.native
    @JSGlobal("Ext.device.Contacts.getLocalizedLabel")
    @js.native
    def getLocalizedLabel(config: js.Any): java.lang.String = js.native
    
    /** [Method] Returns base64 encoded image thumbnail for a contact specified in config id This method is for Sencha Native Packager
      * @param config Object
      * @returns String base64 string
      */
    @JSGlobal("Ext.device.Contacts.getThumbnail")
    @js.native
    def getThumbnail(): java.lang.String = js.native
    @JSGlobal("Ext.device.Contacts.getThumbnail")
    @js.native
    def getThumbnail(config: js.Any): java.lang.String = js.native
    
    /** [Method] Checks to see if this object has any listeners for a specified event
      * @param eventName String The name of the event to check for
      * @returns Boolean True if the event is being listened for, else false
      */
    @JSGlobal("Ext.device.Contacts.hasListener")
    @js.native
    def hasListener(): Boolean = js.native
    @JSGlobal("Ext.device.Contacts.hasListener")
    @js.native
    def hasListener(eventName: java.lang.String): Boolean = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.device.Contacts.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Contacts.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method] Alias for addManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Alias for removeManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    @JSGlobal("Ext.device.Contacts.mun")
    @js.native
    def mun(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mun")
    @js.native
    def mun(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mun")
    @js.native
    def mun(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mun")
    @js.native
    def mun(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mun")
    @js.native
    def mun(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mun")
    @js.native
    def mun(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Alias for addListener
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Alias for addAfterListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    @JSGlobal("Ext.device.Contacts.onAfter")
    @js.native
    def onAfter(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onAfter")
    @js.native
    def onAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onAfter")
    @js.native
    def onAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onAfter")
    @js.native
    def onAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onAfter")
    @js.native
    def onAfter(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onAfter")
    @js.native
    def onAfter(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Alias for addBeforeListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    @JSGlobal("Ext.device.Contacts.onBefore")
    @js.native
    def onBefore(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onBefore")
    @js.native
    def onBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onBefore")
    @js.native
    def onBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onBefore")
    @js.native
    def onBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onBefore")
    @js.native
    def onBefore(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onBefore")
    @js.native
    def onBefore(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSGlobal("Ext.device.Contacts.relayEvents")
    @js.native
    def relayEvents(): IObservable = js.native
    @JSGlobal("Ext.device.Contacts.relayEvents")
    @js.native
    def relayEvents(`object`: js.UndefOr[scala.Nothing], events: js.Any): IObservable = js.native
    @JSGlobal("Ext.device.Contacts.relayEvents")
    @js.native
    def relayEvents(`object`: js.Any): IObservable = js.native
    @JSGlobal("Ext.device.Contacts.relayEvents")
    @js.native
    def relayEvents(`object`: js.Any, events: js.Any): IObservable = js.native
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Contacts.removeAfterListener")
    @js.native
    def removeAfterListener(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Contacts.removeBeforeListener")
    @js.native
    def removeBeforeListener(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Removes an event handler
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    @JSGlobal("Ext.device.Contacts.removeManagedListener")
    @js.native
    def removeManagedListener(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Resumes firing events see suspendEvents
      * @param discardQueuedEvents Boolean Pass as true to discard any queued events.
      */
    @JSGlobal("Ext.device.Contacts.resumeEvents")
    @js.native
    def resumeEvents(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.resumeEvents")
    @js.native
    def resumeEvents(discardQueuedEvents: Boolean): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Contacts.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of bubbleEvents
      * @param bubbleEvents String/String[] The new value.
      */
    @JSGlobal("Ext.device.Contacts.setBubbleEvents")
    @js.native
    def setBubbleEvents(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.setBubbleEvents")
    @js.native
    def setBubbleEvents(bubbleEvents: js.Any): Unit = js.native
    
    /** [Method] Sets the value of includeImages
      * @param includeImages Boolean The new value.
      */
    @JSGlobal("Ext.device.Contacts.setIncludeImages")
    @js.native
    def setIncludeImages(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.setIncludeImages")
    @js.native
    def setIncludeImages(includeImages: Boolean): Unit = js.native
    
    /** [Method] Sets the value of listeners
      * @param listeners Object The new value.
      */
    @JSGlobal("Ext.device.Contacts.setListeners")
    @js.native
    def setListeners(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.setListeners")
    @js.native
    def setListeners(listeners: js.Any): Unit = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.device.Contacts.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Suspends the firing of all events  */
    @JSGlobal("Ext.device.Contacts.suspendEvents")
    @js.native
    def suspendEvents(): Unit = js.native
    
    /** [Method] Alias for removeListener
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Alias for removeAfterListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Contacts.unAfter")
    @js.native
    def unAfter(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unAfter")
    @js.native
    def unAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unAfter")
    @js.native
    def unAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unAfter")
    @js.native
    def unAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unAfter")
    @js.native
    def unAfter(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unAfter")
    @js.native
    def unAfter(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Alias for removeBeforeListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Contacts.unBefore")
    @js.native
    def unBefore(): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unBefore")
    @js.native
    def unBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unBefore")
    @js.native
    def unBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unBefore")
    @js.native
    def unBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unBefore")
    @js.native
    def unBefore(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unBefore")
    @js.native
    def unBefore(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Contacts.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  }
  
  @JSGlobal("Ext.device.Device")
  @js.native
  class Device_ ()
    extends typings.senchaTouch.Ext.device.Device_
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
    @JSGlobal("Ext.device.Device.addAfterListener")
    @js.native
    def addAfterListener(): Unit = js.native
    @JSGlobal("Ext.device.Device.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Appends a before event handler
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    @JSGlobal("Ext.device.Device.addBeforeListener")
    @js.native
    def addBeforeListener(): Unit = js.native
    @JSGlobal("Ext.device.Device.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
      */
    @JSGlobal("Ext.device.Device.addEvents")
    @js.native
    def addEvents(): Unit = js.native
    @JSGlobal("Ext.device.Device.addEvents")
    @js.native
    def addEvents(eventNames: js.Any): Unit = js.native
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.device.Device.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.device.Device.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.device.Device.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.device.Device.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.device.Device.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.device.Device.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Removes all listeners for this object  */
    @JSGlobal("Ext.device.Device.clearListeners")
    @js.native
    def clearListeners(): Unit = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.device.Device.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param events String/String[] The event name to bubble, or an Array of event names.
      */
    @JSGlobal("Ext.device.Device.enableBubble")
    @js.native
    def enableBubble(): Unit = js.native
    @JSGlobal("Ext.device.Device.enableBubble")
    @js.native
    def enableBubble(events: js.Any): Unit = js.native
    
    /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
      * @param eventName String The name of the event to fire.
      * @param args Array Arguments to pass to handers.
      * @param fn Function Action.
      * @param scope Object Scope of fn.
      * @returns Object
      */
    @JSGlobal("Ext.device.Device.fireAction")
    @js.native
    def fireAction(): js.Any = js.native
    @JSGlobal("Ext.device.Device.fireAction")
    @js.native
    def fireAction(
      eventName: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Device.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Device.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Device.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: typings.senchaTouch.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.device.Device.fireAction")
    @js.native
    def fireAction(
      eventName: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Device.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: typings.senchaTouch.Ext.Array, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Device.fireAction")
    @js.native
    def fireAction(
      eventName: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      fn: js.Any,
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Device.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.device.Device.fireAction")
    @js.native
    def fireAction(
      eventName: java.lang.String,
      args: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Device.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Device.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Device.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.device.Device.fireAction")
    @js.native
    def fireAction(
      eventName: java.lang.String,
      args: typings.senchaTouch.Ext.Array,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Device.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Device.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): js.Any = js.native
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean Returns false if any of the handlers return false.
      */
    @JSGlobal("Ext.device.Device.fireEvent")
    @js.native
    def fireEvent(eventName: java.lang.String, args: js.Any*): Boolean = js.native
    
    /** [Method] Returns the value of bubbleEvents
      * @returns String/String[]
      */
    @JSGlobal("Ext.device.Device.getBubbleEvents")
    @js.native
    def getBubbleEvents(): js.Any = js.native
    
    /** [Method] Retrieves the id of this component
      * @returns String id
      */
    @JSGlobal("Ext.device.Device.getId")
    @js.native
    def getId(): java.lang.String = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.device.Device.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Device.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Returns the value of listeners
      * @returns Object
      */
    @JSGlobal("Ext.device.Device.getListeners")
    @js.native
    def getListeners(): js.Any = js.native
    
    /** [Method] Checks to see if this object has any listeners for a specified event
      * @param eventName String The name of the event to check for
      * @returns Boolean True if the event is being listened for, else false
      */
    @JSGlobal("Ext.device.Device.hasListener")
    @js.native
    def hasListener(): Boolean = js.native
    @JSGlobal("Ext.device.Device.hasListener")
    @js.native
    def hasListener(eventName: java.lang.String): Boolean = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.device.Device.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Device.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method] Alias for addManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Alias for removeManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    @JSGlobal("Ext.device.Device.mun")
    @js.native
    def mun(): Unit = js.native
    @JSGlobal("Ext.device.Device.mun")
    @js.native
    def mun(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mun")
    @js.native
    def mun(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mun")
    @js.native
    def mun(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mun")
    @js.native
    def mun(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mun")
    @js.native
    def mun(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Device.name")
    @js.native
    def name: java.lang.String = js.native
    @scala.inline
    def name_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    /** [Method] Alias for addListener
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Alias for addAfterListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    @JSGlobal("Ext.device.Device.onAfter")
    @js.native
    def onAfter(): Unit = js.native
    @JSGlobal("Ext.device.Device.onAfter")
    @js.native
    def onAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onAfter")
    @js.native
    def onAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onAfter")
    @js.native
    def onAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onAfter")
    @js.native
    def onAfter(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onAfter")
    @js.native
    def onAfter(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Alias for addBeforeListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    @JSGlobal("Ext.device.Device.onBefore")
    @js.native
    def onBefore(): Unit = js.native
    @JSGlobal("Ext.device.Device.onBefore")
    @js.native
    def onBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onBefore")
    @js.native
    def onBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onBefore")
    @js.native
    def onBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onBefore")
    @js.native
    def onBefore(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onBefore")
    @js.native
    def onBefore(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Opens a specified URL
      * @param url String The URL to open
      */
    @JSGlobal("Ext.device.Device.openURL")
    @js.native
    def openURL(): Unit = js.native
    @JSGlobal("Ext.device.Device.openURL")
    @js.native
    def openURL(url: java.lang.String): Unit = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Device.platform")
    @js.native
    def platform: java.lang.String = js.native
    @scala.inline
    def platform_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("platform")(x.asInstanceOf[js.Any])
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSGlobal("Ext.device.Device.relayEvents")
    @js.native
    def relayEvents(): IObservable = js.native
    @JSGlobal("Ext.device.Device.relayEvents")
    @js.native
    def relayEvents(`object`: js.UndefOr[scala.Nothing], events: js.Any): IObservable = js.native
    @JSGlobal("Ext.device.Device.relayEvents")
    @js.native
    def relayEvents(`object`: js.Any): IObservable = js.native
    @JSGlobal("Ext.device.Device.relayEvents")
    @js.native
    def relayEvents(`object`: js.Any, events: js.Any): IObservable = js.native
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Device.removeAfterListener")
    @js.native
    def removeAfterListener(): Unit = js.native
    @JSGlobal("Ext.device.Device.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Device.removeBeforeListener")
    @js.native
    def removeBeforeListener(): Unit = js.native
    @JSGlobal("Ext.device.Device.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Removes an event handler
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    @JSGlobal("Ext.device.Device.removeManagedListener")
    @js.native
    def removeManagedListener(): Unit = js.native
    @JSGlobal("Ext.device.Device.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Resumes firing events see suspendEvents
      * @param discardQueuedEvents Boolean Pass as true to discard any queued events.
      */
    @JSGlobal("Ext.device.Device.resumeEvents")
    @js.native
    def resumeEvents(): Unit = js.native
    @JSGlobal("Ext.device.Device.resumeEvents")
    @js.native
    def resumeEvents(discardQueuedEvents: Boolean): Unit = js.native
    
    /** [Property] (Object/Boolean) */
    @JSGlobal("Ext.device.Device.scheme")
    @js.native
    def scheme: js.Any = js.native
    @scala.inline
    def scheme_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheme")(x.asInstanceOf[js.Any])
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Device.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of bubbleEvents
      * @param bubbleEvents String/String[] The new value.
      */
    @JSGlobal("Ext.device.Device.setBubbleEvents")
    @js.native
    def setBubbleEvents(): Unit = js.native
    @JSGlobal("Ext.device.Device.setBubbleEvents")
    @js.native
    def setBubbleEvents(bubbleEvents: js.Any): Unit = js.native
    
    /** [Method] Sets the value of listeners
      * @param listeners Object The new value.
      */
    @JSGlobal("Ext.device.Device.setListeners")
    @js.native
    def setListeners(): Unit = js.native
    @JSGlobal("Ext.device.Device.setListeners")
    @js.native
    def setListeners(listeners: js.Any): Unit = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.device.Device.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Suspends the firing of all events  */
    @JSGlobal("Ext.device.Device.suspendEvents")
    @js.native
    def suspendEvents(): Unit = js.native
    
    /** [Method] Alias for removeListener
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Alias for removeAfterListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Device.unAfter")
    @js.native
    def unAfter(): Unit = js.native
    @JSGlobal("Ext.device.Device.unAfter")
    @js.native
    def unAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unAfter")
    @js.native
    def unAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unAfter")
    @js.native
    def unAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unAfter")
    @js.native
    def unAfter(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unAfter")
    @js.native
    def unAfter(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Alias for removeBeforeListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Device.unBefore")
    @js.native
    def unBefore(): Unit = js.native
    @JSGlobal("Ext.device.Device.unBefore")
    @js.native
    def unBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unBefore")
    @js.native
    def unBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unBefore")
    @js.native
    def unBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unBefore")
    @js.native
    def unBefore(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unBefore")
    @js.native
    def unBefore(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Device.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Device.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.device.Device.uuid")
    @js.native
    def uuid: java.lang.String = js.native
    @scala.inline
    def uuid_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uuid")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Ext.device.FileSystem")
  @js.native
  class FileSystem_ ()
    extends typings.senchaTouch.Ext.device.FileSystem_
  /* static members */
  object FileSystem_ {
    
    @JSGlobal("Ext.device.FileSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.device.FileSystem.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.device.FileSystem.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.device.FileSystem.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.device.FileSystem.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.device.FileSystem.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.device.FileSystem.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.device.FileSystem.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the value of fileSystemSize
      * @returns Number
      */
    @JSGlobal("Ext.device.FileSystem.getFileSystemSize")
    @js.native
    def getFileSystemSize(): Double = js.native
    
    /** [Method] Returns the value of fileSystemType
      * @returns Number
      */
    @JSGlobal("Ext.device.FileSystem.getFileSystemType")
    @js.native
    def getFileSystemType(): Double = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.device.FileSystem.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.device.FileSystem.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Returns the value of readerType
      * @returns String
      */
    @JSGlobal("Ext.device.FileSystem.getReaderType")
    @js.native
    def getReaderType(): java.lang.String = js.native
    
    /** [Method] Returns the value of stringEncoding
      * @returns String
      */
    @JSGlobal("Ext.device.FileSystem.getStringEncoding")
    @js.native
    def getStringEncoding(): java.lang.String = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.device.FileSystem.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.device.FileSystem.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method] Requests a Ext device filesystem FileSystem instance
      * @param config Object The object which contains the following config options:
      */
    @JSGlobal("Ext.device.FileSystem.requestFileSystem")
    @js.native
    def requestFileSystem(): Unit = js.native
    @JSGlobal("Ext.device.FileSystem.requestFileSystem")
    @js.native
    def requestFileSystem(config: js.Any): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.FileSystem.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of fileSystemSize
      * @param fileSystemSize Number The new value.
      */
    @JSGlobal("Ext.device.FileSystem.setFileSystemSize")
    @js.native
    def setFileSystemSize(): Unit = js.native
    @JSGlobal("Ext.device.FileSystem.setFileSystemSize")
    @js.native
    def setFileSystemSize(fileSystemSize: Double): Unit = js.native
    
    /** [Method] Sets the value of fileSystemType
      * @param fileSystemType Number The new value.
      */
    @JSGlobal("Ext.device.FileSystem.setFileSystemType")
    @js.native
    def setFileSystemType(): Unit = js.native
    @JSGlobal("Ext.device.FileSystem.setFileSystemType")
    @js.native
    def setFileSystemType(fileSystemType: Double): Unit = js.native
    
    /** [Method] Sets the value of readerType
      * @param readerType String The new value.
      */
    @JSGlobal("Ext.device.FileSystem.setReaderType")
    @js.native
    def setReaderType(): Unit = js.native
    @JSGlobal("Ext.device.FileSystem.setReaderType")
    @js.native
    def setReaderType(readerType: java.lang.String): Unit = js.native
    
    /** [Method] Sets the value of stringEncoding
      * @param stringEncoding String The new value.
      */
    @JSGlobal("Ext.device.FileSystem.setStringEncoding")
    @js.native
    def setStringEncoding(): Unit = js.native
    @JSGlobal("Ext.device.FileSystem.setStringEncoding")
    @js.native
    def setStringEncoding(stringEncoding: java.lang.String): Unit = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.device.FileSystem.statics")
    @js.native
    def statics(): IClass = js.native
  }
  
  @JSGlobal("Ext.device.Geolocation")
  @js.native
  class Geolocation_ ()
    extends typings.senchaTouch.Ext.device.Geolocation_
  /* static members */
  object Geolocation_ {
    
    @JSGlobal("Ext.device.Geolocation")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.device.Geolocation.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.device.Geolocation.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.device.Geolocation.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.device.Geolocation.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.device.Geolocation.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.device.Geolocation.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] If you are currently watching for the current position this will stop that task  */
    @JSGlobal("Ext.device.Geolocation.clearWatch")
    @js.native
    def clearWatch(): Unit = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.device.Geolocation.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the value of allowHighAccuracy
      * @returns Boolean
      */
    @JSGlobal("Ext.device.Geolocation.getAllowHighAccuracy")
    @js.native
    def getAllowHighAccuracy(): Boolean = js.native
    
    /** [Method] Attempts to get the current position of this device
      * @param config Object An object which contains the following config options:
      */
    @JSGlobal("Ext.device.Geolocation.getCurrentPosition")
    @js.native
    def getCurrentPosition(): Unit = js.native
    @JSGlobal("Ext.device.Geolocation.getCurrentPosition")
    @js.native
    def getCurrentPosition(config: js.Any): Unit = js.native
    
    /** [Method] Returns the value of frequency
      * @returns Number
      */
    @JSGlobal("Ext.device.Geolocation.getFrequency")
    @js.native
    def getFrequency(): Double = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.device.Geolocation.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Geolocation.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Returns the value of maximumAge
      * @returns Number
      */
    @JSGlobal("Ext.device.Geolocation.getMaximumAge")
    @js.native
    def getMaximumAge(): Double = js.native
    
    /** [Method] Returns the value of timeout
      * @returns Number
      */
    @JSGlobal("Ext.device.Geolocation.getTimeout")
    @js.native
    def getTimeout(): Double = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.device.Geolocation.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Geolocation.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Geolocation.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of allowHighAccuracy
      * @param allowHighAccuracy Boolean The new value.
      */
    @JSGlobal("Ext.device.Geolocation.setAllowHighAccuracy")
    @js.native
    def setAllowHighAccuracy(): Unit = js.native
    @JSGlobal("Ext.device.Geolocation.setAllowHighAccuracy")
    @js.native
    def setAllowHighAccuracy(allowHighAccuracy: Boolean): Unit = js.native
    
    /** [Method] Sets the value of frequency
      * @param frequency Number The new value.
      */
    @JSGlobal("Ext.device.Geolocation.setFrequency")
    @js.native
    def setFrequency(): Unit = js.native
    @JSGlobal("Ext.device.Geolocation.setFrequency")
    @js.native
    def setFrequency(frequency: Double): Unit = js.native
    
    /** [Method] Sets the value of maximumAge
      * @param maximumAge Number The new value.
      */
    @JSGlobal("Ext.device.Geolocation.setMaximumAge")
    @js.native
    def setMaximumAge(): Unit = js.native
    @JSGlobal("Ext.device.Geolocation.setMaximumAge")
    @js.native
    def setMaximumAge(maximumAge: Double): Unit = js.native
    
    /** [Method] Sets the value of timeout
      * @param timeout Number The new value.
      */
    @JSGlobal("Ext.device.Geolocation.setTimeout")
    @js.native
    def setTimeout(): Unit = js.native
    @JSGlobal("Ext.device.Geolocation.setTimeout")
    @js.native
    def setTimeout(timeout: Double): Unit = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.device.Geolocation.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Watches for the current position and calls the callback when successful depending on the specified frequency
      * @param config Object An object which contains the following config options:
      */
    @JSGlobal("Ext.device.Geolocation.watchPosition")
    @js.native
    def watchPosition(): Unit = js.native
    @JSGlobal("Ext.device.Geolocation.watchPosition")
    @js.native
    def watchPosition(config: js.Any): Unit = js.native
  }
  
  @JSGlobal("Ext.device.Globalization")
  @js.native
  class Globalization_ ()
    extends typings.senchaTouch.Ext.device.Globalization_
  /* static members */
  object Globalization_ {
    
    @JSGlobal("Ext.device.Globalization")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.device.Globalization.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.device.Globalization.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.device.Globalization.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.device.Globalization.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.device.Globalization.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.device.Globalization.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.device.Globalization.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.device.Globalization.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Globalization.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.device.Globalization.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Globalization.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Globalization.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.device.Globalization.statics")
    @js.native
    def statics(): IClass = js.native
  }
  
  @JSGlobal("Ext.device.Media")
  @js.native
  class Media_ ()
    extends typings.senchaTouch.Ext.device.Media_
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
    @JSGlobal("Ext.device.Media.addAfterListener")
    @js.native
    def addAfterListener(): Unit = js.native
    @JSGlobal("Ext.device.Media.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Appends a before event handler
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    @JSGlobal("Ext.device.Media.addBeforeListener")
    @js.native
    def addBeforeListener(): Unit = js.native
    @JSGlobal("Ext.device.Media.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
      */
    @JSGlobal("Ext.device.Media.addEvents")
    @js.native
    def addEvents(): Unit = js.native
    @JSGlobal("Ext.device.Media.addEvents")
    @js.native
    def addEvents(eventNames: js.Any): Unit = js.native
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.device.Media.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.device.Media.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.device.Media.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.device.Media.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.device.Media.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.device.Media.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Removes all listeners for this object  */
    @JSGlobal("Ext.device.Media.clearListeners")
    @js.native
    def clearListeners(): Unit = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.device.Media.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param events String/String[] The event name to bubble, or an Array of event names.
      */
    @JSGlobal("Ext.device.Media.enableBubble")
    @js.native
    def enableBubble(): Unit = js.native
    @JSGlobal("Ext.device.Media.enableBubble")
    @js.native
    def enableBubble(events: js.Any): Unit = js.native
    
    /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
      * @param eventName String The name of the event to fire.
      * @param args Array Arguments to pass to handers.
      * @param fn Function Action.
      * @param scope Object Scope of fn.
      * @returns Object
      */
    @JSGlobal("Ext.device.Media.fireAction")
    @js.native
    def fireAction(): js.Any = js.native
    @JSGlobal("Ext.device.Media.fireAction")
    @js.native
    def fireAction(
      eventName: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Media.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Media.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Media.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: typings.senchaTouch.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.device.Media.fireAction")
    @js.native
    def fireAction(
      eventName: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Media.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: typings.senchaTouch.Ext.Array, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Media.fireAction")
    @js.native
    def fireAction(
      eventName: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      fn: js.Any,
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Media.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.device.Media.fireAction")
    @js.native
    def fireAction(
      eventName: java.lang.String,
      args: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Media.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Media.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Media.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.device.Media.fireAction")
    @js.native
    def fireAction(
      eventName: java.lang.String,
      args: typings.senchaTouch.Ext.Array,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Media.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Media.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): js.Any = js.native
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean Returns false if any of the handlers return false.
      */
    @JSGlobal("Ext.device.Media.fireEvent")
    @js.native
    def fireEvent(eventName: java.lang.String, args: js.Any*): Boolean = js.native
    
    /** [Method] Returns the value of bubbleEvents
      * @returns String/String[]
      */
    @JSGlobal("Ext.device.Media.getBubbleEvents")
    @js.native
    def getBubbleEvents(): js.Any = js.native
    
    /** [Method] Retrieves the id of this component
      * @returns String id
      */
    @JSGlobal("Ext.device.Media.getId")
    @js.native
    def getId(): java.lang.String = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.device.Media.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Media.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Returns the value of listeners
      * @returns Object
      */
    @JSGlobal("Ext.device.Media.getListeners")
    @js.native
    def getListeners(): js.Any = js.native
    
    /** [Method] Returns the value of src
      * @returns Object
      */
    @JSGlobal("Ext.device.Media.getSrc")
    @js.native
    def getSrc(): js.Any = js.native
    
    /** [Method] Checks to see if this object has any listeners for a specified event
      * @param eventName String The name of the event to check for
      * @returns Boolean True if the event is being listened for, else false
      */
    @JSGlobal("Ext.device.Media.hasListener")
    @js.native
    def hasListener(): Boolean = js.native
    @JSGlobal("Ext.device.Media.hasListener")
    @js.native
    def hasListener(eventName: java.lang.String): Boolean = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.device.Media.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Media.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method] Alias for addManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Alias for removeManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    @JSGlobal("Ext.device.Media.mun")
    @js.native
    def mun(): Unit = js.native
    @JSGlobal("Ext.device.Media.mun")
    @js.native
    def mun(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mun")
    @js.native
    def mun(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mun")
    @js.native
    def mun(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mun")
    @js.native
    def mun(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mun")
    @js.native
    def mun(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Alias for addListener
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Alias for addAfterListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    @JSGlobal("Ext.device.Media.onAfter")
    @js.native
    def onAfter(): Unit = js.native
    @JSGlobal("Ext.device.Media.onAfter")
    @js.native
    def onAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onAfter")
    @js.native
    def onAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onAfter")
    @js.native
    def onAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onAfter")
    @js.native
    def onAfter(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onAfter")
    @js.native
    def onAfter(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Alias for addBeforeListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    @JSGlobal("Ext.device.Media.onBefore")
    @js.native
    def onBefore(): Unit = js.native
    @JSGlobal("Ext.device.Media.onBefore")
    @js.native
    def onBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onBefore")
    @js.native
    def onBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onBefore")
    @js.native
    def onBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onBefore")
    @js.native
    def onBefore(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onBefore")
    @js.native
    def onBefore(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSGlobal("Ext.device.Media.relayEvents")
    @js.native
    def relayEvents(): IObservable = js.native
    @JSGlobal("Ext.device.Media.relayEvents")
    @js.native
    def relayEvents(`object`: js.UndefOr[scala.Nothing], events: js.Any): IObservable = js.native
    @JSGlobal("Ext.device.Media.relayEvents")
    @js.native
    def relayEvents(`object`: js.Any): IObservable = js.native
    @JSGlobal("Ext.device.Media.relayEvents")
    @js.native
    def relayEvents(`object`: js.Any, events: js.Any): IObservable = js.native
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Media.removeAfterListener")
    @js.native
    def removeAfterListener(): Unit = js.native
    @JSGlobal("Ext.device.Media.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Media.removeBeforeListener")
    @js.native
    def removeBeforeListener(): Unit = js.native
    @JSGlobal("Ext.device.Media.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Removes an event handler
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    @JSGlobal("Ext.device.Media.removeManagedListener")
    @js.native
    def removeManagedListener(): Unit = js.native
    @JSGlobal("Ext.device.Media.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Resumes firing events see suspendEvents
      * @param discardQueuedEvents Boolean Pass as true to discard any queued events.
      */
    @JSGlobal("Ext.device.Media.resumeEvents")
    @js.native
    def resumeEvents(): Unit = js.native
    @JSGlobal("Ext.device.Media.resumeEvents")
    @js.native
    def resumeEvents(discardQueuedEvents: Boolean): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Media.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of bubbleEvents
      * @param bubbleEvents String/String[] The new value.
      */
    @JSGlobal("Ext.device.Media.setBubbleEvents")
    @js.native
    def setBubbleEvents(): Unit = js.native
    @JSGlobal("Ext.device.Media.setBubbleEvents")
    @js.native
    def setBubbleEvents(bubbleEvents: js.Any): Unit = js.native
    
    /** [Method] Sets the value of listeners
      * @param listeners Object The new value.
      */
    @JSGlobal("Ext.device.Media.setListeners")
    @js.native
    def setListeners(): Unit = js.native
    @JSGlobal("Ext.device.Media.setListeners")
    @js.native
    def setListeners(listeners: js.Any): Unit = js.native
    
    /** [Method] Sets the value of src
      * @param src Object The new value.
      */
    @JSGlobal("Ext.device.Media.setSrc")
    @js.native
    def setSrc(): Unit = js.native
    @JSGlobal("Ext.device.Media.setSrc")
    @js.native
    def setSrc(src: js.Any): Unit = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.device.Media.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Suspends the firing of all events  */
    @JSGlobal("Ext.device.Media.suspendEvents")
    @js.native
    def suspendEvents(): Unit = js.native
    
    /** [Method] Alias for removeListener
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Alias for removeAfterListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Media.unAfter")
    @js.native
    def unAfter(): Unit = js.native
    @JSGlobal("Ext.device.Media.unAfter")
    @js.native
    def unAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unAfter")
    @js.native
    def unAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unAfter")
    @js.native
    def unAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unAfter")
    @js.native
    def unAfter(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unAfter")
    @js.native
    def unAfter(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Alias for removeBeforeListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Media.unBefore")
    @js.native
    def unBefore(): Unit = js.native
    @JSGlobal("Ext.device.Media.unBefore")
    @js.native
    def unBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unBefore")
    @js.native
    def unBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unBefore")
    @js.native
    def unBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unBefore")
    @js.native
    def unBefore(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unBefore")
    @js.native
    def unBefore(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Media.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Media.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  }
  
  @JSGlobal("Ext.device.Notification")
  @js.native
  class Notification_ ()
    extends typings.senchaTouch.Ext.device.Notification_
  /* static members */
  object Notification_ {
    
    @JSGlobal("Ext.device.Notification")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.device.Notification.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.device.Notification.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.device.Notification.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.device.Notification.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.device.Notification.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.device.Notification.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.device.Notification.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.device.Notification.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Notification.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.device.Notification.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Notification.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Notification.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] A simple way to show a notification
      * @param config Object An object which contains the following config options:
      */
    @JSGlobal("Ext.device.Notification.show")
    @js.native
    def show(): Unit = js.native
    @JSGlobal("Ext.device.Notification.show")
    @js.native
    def show(config: js.Any): Unit = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.device.Notification.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Vibrates the device  */
    @JSGlobal("Ext.device.Notification.vibrate")
    @js.native
    def vibrate(): Unit = js.native
  }
  
  @JSGlobal("Ext.device.Orientation")
  @js.native
  class Orientation_ ()
    extends typings.senchaTouch.Ext.device.Orientation_
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
    @JSGlobal("Ext.device.Orientation.addAfterListener")
    @js.native
    def addAfterListener(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addAfterListener")
    @js.native
    def addAfterListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addAfterListener")
    @js.native
    def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Appends a before event handler
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    @JSGlobal("Ext.device.Orientation.addBeforeListener")
    @js.native
    def addBeforeListener(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addBeforeListener")
    @js.native
    def addBeforeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addBeforeListener")
    @js.native
    def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
      */
    @JSGlobal("Ext.device.Orientation.addEvents")
    @js.native
    def addEvents(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addEvents")
    @js.native
    def addEvents(eventNames: js.Any): Unit = js.native
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addListener")
    @js.native
    def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(
      `object`: js.Any,
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.addManagedListener")
    @js.native
    def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.device.Orientation.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.device.Orientation.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.device.Orientation.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Removes all listeners for this object  */
    @JSGlobal("Ext.device.Orientation.clearListeners")
    @js.native
    def clearListeners(): Unit = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.device.Orientation.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param events String/String[] The event name to bubble, or an Array of event names.
      */
    @JSGlobal("Ext.device.Orientation.enableBubble")
    @js.native
    def enableBubble(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.enableBubble")
    @js.native
    def enableBubble(events: js.Any): Unit = js.native
    
    /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
      * @param eventName String The name of the event to fire.
      * @param args Array Arguments to pass to handers.
      * @param fn Function Action.
      * @param scope Object Scope of fn.
      * @returns Object
      */
    @JSGlobal("Ext.device.Orientation.fireAction")
    @js.native
    def fireAction(): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.fireAction")
    @js.native
    def fireAction(
      eventName: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: typings.senchaTouch.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.fireAction")
    @js.native
    def fireAction(
      eventName: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.fireAction")
    @js.native
    def fireAction(eventName: js.UndefOr[scala.Nothing], args: typings.senchaTouch.Ext.Array, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.fireAction")
    @js.native
    def fireAction(
      eventName: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      fn: js.Any,
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.fireAction")
    @js.native
    def fireAction(
      eventName: java.lang.String,
      args: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.fireAction")
    @js.native
    def fireAction(
      eventName: java.lang.String,
      args: typings.senchaTouch.Ext.Array,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: js.Any): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.fireAction")
    @js.native
    def fireAction(eventName: java.lang.String, args: typings.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): js.Any = js.native
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean Returns false if any of the handlers return false.
      */
    @JSGlobal("Ext.device.Orientation.fireEvent")
    @js.native
    def fireEvent(eventName: java.lang.String, args: js.Any*): Boolean = js.native
    
    /** [Method] Returns the value of bubbleEvents
      * @returns String/String[]
      */
    @JSGlobal("Ext.device.Orientation.getBubbleEvents")
    @js.native
    def getBubbleEvents(): js.Any = js.native
    
    /** [Method] Retrieves the id of this component
      * @returns String id
      */
    @JSGlobal("Ext.device.Orientation.getId")
    @js.native
    def getId(): java.lang.String = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.device.Orientation.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Returns the value of listeners
      * @returns Object
      */
    @JSGlobal("Ext.device.Orientation.getListeners")
    @js.native
    def getListeners(): js.Any = js.native
    
    /** [Method] Checks to see if this object has any listeners for a specified event
      * @param eventName String The name of the event to check for
      * @returns Boolean True if the event is being listened for, else false
      */
    @JSGlobal("Ext.device.Orientation.hasListener")
    @js.native
    def hasListener(): Boolean = js.native
    @JSGlobal("Ext.device.Orientation.hasListener")
    @js.native
    def hasListener(eventName: java.lang.String): Boolean = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.device.Orientation.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Orientation.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method] Alias for addManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      * @param options Object If the eventName parameter was an event name, this is the addListener options.
      */
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(
      `object`: js.Any,
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mon")
    @js.native
    def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Alias for removeManagedListener
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    @JSGlobal("Ext.device.Orientation.mun")
    @js.native
    def mun(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mun")
    @js.native
    def mun(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mun")
    @js.native
    def mun(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mun")
    @js.native
    def mun(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mun")
    @js.native
    def mun(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mun")
    @js.native
    def mun(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mun")
    @js.native
    def mun(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.mun")
    @js.native
    def mun(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Alias for addListener
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.on")
    @js.native
    def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Alias for addAfterListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    @JSGlobal("Ext.device.Orientation.onAfter")
    @js.native
    def onAfter(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onAfter")
    @js.native
    def onAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onAfter")
    @js.native
    def onAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onAfter")
    @js.native
    def onAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onAfter")
    @js.native
    def onAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onAfter")
    @js.native
    def onAfter(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onAfter")
    @js.native
    def onAfter(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onAfter")
    @js.native
    def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Alias for addBeforeListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    @JSGlobal("Ext.device.Orientation.onBefore")
    @js.native
    def onBefore(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onBefore")
    @js.native
    def onBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onBefore")
    @js.native
    def onBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onBefore")
    @js.native
    def onBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onBefore")
    @js.native
    def onBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onBefore")
    @js.native
    def onBefore(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onBefore")
    @js.native
    def onBefore(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.onBefore")
    @js.native
    def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSGlobal("Ext.device.Orientation.relayEvents")
    @js.native
    def relayEvents(): IObservable = js.native
    @JSGlobal("Ext.device.Orientation.relayEvents")
    @js.native
    def relayEvents(`object`: js.UndefOr[scala.Nothing], events: js.Any): IObservable = js.native
    @JSGlobal("Ext.device.Orientation.relayEvents")
    @js.native
    def relayEvents(`object`: js.Any): IObservable = js.native
    @JSGlobal("Ext.device.Orientation.relayEvents")
    @js.native
    def relayEvents(`object`: js.Any, events: js.Any): IObservable = js.native
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Orientation.removeAfterListener")
    @js.native
    def removeAfterListener(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeAfterListener")
    @js.native
    def removeAfterListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeAfterListener")
    @js.native
    def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Orientation.removeBeforeListener")
    @js.native
    def removeBeforeListener(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeBeforeListener")
    @js.native
    def removeBeforeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeBeforeListener")
    @js.native
    def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Removes an event handler
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeListener")
    @js.native
    def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
      * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
      * @param eventName Object/String The event name, or an object containing event name properties.
      * @param fn Function If the eventName parameter was an event name, this is the handler function.
      * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
      */
    @JSGlobal("Ext.device.Orientation.removeManagedListener")
    @js.native
    def removeManagedListener(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.UndefOr[scala.Nothing],
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.UndefOr[scala.Nothing], eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeManagedListener")
    @js.native
    def removeManagedListener(
      `object`: js.Any,
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.removeManagedListener")
    @js.native
    def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    
    /** [Method] Resumes firing events see suspendEvents
      * @param discardQueuedEvents Boolean Pass as true to discard any queued events.
      */
    @JSGlobal("Ext.device.Orientation.resumeEvents")
    @js.native
    def resumeEvents(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.resumeEvents")
    @js.native
    def resumeEvents(discardQueuedEvents: Boolean): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Orientation.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Sets the value of bubbleEvents
      * @param bubbleEvents String/String[] The new value.
      */
    @JSGlobal("Ext.device.Orientation.setBubbleEvents")
    @js.native
    def setBubbleEvents(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.setBubbleEvents")
    @js.native
    def setBubbleEvents(bubbleEvents: js.Any): Unit = js.native
    
    /** [Method] Sets the value of listeners
      * @param listeners Object The new value.
      */
    @JSGlobal("Ext.device.Orientation.setListeners")
    @js.native
    def setListeners(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.setListeners")
    @js.native
    def setListeners(listeners: js.Any): Unit = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.device.Orientation.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Suspends the firing of all events  */
    @JSGlobal("Ext.device.Orientation.suspendEvents")
    @js.native
    def suspendEvents(): Unit = js.native
    
    /** [Method] Alias for removeListener
      * @param eventName String/String[]/Object The type of event the handler was associated with.
      * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
      * @param options Object Extra options object. See addListener for details.
      * @param order String The order of the listener to remove. Possible values are before, current and after.
      */
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any,
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(
      eventName: js.Any,
      fn: js.Any,
      scope: js.Any,
      options: js.UndefOr[scala.Nothing],
      order: java.lang.String
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.un")
    @js.native
    def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
    
    /** [Method] Alias for removeAfterListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Orientation.unAfter")
    @js.native
    def unAfter(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unAfter")
    @js.native
    def unAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unAfter")
    @js.native
    def unAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unAfter")
    @js.native
    def unAfter(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unAfter")
    @js.native
    def unAfter(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unAfter")
    @js.native
    def unAfter(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unAfter")
    @js.native
    def unAfter(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unAfter")
    @js.native
    def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    
    /** [Method] Alias for removeBeforeListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    @JSGlobal("Ext.device.Orientation.unBefore")
    @js.native
    def unBefore(): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unBefore")
    @js.native
    def unBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unBefore")
    @js.native
    def unBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unBefore")
    @js.native
    def unBefore(
      eventName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unBefore")
    @js.native
    def unBefore(eventName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unBefore")
    @js.native
    def unBefore(eventName: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unBefore")
    @js.native
    def unBefore(
      eventName: js.Any,
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
    @JSGlobal("Ext.device.Orientation.unBefore")
    @js.native
    def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  }
  
  @JSGlobal("Ext.device.Purchases")
  @js.native
  class Purchases_ ()
    extends typings.senchaTouch.Ext.device.Purchases_
  /* static members */
  object Purchases_ {
    
    @JSGlobal("Ext.device.Purchases")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.device.Purchases.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.device.Purchases.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.device.Purchases.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.device.Purchases.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.device.Purchases.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.device.Purchases.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Checks if the current user is able to make payments
      * @param config Object
      */
    @JSGlobal("Ext.device.Purchases.canMakePayments")
    @js.native
    def canMakePayments(): Unit = js.native
    @JSGlobal("Ext.device.Purchases.canMakePayments")
    @js.native
    def canMakePayments(config: js.Any): Unit = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.device.Purchases.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns a Ext data Store instance of all purchases delivered to the current user
      * @param config Object
      */
    @JSGlobal("Ext.device.Purchases.getCompletedPurchases")
    @js.native
    def getCompletedPurchases(): Unit = js.native
    @JSGlobal("Ext.device.Purchases.getCompletedPurchases")
    @js.native
    def getCompletedPurchases(config: js.Any): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.device.Purchases.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Purchases.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Returns a Ext data Store instance of all products available to purchase
      * @param config Object
      */
    @JSGlobal("Ext.device.Purchases.getProducts")
    @js.native
    def getProducts(): Unit = js.native
    @JSGlobal("Ext.device.Purchases.getProducts")
    @js.native
    def getProducts(config: js.Any): Unit = js.native
    
    /** [Method] Returns a Ext data Store instance of all purchases the current user has been charged
      * @param config Object
      */
    @JSGlobal("Ext.device.Purchases.getPurchases")
    @js.native
    def getPurchases(): Unit = js.native
    @JSGlobal("Ext.device.Purchases.getPurchases")
    @js.native
    def getPurchases(config: js.Any): Unit = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.device.Purchases.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Purchases.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Purchases.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.device.Purchases.statics")
    @js.native
    def statics(): IClass = js.native
  }
  
  @JSGlobal("Ext.device.Push")
  @js.native
  class Push_ ()
    extends typings.senchaTouch.Ext.device.Push_
  /* static members */
  object Push_ {
    
    @JSGlobal("Ext.device.Push")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Property] (Number) */
    @JSGlobal("Ext.device.Push.ALERT")
    @js.native
    def ALERT: Double = js.native
    @scala.inline
    def ALERT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALERT")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.device.Push.BADGE")
    @js.native
    def BADGE: Double = js.native
    @scala.inline
    def BADGE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BADGE")(x.asInstanceOf[js.Any])
    
    /** [Property] (Number) */
    @JSGlobal("Ext.device.Push.SOUND")
    @js.native
    def SOUND: Double = js.native
    @scala.inline
    def SOUND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SOUND")(x.asInstanceOf[js.Any])
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.device.Push.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.device.Push.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.device.Push.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.device.Push.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.device.Push.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.device.Push.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.device.Push.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.device.Push.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Push.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.device.Push.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Push.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method] Registers a push notification
      * @param config Object The configuration for to pass when registering this push notification service.
      */
    @JSGlobal("Ext.device.Push.register")
    @js.native
    def register(): Unit = js.native
    @JSGlobal("Ext.device.Push.register")
    @js.native
    def register(config: js.Any): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Push.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.device.Push.statics")
    @js.native
    def statics(): IClass = js.native
  }
  
  @JSGlobal("Ext.device.SQLite")
  @js.native
  class SQLite_ ()
    extends typings.senchaTouch.Ext.device.SQLite_
  /* static members */
  object SQLite_ {
    
    @JSGlobal("Ext.device.SQLite")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.device.SQLite.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.device.SQLite.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.device.SQLite.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.device.SQLite.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.device.SQLite.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.device.SQLite.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.device.SQLite.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.device.SQLite.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.device.SQLite.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.device.SQLite.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.device.SQLite.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method] Returns a Ext device sqlite Database instance
      * @param config Object The object which contains the following config options:
      * @returns Ext.device.sqlite.Database The opened database, null if an error occured.
      */
    @JSGlobal("Ext.device.SQLite.openDatabase")
    @js.native
    def openDatabase(): IDatabase = js.native
    @JSGlobal("Ext.device.SQLite.openDatabase")
    @js.native
    def openDatabase(config: js.Any): IDatabase = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.SQLite.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.device.SQLite.statics")
    @js.native
    def statics(): IClass = js.native
  }
  
  @JSGlobal("Ext.device.Splashscreen")
  @js.native
  class Splashscreen_ ()
    extends typings.senchaTouch.Ext.device.Splashscreen_
  /* static members */
  object Splashscreen_ {
    
    @JSGlobal("Ext.device.Splashscreen")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.device.Splashscreen.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.device.Splashscreen.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.device.Splashscreen.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.device.Splashscreen.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.device.Splashscreen.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.device.Splashscreen.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.device.Splashscreen.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.device.Splashscreen.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Splashscreen.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.device.Splashscreen.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.device.Splashscreen.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.device.Splashscreen.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.device.Splashscreen.statics")
    @js.native
    def statics(): IClass = js.native
  }
}
