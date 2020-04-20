package typings.promiseAllsettled

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type PromiseResultTuple[T /* <: Array[js.Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: promise.allsettled.promise.allsettled/types.PromiseResult<T[P], unknown>}
    */ typings.promiseAllsettled.promiseAllsettledStrings.PromiseResultTuple with org.scalablytyped.runtime.TopLevel[T]
  type PromiseTuple[T /* <: Array[js.Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.Promise<T[P]>}
    */ typings.promiseAllsettled.promiseAllsettledStrings.PromiseTuple with org.scalablytyped.runtime.TopLevel[T]
}
