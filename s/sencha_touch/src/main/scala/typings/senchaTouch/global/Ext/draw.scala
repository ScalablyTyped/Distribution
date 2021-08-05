package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.draw.IColor
import typings.senchaTouch.Ext.draw.IMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draw {
  
  @JSGlobal("Ext.draw.Animator")
  @js.native
  class Animator ()
    extends StObject
       with typings.senchaTouch.Ext.draw.Animator
  /* static members */
  object Animator {
    
    @JSGlobal("Ext.draw.Animator")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Adds an animated object to the animation pool
      * @param animation Object The animation descriptor to add to the pool.
      */
    inline def add(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[Unit]
    inline def add(animation: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(animation.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Register a recursive callback that will be called at every frame
      * @param callback Function
      * @param scope Object
      * @returns String
      */
    inline def addFrameCallback(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("addFrameCallback")().asInstanceOf[java.lang.String]
    inline def addFrameCallback(callback: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("addFrameCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    inline def addFrameCallback(callback: js.Any, scope: js.Any): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("addFrameCallback")(callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def addFrameCallback(callback: Unit, scope: js.Any): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("addFrameCallback")(callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    /** [Method] Cross platform animationTime implementation
      * @returns Number
      */
    inline def animationTime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("animationTime")().asInstanceOf[Double]
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Cancel a registered one time callback
      * @param id String
      */
    inline def cancel(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")().asInstanceOf[Unit]
    inline def cancel(id: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Returns true or false whether it contains the given animation or not
      * @param animation Object The animation to check for.
      * @returns Boolean
      */
    inline def contains(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")().asInstanceOf[Boolean]
    inline def contains(animation: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")(animation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns true or false whether the pool is empty or not
      * @returns Boolean
      */
    inline def empty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Boolean]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
    inline def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Removes an animation from the pool
      * @param animation Object The animation to remove from the pool.
      */
    inline def remove(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[Unit]
    inline def remove(animation: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(animation.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Unregister a recursive callback
      * @param id String
      */
    inline def removeFrameCallback(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFrameCallback")().asInstanceOf[Unit]
    inline def removeFrameCallback(id: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFrameCallback")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Register an one time callback that will be called at the next frame
      * @param callback Function
      * @param scope Object
      * @returns String
      */
    inline def schedule(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("schedule")().asInstanceOf[java.lang.String]
    inline def schedule(callback: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(callback.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    inline def schedule(callback: js.Any, scope: js.Any): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def schedule(callback: Unit, scope: js.Any): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.draw.Animator.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Given a frame time it will filter out finished animations from the pool
      * @param frameTime Number The frame's start time, in milliseconds.
      */
    inline def step(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("step")().asInstanceOf[Unit]
    inline def step(frameTime: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("step")(frameTime.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSGlobal("Ext.draw.Color")
  @js.native
  class Color ()
    extends StObject
       with typings.senchaTouch.Ext.draw.Color
  /* static members */
  object Color {
    
    @JSGlobal("Ext.draw.Color")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    inline def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    inline def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    inline def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    inline def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method]
      * @param args Object
      */
    inline def callParent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Unit]
    inline def callParent(args: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Convenience method for creating a color
      * @param red Ext.draw.Color/String/Number[]/Number Red component (0..255), CSS color string or array of all components.
      * @param green Number Green component (0..255)
      * @param blue Number Blue component (0..255)
      * @param alpha Number Alpha component (0..1)
      * @returns Ext.draw.Color
      */
    inline def create(): IColor = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[IColor]
    inline def create(red: js.Any): IColor = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(red.asInstanceOf[js.Any]).asInstanceOf[IColor]
    inline def create(red: js.Any, green: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def create(red: js.Any, green: Double, blue: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def create(red: js.Any, green: Double, blue: Double, alpha: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def create(red: js.Any, green: Double, blue: Unit, alpha: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def create(red: js.Any, green: Unit, blue: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def create(red: js.Any, green: Unit, blue: Double, alpha: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def create(red: js.Any, green: Unit, blue: Unit, alpha: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def create(red: Unit, green: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def create(red: Unit, green: Double, blue: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def create(red: Unit, green: Double, blue: Double, alpha: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def create(red: Unit, green: Double, blue: Unit, alpha: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def create(red: Unit, green: Unit, blue: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def create(red: Unit, green: Unit, blue: Double, alpha: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def create(red: Unit, green: Unit, blue: Unit, alpha: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[IColor]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    inline def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    inline def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Returns a flyweight instance of Ext draw Color
      * @param red Number/String Red component (0..255) or CSS color string.
      * @param green Number Green component (0..255)
      * @param blue Number Blue component (0..255)
      * @param alpha Number Alpha component (0..1)
      * @returns Ext.draw.Color
      */
    inline def fly(): IColor = ^.asInstanceOf[js.Dynamic].applyDynamic("fly")().asInstanceOf[IColor]
    inline def fly(red: js.Any): IColor = ^.asInstanceOf[js.Dynamic].applyDynamic("fly")(red.asInstanceOf[js.Any]).asInstanceOf[IColor]
    inline def fly(red: js.Any, green: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def fly(red: js.Any, green: Double, blue: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def fly(red: js.Any, green: Double, blue: Double, alpha: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def fly(red: js.Any, green: Double, blue: Unit, alpha: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def fly(red: js.Any, green: Unit, blue: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def fly(red: js.Any, green: Unit, blue: Double, alpha: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def fly(red: js.Any, green: Unit, blue: Unit, alpha: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def fly(red: Unit, green: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def fly(red: Unit, green: Double, blue: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def fly(red: Unit, green: Double, blue: Double, alpha: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def fly(red: Unit, green: Double, blue: Unit, alpha: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def fly(red: Unit, green: Unit, blue: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def fly(red: Unit, green: Unit, blue: Double, alpha: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def fly(red: Unit, green: Unit, blue: Unit, alpha: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[IColor]
    
    /** [Method] Create a new color based on the specified HSL values
      * @param h Number Hue component (0..359)
      * @param s Number Saturation component (0..1)
      * @param l Number Lightness component (0..1)
      * @returns Ext.draw.Color
      */
    inline def fromHSL(): IColor = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHSL")().asInstanceOf[IColor]
    inline def fromHSL(h: Double): IColor = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHSL")(h.asInstanceOf[js.Any]).asInstanceOf[IColor]
    inline def fromHSL(h: Double, s: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHSL")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def fromHSL(h: Double, s: Double, l: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHSL")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def fromHSL(h: Double, s: Unit, l: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHSL")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def fromHSL(h: Unit, s: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHSL")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def fromHSL(h: Unit, s: Double, l: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHSL")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[IColor]
    inline def fromHSL(h: Unit, s: Unit, l: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHSL")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[IColor]
    
    /** [Method] Parse the string and create a new color
      * @param string String Color in string.
      * @returns Ext.draw.Color
      */
    inline def fromString(): IColor = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")().asInstanceOf[IColor]
    inline def fromString(string: java.lang.String): IColor = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(string.asInstanceOf[js.Any]).asInstanceOf[IColor]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    inline def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    inline def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    inline def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  }
  
  @JSGlobal("Ext.draw.Draw")
  @js.native
  class Draw ()
    extends StObject
       with typings.senchaTouch.Ext.draw.Draw
  /* static members */
  object Draw {
    
    @JSGlobal("Ext.draw.Draw")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Converting radians to degrees
      * @param radian Number
      * @returns Number
      */
    inline def degrees(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("degrees")().asInstanceOf[Double]
    inline def degrees(radian: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("degrees")(radian.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
    inline def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method]
      * @param bbox1 Object
      * @param bbox2 Object
      * @param padding Number
      * @returns Boolean
      */
    inline def isBBoxIntersect(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBBoxIntersect")().asInstanceOf[Boolean]
    inline def isBBoxIntersect(bbox1: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBBoxIntersect")(bbox1.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isBBoxIntersect(bbox1: js.Any, bbox2: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBBoxIntersect")(bbox1.asInstanceOf[js.Any], bbox2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isBBoxIntersect(bbox1: js.Any, bbox2: js.Any, padding: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBBoxIntersect")(bbox1.asInstanceOf[js.Any], bbox2.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isBBoxIntersect(bbox1: js.Any, bbox2: Unit, padding: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBBoxIntersect")(bbox1.asInstanceOf[js.Any], bbox2.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isBBoxIntersect(bbox1: Unit, bbox2: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBBoxIntersect")(bbox1.asInstanceOf[js.Any], bbox2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isBBoxIntersect(bbox1: Unit, bbox2: js.Any, padding: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBBoxIntersect")(bbox1.asInstanceOf[js.Any], bbox2.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isBBoxIntersect(bbox1: Unit, bbox2: Unit, padding: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBBoxIntersect")(bbox1.asInstanceOf[js.Any], bbox2.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** [Method] Converting degrees to radians
      * @param degrees Number
      * @returns Number
      */
    inline def rad(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rad")().asInstanceOf[Double]
    inline def rad(degrees: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rad")(degrees.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** [Method] Function that returns its first element
      * @param a Mixed
      * @returns Mixed
      */
    inline def reflectFn(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("reflectFn")().asInstanceOf[js.Any]
    inline def reflectFn(a: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("reflectFn")(a.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.draw.Draw.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Given coordinates of the points calculates coordinates of a Bezier curve that goes through them
      * @param dataX Object x-coordinates of the points.
      * @param dataY Object y-coordinates of the points.
      * @param value Object A value to control the smoothness of the curve.
      * @returns Object Object holding two arrays, for x and y coordinates of the curve.
      */
    inline def smooth(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("smooth")().asInstanceOf[js.Any]
    inline def smooth(dataX: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("smooth")(dataX.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def smooth(dataX: js.Any, dataY: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("smooth")(dataX.asInstanceOf[js.Any], dataY.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def smooth(dataX: js.Any, dataY: js.Any, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("smooth")(dataX.asInstanceOf[js.Any], dataY.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def smooth(dataX: js.Any, dataY: Unit, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("smooth")(dataX.asInstanceOf[js.Any], dataY.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def smooth(dataX: Unit, dataY: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("smooth")(dataX.asInstanceOf[js.Any], dataY.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def smooth(dataX: Unit, dataY: js.Any, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("smooth")(dataX.asInstanceOf[js.Any], dataY.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def smooth(dataX: Unit, dataY: Unit, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("smooth")(dataX.asInstanceOf[js.Any], dataY.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Natural cubic spline interpolation
      * @param points Array Array of numbers.
      */
    inline def spline(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spline")().asInstanceOf[Unit]
    inline def spline(points: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spline")(points.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.draw.Matrix")
  @js.native
  class Matrix ()
    extends StObject
       with typings.senchaTouch.Ext.draw.Matrix
  /* static members */
  object Matrix {
    
    @JSGlobal("Ext.draw.Matrix")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    inline def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    inline def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    inline def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    inline def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method]
      * @param args Object
      */
    inline def callParent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Unit]
    inline def callParent(args: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Create a matrix from mat
      * @param mat Mixed
      * @returns Ext.draw.Matrix
      */
    inline def create(): IMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[IMatrix]
    inline def create(mat: js.Any): IMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(mat.asInstanceOf[js.Any]).asInstanceOf[IMatrix]
    
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
    inline def createAffineMatrixFromTwoPair(
      x0: js.UndefOr[Double],
      y0: js.UndefOr[Double],
      x1: js.UndefOr[Double],
      y1: js.UndefOr[Double],
      x0p: js.UndefOr[Double],
      y0p: js.UndefOr[Double],
      x1p: js.UndefOr[Double],
      y1p: js.UndefOr[Double]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAffineMatrixFromTwoPair")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x0p.asInstanceOf[js.Any], y0p.asInstanceOf[js.Any], x1p.asInstanceOf[js.Any], y1p.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    inline def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    inline def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    inline def createPanZoomFromTwoPair(
      x0: js.UndefOr[Double],
      y0: js.UndefOr[Double],
      x1: js.UndefOr[Double],
      y1: js.UndefOr[Double],
      x0p: js.UndefOr[Double],
      y0p: js.UndefOr[Double],
      x1p: js.UndefOr[Double],
      y1p: js.UndefOr[Double]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPanZoomFromTwoPair")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x0p.asInstanceOf[js.Any], y0p.asInstanceOf[js.Any], x1p.asInstanceOf[js.Any], y1p.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Create a flyweight to wrap the given array
      * @param elements Array
      * @returns Ext.draw.Matrix
      */
    inline def fly(): IMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fly")().asInstanceOf[IMatrix]
    inline def fly(elements: typings.senchaTouch.Ext.Array): IMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fly")(elements.asInstanceOf[js.Any]).asInstanceOf[IMatrix]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    inline def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    inline def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    inline def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  }
  
  @JSGlobal("Ext.draw.Solver")
  @js.native
  class Solver ()
    extends StObject
       with typings.senchaTouch.Ext.draw.Solver
  /* static members */
  object Solver {
    
    @JSGlobal("Ext.draw.Solver")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the function f x a  x3  b  x2  c  x  d and solver for f x y
      * @param a Number
      * @param b Number
      * @param c Number
      * @param d Number
      */
    inline def cubicFunction(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cubicFunction")().asInstanceOf[Unit]
    inline def cubicFunction(a: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cubicFunction")(a.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def cubicFunction(a: Double, b: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cubicFunction(a: Double, b: Double, c: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cubicFunction(a: Double, b: Double, c: Double, d: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cubicFunction(a: Double, b: Double, c: Unit, d: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cubicFunction(a: Double, b: Unit, c: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cubicFunction(a: Double, b: Unit, c: Double, d: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cubicFunction(a: Double, b: Unit, c: Unit, d: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cubicFunction(a: Unit, b: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cubicFunction(a: Unit, b: Double, c: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cubicFunction(a: Unit, b: Double, c: Double, d: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cubicFunction(a: Unit, b: Double, c: Unit, d: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cubicFunction(a: Unit, b: Unit, c: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cubicFunction(a: Unit, b: Unit, c: Double, d: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cubicFunction(a: Unit, b: Unit, c: Unit, d: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Cubic root of number
      * @param number Number
      */
    inline def cubicRoot(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cubicRoot")().asInstanceOf[Unit]
    inline def cubicRoot(number: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cubicRoot")(number.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
    inline def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the function f x a  x  b and solver for f x y
      * @param a Number
      * @param b Number
      */
    inline def linearFunction(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("linearFunction")().asInstanceOf[Unit]
    inline def linearFunction(a: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("linearFunction")(a.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def linearFunction(a: Double, b: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("linearFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def linearFunction(a: Unit, b: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("linearFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Returns the function f x a  x  2  b  x  c and solver for f x y
      * @param a Number
      * @param b Number
      * @param c Number
      */
    inline def quadraticFunction(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("quadraticFunction")().asInstanceOf[Unit]
    inline def quadraticFunction(a: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("quadraticFunction")(a.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def quadraticFunction(a: Double, b: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quadraticFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quadraticFunction(a: Double, b: Double, c: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quadraticFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quadraticFunction(a: Double, b: Unit, c: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quadraticFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quadraticFunction(a: Unit, b: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quadraticFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quadraticFunction(a: Unit, b: Double, c: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quadraticFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quadraticFunction(a: Unit, b: Unit, c: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quadraticFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.draw.Solver.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.draw.Surface")
  @js.native
  class Surface ()
    extends StObject
       with typings.senchaTouch.Ext.draw.Surface
  /* static members */
  object Surface {
    
    @JSGlobal("Ext.draw.Surface")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    inline def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    inline def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    inline def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    inline def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method]
      * @param args Object
      */
    inline def callParent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Unit]
    inline def callParent(args: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    inline def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    inline def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    inline def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    inline def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    inline def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    inline def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method] Stably sort the list of sprites by their zIndex
      * @param list Array
      */
    inline def stableSort(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stableSort")().asInstanceOf[Unit]
    inline def stableSort(list: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stableSort")(list.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSGlobal("Ext.draw.TextMeasurer")
  @js.native
  class TextMeasurer ()
    extends StObject
       with typings.senchaTouch.Ext.draw.TextMeasurer
  /* static members */
  object TextMeasurer {
    
    @JSGlobal("Ext.draw.TextMeasurer")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
    inline def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Measure a text with specific font
      * @param text String
      * @param font String
      * @returns Object An object with width, height and sizes properties.
      */
    inline def measureText(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("measureText")().asInstanceOf[js.Any]
    inline def measureText(text: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def measureText(text: java.lang.String, font: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def measureText(text: Unit, font: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Measure a single line text with specific font
      * @param text String
      * @param font String
      * @returns Object An object with width and height properties.
      */
    inline def measureTextSingleLine(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("measureTextSingleLine")().asInstanceOf[js.Any]
    inline def measureTextSingleLine(text: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("measureTextSingleLine")(text.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def measureTextSingleLine(text: java.lang.String, font: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("measureTextSingleLine")(text.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def measureTextSingleLine(text: Unit, font: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("measureTextSingleLine")(text.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.draw.TextMeasurer.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.draw.TimingFunctions")
  @js.native
  class TimingFunctions ()
    extends StObject
       with typings.senchaTouch.Ext.draw.TimingFunctions
  /* static members */
  object TimingFunctions {
    
    @JSGlobal("Ext.draw.TimingFunctions")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method]  */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    inline def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
    inline def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.draw.TimingFunctions.self")
    @js.native
    def self: IClass = js.native
    inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  object sprite {
    
    @JSGlobal("Ext.draw.sprite.AnimationParser")
    @js.native
    class AnimationParser ()
      extends StObject
         with typings.senchaTouch.Ext.draw.sprite.AnimationParser
    /* static members */
    object AnimationParser {
      
      @JSGlobal("Ext.draw.sprite.AnimationParser")
      @js.native
      val ^ : js.Any = js.native
      
      /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
        * @returns Object Returns the result of calling the overridden method
        */
      inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
      inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Method] Call the parent method of the current method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
        * @returns Object Returns the result of calling the parent method
        */
      inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
      inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
        * @returns Object Returns the result of calling the superclass method
        */
      inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
      inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Method]  */
      inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
      
      /** [Method] Returns the initial configuration passed to constructor
        * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
        * @returns Object/Mixed
        */
      inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
      inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Method] Initialize configuration for this class
        * @param instanceConfig Object
        * @returns Object mixins The mixin prototypes as key - value pairs
        */
      inline def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
      inline def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Property] (Ext.Class) */
      @JSGlobal("Ext.draw.sprite.AnimationParser.self")
      @js.native
      def self: IClass = js.native
      inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
      
      /** [Method] Get the reference to the class from which this object was instantiated
        * @returns Ext.Class
        */
      inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    }
    
    @JSGlobal("Ext.draw.sprite.AttributeParser")
    @js.native
    class AttributeParser ()
      extends StObject
         with typings.senchaTouch.Ext.draw.sprite.AttributeParser
    /* static members */
    object AttributeParser {
      
      @JSGlobal("Ext.draw.sprite.AttributeParser")
      @js.native
      val ^ : js.Any = js.native
      
      /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
        * @returns Object Returns the result of calling the overridden method
        */
      inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
      inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Method] Call the parent method of the current method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
        * @returns Object Returns the result of calling the parent method
        */
      inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
      inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
        * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
        * @returns Object Returns the result of calling the superclass method
        */
      inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
      inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Method]  */
      inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
      
      /** [Method] Returns the initial configuration passed to constructor
        * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
        * @returns Object/Mixed
        */
      inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
      inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Method] Initialize configuration for this class
        * @param instanceConfig Object
        * @returns Object mixins The mixin prototypes as key - value pairs
        */
      inline def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
      inline def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      /** [Property] (Ext.Class) */
      @JSGlobal("Ext.draw.sprite.AttributeParser.self")
      @js.native
      def self: IClass = js.native
      inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
      
      /** [Method] Get the reference to the class from which this object was instantiated
        * @returns Ext.Class
        */
      inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    }
  }
}
