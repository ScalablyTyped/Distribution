package typings.reactMdUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object useResizeObserverV1Mod {
  
  /**
    * A function that will return the resize observer target element. This should
    * return an HTMLElement or null.
    */
  type GetTarget[E /* <: typings.std.HTMLElement */] = js.Function0[E | scala.Null]
  
  type ObservedResizeEventHandler = js.Function1[
    /* event */ typings.reactMdUtils.useResizeObserverV1Mod.ObservedResizeData, 
    scala.Unit
  ]
  
  type RefTarget[E /* <: typings.std.HTMLElement */] = typings.react.mod.MutableRefObject[E | scala.Null]
  
  type ResizeObserverTarget[E /* <: typings.std.HTMLElement */] = scala.Null | typings.std.HTMLElement | java.lang.String | typings.reactMdUtils.useResizeObserverV1Mod.RefTarget[E] | typings.reactMdUtils.useResizeObserverV1Mod.GetTarget[E]
}
