package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.draw.IColor
import typings.senchaTouch.Ext.draw.IMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draw {
  
  @JSGlobal("Ext.draw.Animator")
  @js.native
  class Animator ()
    extends typings.senchaTouch.Ext.draw.Animator
  /* static members */
  object Animator {
    
    @JSGlobal("Ext.draw.Animator")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Adds an animated object to the animation pool
      * @param animation Object The animation descriptor to add to the pool.
      */
    @JSGlobal("Ext.draw.Animator.add")
    @js.native
    def add(): Unit = js.native
    @JSGlobal("Ext.draw.Animator.add")
    @js.native
    def add(animation: js.Any): Unit = js.native
    
    /** [Method] Register a recursive callback that will be called at every frame
      * @param callback Function
      * @param scope Object
      * @returns String
      */
    @JSGlobal("Ext.draw.Animator.addFrameCallback")
    @js.native
    def addFrameCallback(): java.lang.String = js.native
    @JSGlobal("Ext.draw.Animator.addFrameCallback")
    @js.native
    def addFrameCallback(callback: js.UndefOr[scala.Nothing], scope: js.Any): java.lang.String = js.native
    @JSGlobal("Ext.draw.Animator.addFrameCallback")
    @js.native
    def addFrameCallback(callback: js.Any): java.lang.String = js.native
    @JSGlobal("Ext.draw.Animator.addFrameCallback")
    @js.native
    def addFrameCallback(callback: js.Any, scope: js.Any): java.lang.String = js.native
    
    /** [Method] Cross platform animationTime implementation
      * @returns Number
      */
    @JSGlobal("Ext.draw.Animator.animationTime")
    @js.native
    def animationTime(): Double = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.draw.Animator.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.draw.Animator.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.draw.Animator.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.draw.Animator.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.draw.Animator.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.draw.Animator.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Cancel a registered one time callback
      * @param id String
      */
    @JSGlobal("Ext.draw.Animator.cancel")
    @js.native
    def cancel(): Unit = js.native
    @JSGlobal("Ext.draw.Animator.cancel")
    @js.native
    def cancel(id: java.lang.String): Unit = js.native
    
    /** [Method] Returns true or false whether it contains the given animation or not
      * @param animation Object The animation to check for.
      * @returns Boolean
      */
    @JSGlobal("Ext.draw.Animator.contains")
    @js.native
    def contains(): Boolean = js.native
    @JSGlobal("Ext.draw.Animator.contains")
    @js.native
    def contains(animation: js.Any): Boolean = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.draw.Animator.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns true or false whether the pool is empty or not
      * @returns Boolean
      */
    @JSGlobal("Ext.draw.Animator.empty")
    @js.native
    def empty(): Boolean = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.draw.Animator.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.draw.Animator.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.draw.Animator.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.draw.Animator.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method] Removes an animation from the pool
      * @param animation Object The animation to remove from the pool.
      */
    @JSGlobal("Ext.draw.Animator.remove")
    @js.native
    def remove(): Unit = js.native
    @JSGlobal("Ext.draw.Animator.remove")
    @js.native
    def remove(animation: js.Any): Unit = js.native
    
    /** [Method] Unregister a recursive callback
      * @param id String
      */
    @JSGlobal("Ext.draw.Animator.removeFrameCallback")
    @js.native
    def removeFrameCallback(): Unit = js.native
    @JSGlobal("Ext.draw.Animator.removeFrameCallback")
    @js.native
    def removeFrameCallback(id: java.lang.String): Unit = js.native
    
    /** [Method] Register an one time callback that will be called at the next frame
      * @param callback Function
      * @param scope Object
      * @returns String
      */
    @JSGlobal("Ext.draw.Animator.schedule")
    @js.native
    def schedule(): java.lang.String = js.native
    @JSGlobal("Ext.draw.Animator.schedule")
    @js.native
    def schedule(callback: js.UndefOr[scala.Nothing], scope: js.Any): java.lang.String = js.native
    @JSGlobal("Ext.draw.Animator.schedule")
    @js.native
    def schedule(callback: js.Any): java.lang.String = js.native
    @JSGlobal("Ext.draw.Animator.schedule")
    @js.native
    def schedule(callback: js.Any, scope: js.Any): java.lang.String = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.draw.Animator.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.draw.Animator.statics")
    @js.native
    def statics(): IClass = js.native
    
    /** [Method] Given a frame time it will filter out finished animations from the pool
      * @param frameTime Number The frame's start time, in milliseconds.
      */
    @JSGlobal("Ext.draw.Animator.step")
    @js.native
    def step(): Unit = js.native
    @JSGlobal("Ext.draw.Animator.step")
    @js.native
    def step(frameTime: Double): Unit = js.native
  }
  
  @JSGlobal("Ext.draw.Color")
  @js.native
  class Color ()
    extends typings.senchaTouch.Ext.draw.Color
  /* static members */
  object Color {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.draw.Color.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.draw.Color.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.draw.Color.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.draw.Color.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method]
      * @param args Object
      */
    @JSGlobal("Ext.draw.Color.callParent")
    @js.native
    def callParent(): Unit = js.native
    @JSGlobal("Ext.draw.Color.callParent")
    @js.native
    def callParent(args: js.Any): Unit = js.native
    
    /** [Method] Convenience method for creating a color
      * @param red Ext.draw.Color/String/Number[]/Number Red component (0..255), CSS color string or array of all components.
      * @param green Number Green component (0..255)
      * @param blue Number Blue component (0..255)
      * @param alpha Number Alpha component (0..1)
      * @returns Ext.draw.Color
      */
    @JSGlobal("Ext.draw.Color.create")
    @js.native
    def create(): IColor = js.native
    @JSGlobal("Ext.draw.Color.create")
    @js.native
    def create(
      red: js.UndefOr[scala.Nothing],
      green: js.UndefOr[scala.Nothing],
      blue: js.UndefOr[scala.Nothing],
      alpha: Double
    ): IColor = js.native
    @JSGlobal("Ext.draw.Color.create")
    @js.native
    def create(red: js.UndefOr[scala.Nothing], green: js.UndefOr[scala.Nothing], blue: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.create")
    @js.native
    def create(red: js.UndefOr[scala.Nothing], green: js.UndefOr[scala.Nothing], blue: Double, alpha: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.create")
    @js.native
    def create(red: js.UndefOr[scala.Nothing], green: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.create")
    @js.native
    def create(red: js.UndefOr[scala.Nothing], green: Double, blue: js.UndefOr[scala.Nothing], alpha: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.create")
    @js.native
    def create(red: js.UndefOr[scala.Nothing], green: Double, blue: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.create")
    @js.native
    def create(red: js.UndefOr[scala.Nothing], green: Double, blue: Double, alpha: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.create")
    @js.native
    def create(red: js.Any): IColor = js.native
    @JSGlobal("Ext.draw.Color.create")
    @js.native
    def create(red: js.Any, green: js.UndefOr[scala.Nothing], blue: js.UndefOr[scala.Nothing], alpha: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.create")
    @js.native
    def create(red: js.Any, green: js.UndefOr[scala.Nothing], blue: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.create")
    @js.native
    def create(red: js.Any, green: js.UndefOr[scala.Nothing], blue: Double, alpha: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.create")
    @js.native
    def create(red: js.Any, green: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.create")
    @js.native
    def create(red: js.Any, green: Double, blue: js.UndefOr[scala.Nothing], alpha: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.create")
    @js.native
    def create(red: js.Any, green: Double, blue: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.create")
    @js.native
    def create(red: js.Any, green: Double, blue: Double, alpha: Double): IColor = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.draw.Color.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.draw.Color.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.draw.Color.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.draw.Color.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] Returns a flyweight instance of Ext draw Color
      * @param red Number/String Red component (0..255) or CSS color string.
      * @param green Number Green component (0..255)
      * @param blue Number Blue component (0..255)
      * @param alpha Number Alpha component (0..1)
      * @returns Ext.draw.Color
      */
    @JSGlobal("Ext.draw.Color.fly")
    @js.native
    def fly(): IColor = js.native
    @JSGlobal("Ext.draw.Color.fly")
    @js.native
    def fly(
      red: js.UndefOr[scala.Nothing],
      green: js.UndefOr[scala.Nothing],
      blue: js.UndefOr[scala.Nothing],
      alpha: Double
    ): IColor = js.native
    @JSGlobal("Ext.draw.Color.fly")
    @js.native
    def fly(red: js.UndefOr[scala.Nothing], green: js.UndefOr[scala.Nothing], blue: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.fly")
    @js.native
    def fly(red: js.UndefOr[scala.Nothing], green: js.UndefOr[scala.Nothing], blue: Double, alpha: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.fly")
    @js.native
    def fly(red: js.UndefOr[scala.Nothing], green: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.fly")
    @js.native
    def fly(red: js.UndefOr[scala.Nothing], green: Double, blue: js.UndefOr[scala.Nothing], alpha: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.fly")
    @js.native
    def fly(red: js.UndefOr[scala.Nothing], green: Double, blue: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.fly")
    @js.native
    def fly(red: js.UndefOr[scala.Nothing], green: Double, blue: Double, alpha: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.fly")
    @js.native
    def fly(red: js.Any): IColor = js.native
    @JSGlobal("Ext.draw.Color.fly")
    @js.native
    def fly(red: js.Any, green: js.UndefOr[scala.Nothing], blue: js.UndefOr[scala.Nothing], alpha: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.fly")
    @js.native
    def fly(red: js.Any, green: js.UndefOr[scala.Nothing], blue: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.fly")
    @js.native
    def fly(red: js.Any, green: js.UndefOr[scala.Nothing], blue: Double, alpha: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.fly")
    @js.native
    def fly(red: js.Any, green: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.fly")
    @js.native
    def fly(red: js.Any, green: Double, blue: js.UndefOr[scala.Nothing], alpha: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.fly")
    @js.native
    def fly(red: js.Any, green: Double, blue: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.fly")
    @js.native
    def fly(red: js.Any, green: Double, blue: Double, alpha: Double): IColor = js.native
    
    /** [Method] Create a new color based on the specified HSL values
      * @param h Number Hue component (0..359)
      * @param s Number Saturation component (0..1)
      * @param l Number Lightness component (0..1)
      * @returns Ext.draw.Color
      */
    @JSGlobal("Ext.draw.Color.fromHSL")
    @js.native
    def fromHSL(): IColor = js.native
    @JSGlobal("Ext.draw.Color.fromHSL")
    @js.native
    def fromHSL(h: js.UndefOr[scala.Nothing], s: js.UndefOr[scala.Nothing], l: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.fromHSL")
    @js.native
    def fromHSL(h: js.UndefOr[scala.Nothing], s: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.fromHSL")
    @js.native
    def fromHSL(h: js.UndefOr[scala.Nothing], s: Double, l: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.fromHSL")
    @js.native
    def fromHSL(h: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.fromHSL")
    @js.native
    def fromHSL(h: Double, s: js.UndefOr[scala.Nothing], l: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.fromHSL")
    @js.native
    def fromHSL(h: Double, s: Double): IColor = js.native
    @JSGlobal("Ext.draw.Color.fromHSL")
    @js.native
    def fromHSL(h: Double, s: Double, l: Double): IColor = js.native
    
    /** [Method] Parse the string and create a new color
      * @param string String Color in string.
      * @returns Ext.draw.Color
      */
    @JSGlobal("Ext.draw.Color.fromString")
    @js.native
    def fromString(): IColor = js.native
    @JSGlobal("Ext.draw.Color.fromString")
    @js.native
    def fromString(string: java.lang.String): IColor = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.draw.Color.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.draw.Color.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.draw.Color.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  @JSGlobal("Ext.draw.Draw")
  @js.native
  class Draw ()
    extends typings.senchaTouch.Ext.draw.Draw
  /* static members */
  object Draw {
    
    @JSGlobal("Ext.draw.Draw")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.draw.Draw.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.draw.Draw.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.draw.Draw.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.draw.Draw.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.draw.Draw.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.draw.Draw.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Converting radians to degrees
      * @param radian Number
      * @returns Number
      */
    @JSGlobal("Ext.draw.Draw.degrees")
    @js.native
    def degrees(): Double = js.native
    @JSGlobal("Ext.draw.Draw.degrees")
    @js.native
    def degrees(radian: Double): Double = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.draw.Draw.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.draw.Draw.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.draw.Draw.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.draw.Draw.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.draw.Draw.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method]
      * @param bbox1 Object
      * @param bbox2 Object
      * @param padding Number
      * @returns Boolean
      */
    @JSGlobal("Ext.draw.Draw.isBBoxIntersect")
    @js.native
    def isBBoxIntersect(): Boolean = js.native
    @JSGlobal("Ext.draw.Draw.isBBoxIntersect")
    @js.native
    def isBBoxIntersect(bbox1: js.UndefOr[scala.Nothing], bbox2: js.UndefOr[scala.Nothing], padding: Double): Boolean = js.native
    @JSGlobal("Ext.draw.Draw.isBBoxIntersect")
    @js.native
    def isBBoxIntersect(bbox1: js.UndefOr[scala.Nothing], bbox2: js.Any): Boolean = js.native
    @JSGlobal("Ext.draw.Draw.isBBoxIntersect")
    @js.native
    def isBBoxIntersect(bbox1: js.UndefOr[scala.Nothing], bbox2: js.Any, padding: Double): Boolean = js.native
    @JSGlobal("Ext.draw.Draw.isBBoxIntersect")
    @js.native
    def isBBoxIntersect(bbox1: js.Any): Boolean = js.native
    @JSGlobal("Ext.draw.Draw.isBBoxIntersect")
    @js.native
    def isBBoxIntersect(bbox1: js.Any, bbox2: js.UndefOr[scala.Nothing], padding: Double): Boolean = js.native
    @JSGlobal("Ext.draw.Draw.isBBoxIntersect")
    @js.native
    def isBBoxIntersect(bbox1: js.Any, bbox2: js.Any): Boolean = js.native
    @JSGlobal("Ext.draw.Draw.isBBoxIntersect")
    @js.native
    def isBBoxIntersect(bbox1: js.Any, bbox2: js.Any, padding: Double): Boolean = js.native
    
    /** [Method] Converting degrees to radians
      * @param degrees Number
      * @returns Number
      */
    @JSGlobal("Ext.draw.Draw.rad")
    @js.native
    def rad(): Double = js.native
    @JSGlobal("Ext.draw.Draw.rad")
    @js.native
    def rad(degrees: Double): Double = js.native
    
    /** [Method] Function that returns its first element
      * @param a Mixed
      * @returns Mixed
      */
    @JSGlobal("Ext.draw.Draw.reflectFn")
    @js.native
    def reflectFn(): js.Any = js.native
    @JSGlobal("Ext.draw.Draw.reflectFn")
    @js.native
    def reflectFn(a: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.draw.Draw.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Given coordinates of the points calculates coordinates of a Bezier curve that goes through them
      * @param dataX Object x-coordinates of the points.
      * @param dataY Object y-coordinates of the points.
      * @param value Object A value to control the smoothness of the curve.
      * @returns Object Object holding two arrays, for x and y coordinates of the curve.
      */
    @JSGlobal("Ext.draw.Draw.smooth")
    @js.native
    def smooth(): js.Any = js.native
    @JSGlobal("Ext.draw.Draw.smooth")
    @js.native
    def smooth(dataX: js.UndefOr[scala.Nothing], dataY: js.UndefOr[scala.Nothing], value: js.Any): js.Any = js.native
    @JSGlobal("Ext.draw.Draw.smooth")
    @js.native
    def smooth(dataX: js.UndefOr[scala.Nothing], dataY: js.Any): js.Any = js.native
    @JSGlobal("Ext.draw.Draw.smooth")
    @js.native
    def smooth(dataX: js.UndefOr[scala.Nothing], dataY: js.Any, value: js.Any): js.Any = js.native
    @JSGlobal("Ext.draw.Draw.smooth")
    @js.native
    def smooth(dataX: js.Any): js.Any = js.native
    @JSGlobal("Ext.draw.Draw.smooth")
    @js.native
    def smooth(dataX: js.Any, dataY: js.UndefOr[scala.Nothing], value: js.Any): js.Any = js.native
    @JSGlobal("Ext.draw.Draw.smooth")
    @js.native
    def smooth(dataX: js.Any, dataY: js.Any): js.Any = js.native
    @JSGlobal("Ext.draw.Draw.smooth")
    @js.native
    def smooth(dataX: js.Any, dataY: js.Any, value: js.Any): js.Any = js.native
    
    /** [Method] Natural cubic spline interpolation
      * @param points Array Array of numbers.
      */
    @JSGlobal("Ext.draw.Draw.spline")
    @js.native
    def spline(): Unit = js.native
    @JSGlobal("Ext.draw.Draw.spline")
    @js.native
    def spline(points: typings.senchaTouch.Ext.Array): Unit = js.native
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.draw.Draw.statics")
    @js.native
    def statics(): IClass = js.native
  }
  
  @JSGlobal("Ext.draw.Matrix")
  @js.native
  class Matrix ()
    extends typings.senchaTouch.Ext.draw.Matrix
  /* static members */
  object Matrix {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.draw.Matrix.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.draw.Matrix.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.draw.Matrix.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.draw.Matrix.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method]
      * @param args Object
      */
    @JSGlobal("Ext.draw.Matrix.callParent")
    @js.native
    def callParent(): Unit = js.native
    @JSGlobal("Ext.draw.Matrix.callParent")
    @js.native
    def callParent(args: js.Any): Unit = js.native
    
    /** [Method] Create a matrix from mat
      * @param mat Mixed
      * @returns Ext.draw.Matrix
      */
    @JSGlobal("Ext.draw.Matrix.create")
    @js.native
    def create(): IMatrix = js.native
    @JSGlobal("Ext.draw.Matrix.create")
    @js.native
    def create(mat: js.Any): IMatrix = js.native
    
    /** [Method] Return the affine matrix that transform two points x0 y0 and x1 y1 to x0p y0p and x1p y1p
      * @param x0 Number
      * @param y0 Number
      * @param x1 Number
      * @param y1 Number
      * @param x0p Number
      * @param y0p Number
      * @param x1p Number
      * @param y1p Number
      */
    @JSGlobal("Ext.draw.Matrix.createAffineMatrixFromTwoPair")
    @js.native
    def createAffineMatrixFromTwoPair(
      x0: js.UndefOr[Double],
      y0: js.UndefOr[Double],
      x1: js.UndefOr[Double],
      y1: js.UndefOr[Double],
      x0p: js.UndefOr[Double],
      y0p: js.UndefOr[Double],
      x1p: js.UndefOr[Double],
      y1p: js.UndefOr[Double]
    ): Unit = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.draw.Matrix.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.draw.Matrix.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.draw.Matrix.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.draw.Matrix.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] Return the affine matrix that transform two points x0 y0 and x1 y1 to x0p y0p and x1p y1p
      * @param x0 Number
      * @param y0 Number
      * @param x1 Number
      * @param y1 Number
      * @param x0p Number
      * @param y0p Number
      * @param x1p Number
      * @param y1p Number
      */
    @JSGlobal("Ext.draw.Matrix.createPanZoomFromTwoPair")
    @js.native
    def createPanZoomFromTwoPair(
      x0: js.UndefOr[Double],
      y0: js.UndefOr[Double],
      x1: js.UndefOr[Double],
      y1: js.UndefOr[Double],
      x0p: js.UndefOr[Double],
      y0p: js.UndefOr[Double],
      x1p: js.UndefOr[Double],
      y1p: js.UndefOr[Double]
    ): Unit = js.native
    
    /** [Method] Create a flyweight to wrap the given array
      * @param elements Array
      * @returns Ext.draw.Matrix
      */
    @JSGlobal("Ext.draw.Matrix.fly")
    @js.native
    def fly(): IMatrix = js.native
    @JSGlobal("Ext.draw.Matrix.fly")
    @js.native
    def fly(elements: typings.senchaTouch.Ext.Array): IMatrix = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.draw.Matrix.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.draw.Matrix.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.draw.Matrix.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  @JSGlobal("Ext.draw.Solver")
  @js.native
  class Solver ()
    extends typings.senchaTouch.Ext.draw.Solver
  /* static members */
  object Solver {
    
    @JSGlobal("Ext.draw.Solver")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.draw.Solver.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.draw.Solver.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.draw.Solver.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.draw.Solver.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.draw.Solver.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.draw.Solver.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method] Returns the function f x a  x3  b  x2  c  x  d and solver for f x y
      * @param a Number
      * @param b Number
      * @param c Number
      * @param d Number
      */
    @JSGlobal("Ext.draw.Solver.cubicFunction")
    @js.native
    def cubicFunction(): Unit = js.native
    @JSGlobal("Ext.draw.Solver.cubicFunction")
    @js.native
    def cubicFunction(
      a: js.UndefOr[scala.Nothing],
      b: js.UndefOr[scala.Nothing],
      c: js.UndefOr[scala.Nothing],
      d: Double
    ): Unit = js.native
    @JSGlobal("Ext.draw.Solver.cubicFunction")
    @js.native
    def cubicFunction(a: js.UndefOr[scala.Nothing], b: js.UndefOr[scala.Nothing], c: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.cubicFunction")
    @js.native
    def cubicFunction(a: js.UndefOr[scala.Nothing], b: js.UndefOr[scala.Nothing], c: Double, d: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.cubicFunction")
    @js.native
    def cubicFunction(a: js.UndefOr[scala.Nothing], b: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.cubicFunction")
    @js.native
    def cubicFunction(a: js.UndefOr[scala.Nothing], b: Double, c: js.UndefOr[scala.Nothing], d: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.cubicFunction")
    @js.native
    def cubicFunction(a: js.UndefOr[scala.Nothing], b: Double, c: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.cubicFunction")
    @js.native
    def cubicFunction(a: js.UndefOr[scala.Nothing], b: Double, c: Double, d: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.cubicFunction")
    @js.native
    def cubicFunction(a: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.cubicFunction")
    @js.native
    def cubicFunction(a: Double, b: js.UndefOr[scala.Nothing], c: js.UndefOr[scala.Nothing], d: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.cubicFunction")
    @js.native
    def cubicFunction(a: Double, b: js.UndefOr[scala.Nothing], c: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.cubicFunction")
    @js.native
    def cubicFunction(a: Double, b: js.UndefOr[scala.Nothing], c: Double, d: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.cubicFunction")
    @js.native
    def cubicFunction(a: Double, b: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.cubicFunction")
    @js.native
    def cubicFunction(a: Double, b: Double, c: js.UndefOr[scala.Nothing], d: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.cubicFunction")
    @js.native
    def cubicFunction(a: Double, b: Double, c: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.cubicFunction")
    @js.native
    def cubicFunction(a: Double, b: Double, c: Double, d: Double): Unit = js.native
    
    /** [Method] Cubic root of number
      * @param number Number
      */
    @JSGlobal("Ext.draw.Solver.cubicRoot")
    @js.native
    def cubicRoot(): Unit = js.native
    @JSGlobal("Ext.draw.Solver.cubicRoot")
    @js.native
    def cubicRoot(number: Double): Unit = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.draw.Solver.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.draw.Solver.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.draw.Solver.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.draw.Solver.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.draw.Solver.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method] Returns the function f x a  x  b and solver for f x y
      * @param a Number
      * @param b Number
      */
    @JSGlobal("Ext.draw.Solver.linearFunction")
    @js.native
    def linearFunction(): Unit = js.native
    @JSGlobal("Ext.draw.Solver.linearFunction")
    @js.native
    def linearFunction(a: js.UndefOr[scala.Nothing], b: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.linearFunction")
    @js.native
    def linearFunction(a: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.linearFunction")
    @js.native
    def linearFunction(a: Double, b: Double): Unit = js.native
    
    /** [Method] Returns the function f x a  x  2  b  x  c and solver for f x y
      * @param a Number
      * @param b Number
      * @param c Number
      */
    @JSGlobal("Ext.draw.Solver.quadraticFunction")
    @js.native
    def quadraticFunction(): Unit = js.native
    @JSGlobal("Ext.draw.Solver.quadraticFunction")
    @js.native
    def quadraticFunction(a: js.UndefOr[scala.Nothing], b: js.UndefOr[scala.Nothing], c: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.quadraticFunction")
    @js.native
    def quadraticFunction(a: js.UndefOr[scala.Nothing], b: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.quadraticFunction")
    @js.native
    def quadraticFunction(a: js.UndefOr[scala.Nothing], b: Double, c: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.quadraticFunction")
    @js.native
    def quadraticFunction(a: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.quadraticFunction")
    @js.native
    def quadraticFunction(a: Double, b: js.UndefOr[scala.Nothing], c: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.quadraticFunction")
    @js.native
    def quadraticFunction(a: Double, b: Double): Unit = js.native
    @JSGlobal("Ext.draw.Solver.quadraticFunction")
    @js.native
    def quadraticFunction(a: Double, b: Double, c: Double): Unit = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.draw.Solver.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.draw.Solver.statics")
    @js.native
    def statics(): IClass = js.native
  }
  
  @JSGlobal("Ext.draw.Surface")
  @js.native
  class Surface ()
    extends typings.senchaTouch.Ext.draw.Surface
  /* static members */
  object Surface {
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @JSGlobal("Ext.draw.Surface.addMembers")
    @js.native
    def addMembers(): Unit = js.native
    @JSGlobal("Ext.draw.Surface.addMembers")
    @js.native
    def addMembers(members: js.Any): Unit = js.native
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @JSGlobal("Ext.draw.Surface.addStatics")
    @js.native
    def addStatics(): IBase = js.native
    @JSGlobal("Ext.draw.Surface.addStatics")
    @js.native
    def addStatics(members: js.Any): IBase = js.native
    
    /** [Method]
      * @param args Object
      */
    @JSGlobal("Ext.draw.Surface.callParent")
    @js.native
    def callParent(): Unit = js.native
    @JSGlobal("Ext.draw.Surface.callParent")
    @js.native
    def callParent(args: js.Any): Unit = js.native
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @JSGlobal("Ext.draw.Surface.create")
    @js.native
    def create(): js.Any = js.native
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @JSGlobal("Ext.draw.Surface.createAlias")
    @js.native
    def createAlias(): Unit = js.native
    @JSGlobal("Ext.draw.Surface.createAlias")
    @js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    @JSGlobal("Ext.draw.Surface.createAlias")
    @js.native
    def createAlias(alias: js.Any): Unit = js.native
    @JSGlobal("Ext.draw.Surface.createAlias")
    @js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @JSGlobal("Ext.draw.Surface.getName")
    @js.native
    def getName(): java.lang.String = js.native
    
    /** [Method] Stably sort the list of sprites by their zIndex
      * @param list Array
      */
    @JSGlobal("Ext.draw.Surface.stableSort")
    @js.native
    def stableSort(): Unit = js.native
    @JSGlobal("Ext.draw.Surface.stableSort")
    @js.native
    def stableSort(list: typings.senchaTouch.Ext.Array): Unit = js.native
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @JSGlobal("Ext.draw.Surface.override")
    @js.native
    def `override`(): IBase = js.native
    @JSGlobal("Ext.draw.Surface.override")
    @js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  @JSGlobal("Ext.draw.TextMeasurer")
  @js.native
  class TextMeasurer ()
    extends typings.senchaTouch.Ext.draw.TextMeasurer
  /* static members */
  object TextMeasurer {
    
    @JSGlobal("Ext.draw.TextMeasurer")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.draw.TextMeasurer.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.draw.TextMeasurer.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.draw.TextMeasurer.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.draw.TextMeasurer.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.draw.TextMeasurer.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.draw.TextMeasurer.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.draw.TextMeasurer.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.draw.TextMeasurer.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.draw.TextMeasurer.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.draw.TextMeasurer.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.draw.TextMeasurer.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method] Measure a text with specific font
      * @param text String
      * @param font String
      * @returns Object An object with width, height and sizes properties.
      */
    @JSGlobal("Ext.draw.TextMeasurer.measureText")
    @js.native
    def measureText(): js.Any = js.native
    @JSGlobal("Ext.draw.TextMeasurer.measureText")
    @js.native
    def measureText(text: js.UndefOr[scala.Nothing], font: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.draw.TextMeasurer.measureText")
    @js.native
    def measureText(text: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.draw.TextMeasurer.measureText")
    @js.native
    def measureText(text: java.lang.String, font: java.lang.String): js.Any = js.native
    
    /** [Method] Measure a single line text with specific font
      * @param text String
      * @param font String
      * @returns Object An object with width and height properties.
      */
    @JSGlobal("Ext.draw.TextMeasurer.measureTextSingleLine")
    @js.native
    def measureTextSingleLine(): js.Any = js.native
    @JSGlobal("Ext.draw.TextMeasurer.measureTextSingleLine")
    @js.native
    def measureTextSingleLine(text: js.UndefOr[scala.Nothing], font: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.draw.TextMeasurer.measureTextSingleLine")
    @js.native
    def measureTextSingleLine(text: java.lang.String): js.Any = js.native
    @JSGlobal("Ext.draw.TextMeasurer.measureTextSingleLine")
    @js.native
    def measureTextSingleLine(text: java.lang.String, font: java.lang.String): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.draw.TextMeasurer.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.draw.TextMeasurer.statics")
    @js.native
    def statics(): IClass = js.native
  }
  
  @JSGlobal("Ext.draw.TimingFunctions")
  @js.native
  class TimingFunctions ()
    extends typings.senchaTouch.Ext.draw.TimingFunctions
  /* static members */
  object TimingFunctions {
    
    @JSGlobal("Ext.draw.TimingFunctions")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.draw.TimingFunctions.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.draw.TimingFunctions.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.draw.TimingFunctions.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.draw.TimingFunctions.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.draw.TimingFunctions.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.draw.TimingFunctions.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.draw.TimingFunctions.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.draw.TimingFunctions.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.draw.TimingFunctions.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.draw.TimingFunctions.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.draw.TimingFunctions.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.draw.TimingFunctions.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.draw.TimingFunctions.statics")
    @js.native
    def statics(): IClass = js.native
  }
  
  object sprite {
    
    @JSGlobal("Ext.draw.sprite.AnimationParser")
    @js.native
    class AnimationParser ()
      extends typings.senchaTouch.Ext.draw.sprite.AnimationParser
    /* static members */
    object AnimationParser {
      
      @JSGlobal("Ext.draw.sprite.AnimationParser")
      @js.native
      val ^ : js.Any = js.native
      
      /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
        * @returns Object Returns the result of calling the overridden method
        */
      @JSGlobal("Ext.draw.sprite.AnimationParser.callOverridden")
      @js.native
      def callOverridden(): js.Any = js.native
      @JSGlobal("Ext.draw.sprite.AnimationParser.callOverridden")
      @js.native
      def callOverridden(args: js.Any): js.Any = js.native
      
      /** [Method] Call the parent method of the current method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
        * @returns Object Returns the result of calling the parent method
        */
      @JSGlobal("Ext.draw.sprite.AnimationParser.callParent")
      @js.native
      def callParent(): js.Any = js.native
      @JSGlobal("Ext.draw.sprite.AnimationParser.callParent")
      @js.native
      def callParent(args: js.Any): js.Any = js.native
      
      /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
        * @returns Object Returns the result of calling the superclass method
        */
      @JSGlobal("Ext.draw.sprite.AnimationParser.callSuper")
      @js.native
      def callSuper(): js.Any = js.native
      @JSGlobal("Ext.draw.sprite.AnimationParser.callSuper")
      @js.native
      def callSuper(args: js.Any): js.Any = js.native
      
      /** [Method]  */
      @JSGlobal("Ext.draw.sprite.AnimationParser.destroy")
      @js.native
      def destroy(): Unit = js.native
      
      /** [Method] Returns the initial configuration passed to constructor
        * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
        * @returns Object/Mixed
        */
      @JSGlobal("Ext.draw.sprite.AnimationParser.getInitialConfig")
      @js.native
      def getInitialConfig(): js.Any = js.native
      @JSGlobal("Ext.draw.sprite.AnimationParser.getInitialConfig")
      @js.native
      def getInitialConfig(name: java.lang.String): js.Any = js.native
      
      /** [Method] Initialize configuration for this class
        * @param instanceConfig Object
        * @returns Object mixins The mixin prototypes as key - value pairs
        */
      @JSGlobal("Ext.draw.sprite.AnimationParser.initConfig")
      @js.native
      def initConfig(): js.Any = js.native
      @JSGlobal("Ext.draw.sprite.AnimationParser.initConfig")
      @js.native
      def initConfig(instanceConfig: js.Any): js.Any = js.native
      
      /** [Property] (Ext.Class) */
      @JSGlobal("Ext.draw.sprite.AnimationParser.self")
      @js.native
      def self: IClass = js.native
      @scala.inline
      def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
      
      /** [Method] Get the reference to the class from which this object was instantiated
        * @returns Ext.Class
        */
      @JSGlobal("Ext.draw.sprite.AnimationParser.statics")
      @js.native
      def statics(): IClass = js.native
    }
    
    @JSGlobal("Ext.draw.sprite.AttributeParser")
    @js.native
    class AttributeParser ()
      extends typings.senchaTouch.Ext.draw.sprite.AttributeParser
    /* static members */
    object AttributeParser {
      
      @JSGlobal("Ext.draw.sprite.AttributeParser")
      @js.native
      val ^ : js.Any = js.native
      
      /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
        * @returns Object Returns the result of calling the overridden method
        */
      @JSGlobal("Ext.draw.sprite.AttributeParser.callOverridden")
      @js.native
      def callOverridden(): js.Any = js.native
      @JSGlobal("Ext.draw.sprite.AttributeParser.callOverridden")
      @js.native
      def callOverridden(args: js.Any): js.Any = js.native
      
      /** [Method] Call the parent method of the current method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
        * @returns Object Returns the result of calling the parent method
        */
      @JSGlobal("Ext.draw.sprite.AttributeParser.callParent")
      @js.native
      def callParent(): js.Any = js.native
      @JSGlobal("Ext.draw.sprite.AttributeParser.callParent")
      @js.native
      def callParent(args: js.Any): js.Any = js.native
      
      /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
        * @returns Object Returns the result of calling the superclass method
        */
      @JSGlobal("Ext.draw.sprite.AttributeParser.callSuper")
      @js.native
      def callSuper(): js.Any = js.native
      @JSGlobal("Ext.draw.sprite.AttributeParser.callSuper")
      @js.native
      def callSuper(args: js.Any): js.Any = js.native
      
      /** [Method]  */
      @JSGlobal("Ext.draw.sprite.AttributeParser.destroy")
      @js.native
      def destroy(): Unit = js.native
      
      /** [Method] Returns the initial configuration passed to constructor
        * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
        * @returns Object/Mixed
        */
      @JSGlobal("Ext.draw.sprite.AttributeParser.getInitialConfig")
      @js.native
      def getInitialConfig(): js.Any = js.native
      @JSGlobal("Ext.draw.sprite.AttributeParser.getInitialConfig")
      @js.native
      def getInitialConfig(name: java.lang.String): js.Any = js.native
      
      /** [Method] Initialize configuration for this class
        * @param instanceConfig Object
        * @returns Object mixins The mixin prototypes as key - value pairs
        */
      @JSGlobal("Ext.draw.sprite.AttributeParser.initConfig")
      @js.native
      def initConfig(): js.Any = js.native
      @JSGlobal("Ext.draw.sprite.AttributeParser.initConfig")
      @js.native
      def initConfig(instanceConfig: js.Any): js.Any = js.native
      
      /** [Property] (Ext.Class) */
      @JSGlobal("Ext.draw.sprite.AttributeParser.self")
      @js.native
      def self: IClass = js.native
      @scala.inline
      def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
      
      /** [Method] Get the reference to the class from which this object was instantiated
        * @returns Ext.Class
        */
      @JSGlobal("Ext.draw.sprite.AttributeParser.statics")
      @js.native
      def statics(): IClass = js.native
    }
  }
}
