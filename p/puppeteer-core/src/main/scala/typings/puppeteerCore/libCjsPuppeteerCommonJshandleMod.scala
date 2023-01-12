package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession
import typings.puppeteerCore.libCjsPuppeteerCommonElementHandleMod.ElementHandle
import typings.puppeteerCore.libCjsPuppeteerCommonExecutionContextMod.ExecutionContext
import typings.puppeteerCore.libCjsPuppeteerCommonInputMod.MouseButton
import typings.puppeteerCore.libCjsPuppeteerCommonTypesMod.EvaluateFunc
import typings.puppeteerCore.libCjsPuppeteerCommonTypesMod.HandleFor
import typings.puppeteerCore.libCjsPuppeteerCommonTypesMod.HandleOr
import typings.std.Awaited
import typings.std.Map
import typings.std.Node
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerCommonJshandleMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/JSHandle", "JSHandle")
  @js.native
  open class JSHandle[T] protected () extends StObject {
    /**
      * @internal
      */
    def this(context: ExecutionContext, remoteObject: RemoteObject) = this()
    
    /**
      * @returns Either `null` or the handle itself if the handle is an
      * instance of {@link ElementHandle}.
      */
    def asElement(): ElementHandle[Node] | Null = js.native
    
    /**
      * @internal
      */
    def client: CDPSession = js.native
    
    /**
      * Releases the object referenced by the handle for garbage collection.
      */
    def dispose(): js.Promise[Unit] = js.native
    
    /**
      * @internal
      */
    def disposed: Boolean = js.native
    
    /**
      * Evaluates the given function with the current handle as its first argument.
      *
      * @see {@link ExecutionContext.evaluate} for more details.
      */
    def evaluate[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[
        /* import warning: importer.ImportType#apply c repeated non-array type: Params */ js.Array[Params]
      ] */](
      pageFunction: Func,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    def evaluate[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[
        /* import warning: importer.ImportType#apply c repeated non-array type: Params */ js.Array[Params]
      ] */](
      pageFunction: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    
    /**
      * Evaluates the given function with the current handle as its first argument.
      *
      * @see {@link ExecutionContext.evaluateHandle} for more details.
      */
    def evaluateHandle[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[
        /* import warning: importer.ImportType#apply c repeated non-array type: Params */ js.Array[Params]
      ] */](
      pageFunction: Func,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
    def evaluateHandle[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[
        /* import warning: importer.ImportType#apply c repeated non-array type: Params */ js.Array[Params]
      ] */](
      pageFunction: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
    
    /**
      * @internal
      */
    def executionContext(): ExecutionContext = js.native
    
    /**
      * Gets a map of handles representing the properties of the current handle.
      *
      * @example
      *
      * ```ts
      * const listHandle = await page.evaluateHandle(() => document.body.children);
      * const properties = await listHandle.getProperties();
      * const children = [];
      * for (const property of properties.values()) {
      *   const element = property.asElement();
      *   if (element) {
      *     children.push(element);
      *   }
      * }
      * children; // holds elementHandles to all children of document.body
      * ```
      */
    def getProperties(): js.Promise[Map[String, JSHandle[Any]]] = js.native
    
    def getProperty(propertyName: String): js.Promise[JSHandle[Any]] = js.native
    /**
      * Fetches a single property from the referenced object.
      */
    def getProperty[K /* <: /* keyof T */ String */](propertyName: HandleOr[K]): js.Promise[
        HandleFor[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
      ] = js.native
    
    /**
      * @returns A vanilla object representing the serializable portions of the
      * referenced object.
      * @throws Throws if the object cannot be serialized due to circularity.
      *
      * @remarks
      * If the object has a `toJSON` function, it **will not** be called.
      */
    def jsonValue(): js.Promise[T] = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Provides access to the
      * [Protocol.Runtime.RemoteObject](https://chromedevtools.github.io/devtools-protocol/tot/Runtime/#type-RemoteObject)
      * backing this handle.
      */
    def remoteObject(): RemoteObject = js.native
  }
  
  trait BoundingBox
    extends StObject
       with Point {
    
    /**
      * the height of the element in pixels.
      */
    var height: Double
    
    /**
      * the width of the element in pixels.
      */
    var width: Double
  }
  object BoundingBox {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): BoundingBox = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundingBox]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BoundingBox] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait BoxModel extends StObject {
    
    var border: js.Array[Point]
    
    var content: js.Array[Point]
    
    var height: Double
    
    var margin: js.Array[Point]
    
    var padding: js.Array[Point]
    
    var width: Double
  }
  object BoxModel {
    
    inline def apply(
      border: js.Array[Point],
      content: js.Array[Point],
      height: Double,
      margin: js.Array[Point],
      padding: js.Array[Point],
      width: Double
    ): BoxModel = {
      val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BoxModel] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: js.Array[Point]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderVarargs(value: Point*): Self = StObject.set(x, "border", js.Array(value*))
      
      inline def setContent(value: js.Array[Point]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentVarargs(value: Point*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMargin(value: js.Array[Point]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginVarargs(value: Point*): Self = StObject.set(x, "margin", js.Array(value*))
      
      inline def setPadding(value: js.Array[Point]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingVarargs(value: Point*): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClickOptions extends StObject {
    
    /**
      * @defaultValue 'left'
      */
    var button: js.UndefOr[MouseButton] = js.undefined
    
    /**
      * @defaultValue 1
      */
    var clickCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Time to wait between `mousedown` and `mouseup` in milliseconds.
      *
      * @defaultValue 0
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Offset for the clickable point relative to the top-left corner of the border box.
      */
    var offset: js.UndefOr[Offset] = js.undefined
  }
  object ClickOptions {
    
    inline def apply(): ClickOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClickOptions] (val x: Self) extends AnyVal {
      
      inline def setButton(value: MouseButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
      
      inline def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  trait Offset extends StObject {
    
    /**
      * x-offset for the clickable point relative to the top-left corner of the border box.
      */
    var x: Double
    
    /**
      * y-offset for the clickable point relative to the top-left corner of the border box.
      */
    var y: Double
  }
  object Offset {
    
    inline def apply(x: Double, y: Double): Offset = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait PressOptions extends StObject {
    
    /**
      * Time to wait between `keydown` and `keyup` in milliseconds. Defaults to 0.
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * If specified, generates an input event with this text.
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object PressOptions {
    
    inline def apply(): PressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PressOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PressOptions] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
