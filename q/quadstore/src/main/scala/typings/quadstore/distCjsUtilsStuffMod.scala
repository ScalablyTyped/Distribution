package typings.quadstore

import typings.node.eventsMod.EventEmitter
import typings.quadstore.distCjsTypesMod.TSReadable
import typings.quadstore.distCjsTypesMod.TermName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsUtilsStuffMod {
  
  @JSImport("quadstore/dist/cjs/utils/stuff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("quadstore/dist/cjs/utils/stuff", "RESOLVED")
  @js.native
  val RESOLVED: js.Promise[Unit] = js.native
  
  inline def arrStartsWith(arr: js.Array[TermName], prefix: js.Array[TermName]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrStartsWith")(arr.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def ensureAbstractLevel(o: Any, key: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureAbstractLevel")(o.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isAbstractLevel[TDatabase, K, V](o: Any): /* is abstract-level.abstract-level.AbstractLevel<TDatabase, K, V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbstractLevel")(o.asInstanceOf[js.Any]).asInstanceOf[/* is abstract-level.abstract-level.AbstractLevel<TDatabase, K, V> */ Boolean]
  
  inline def isObject(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def resolveOnEvent(emitter: EventEmitter, event: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnEvent")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def resolveOnEvent(emitter: EventEmitter, event: String, rejectOnError: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnEvent")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], rejectOnError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def streamToArray[T](readStream: TSReadable[T]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("streamToArray")(readStream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
  
  inline def waitForEvent(emitter: EventEmitter, event: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForEvent")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def waitForEvent(emitter: EventEmitter, event: String, rejectOnError: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForEvent")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], rejectOnError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
