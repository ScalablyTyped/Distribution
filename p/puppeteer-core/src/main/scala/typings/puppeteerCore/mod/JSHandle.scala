package typings.puppeteerCore.mod

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import typings.std.Awaited
import typings.std.Map
import typings.std.Node
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.puppeteerCore.mod._HandleOr because Already inherited */ @JSImport("puppeteer-core", "JSHandle")
@js.native
open class JSHandle[T] ()
  extends StObject
     with HandleFor[T] {
  
  /**
    * @returns Either `null` or the handle itself if the handle is an
    * instance of {@link ElementHandle}.
    */
  def asElement(): ElementHandle[Node] | Null = js.native
  
  /**
    * Releases the object referenced by the handle for garbage collection.
    */
  def dispose(): js.Promise[Unit] = js.native
  
  /* Excluded from this release type: client */
  /* Excluded from this release type: disposed */
  /* Excluded from this release type: __constructor */
  /* Excluded from this release type: executionContext */
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
