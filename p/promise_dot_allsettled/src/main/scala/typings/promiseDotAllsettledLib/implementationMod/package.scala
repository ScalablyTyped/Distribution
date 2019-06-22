package typings
package promiseDotAllsettledLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object implementationMod {
  type PromiseResultTuple[T /* <: js.Array[_] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: promise.allsettled.promise.allsettled/types.PromiseResult<T[P], unknown>}
    */ promiseDotAllsettledLib.promiseDotAllsettledLibStrings.PromiseResultTuple with T
  type PromiseTuple[T /* <: js.Array[_] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.Promise<T[P]>}
    */ promiseDotAllsettledLib.promiseDotAllsettledLibStrings.PromiseTuple with T
}
