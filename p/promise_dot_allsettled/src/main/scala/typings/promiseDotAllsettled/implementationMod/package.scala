package typings.promiseDotAllsettled

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object implementationMod {
  type PromiseResultTuple[T /* <: js.Array[_] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: promise.allsettled.promise.allsettled/types.PromiseResult<T[P], unknown>}
    */ typings.promiseDotAllsettled.promiseDotAllsettledStrings.PromiseResultTuple with T
  type PromiseTuple[T /* <: js.Array[_] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.Promise<T[P]>}
    */ typings.promiseDotAllsettled.promiseDotAllsettledStrings.PromiseTuple with T
}
