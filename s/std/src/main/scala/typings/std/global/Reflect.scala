package typings.std.global

import typings.std.ArrayLike
import typings.std.PropertyDescriptor
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Reflect {
  
  @JSGlobal("Reflect")
  @js.native
  val ^ : js.Any = js.native
  
  inline def apply(target: js.Function, thisArgument: js.Any, argumentsList: ArrayLike[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(target.asInstanceOf[js.Any], thisArgument.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def construct(target: js.Function, argumentsList: ArrayLike[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")(target.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def construct(target: js.Function, argumentsList: ArrayLike[js.Any], newTarget: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")(target.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any], newTarget.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def defineProperty(target: js.Object, propertyKey: PropertyKey, attributes: PropertyDescriptor): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  inline def deleteProperty(target: js.Object, propertyKey: PropertyKey): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteProperty")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  inline def get(target: js.Object, propertyKey: PropertyKey): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(target: js.Object, propertyKey: PropertyKey, receiver: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getOwnPropertyDescriptor(target: js.Object, propertyKey: PropertyKey): js.UndefOr[PropertyDescriptor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyDescriptor")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[PropertyDescriptor]]
  
  inline def getPrototypeOf(target: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototypeOf")(target.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def has(target: js.Object, propertyKey: PropertyKey): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  inline def isExtensible(target: js.Object): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExtensible")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  inline def ownKeys(target: js.Object): js.Array[PropertyKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("ownKeys")(target.asInstanceOf[js.Any]).asInstanceOf[js.Array[PropertyKey]]
  
  inline def preventExtensions(target: js.Object): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("preventExtensions")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  inline def set(target: js.Object, propertyKey: PropertyKey, value: js.Any): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  inline def set(target: js.Object, propertyKey: PropertyKey, value: js.Any, receiver: js.Any): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  inline def setPrototypeOf(target: js.Object, proto: js.Any): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setPrototypeOf")(target.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
}
