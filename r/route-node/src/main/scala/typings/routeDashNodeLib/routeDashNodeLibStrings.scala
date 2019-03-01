package typings
package routeDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object routeDashNodeLibStrings {
  @js.native
  sealed trait always
    extends routeDashNodeLib.routeDashNodeMod.TrailingSlashMode
  
  @js.native
  sealed trait default
    extends routeDashNodeLib.routeDashNodeMod.QueryParamsMode
       with routeDashNodeLib.routeDashNodeMod.TrailingSlashMode
  
  @js.native
  sealed trait loose
    extends routeDashNodeLib.routeDashNodeMod.QueryParamsMode
  
  @js.native
  sealed trait never
    extends routeDashNodeLib.routeDashNodeMod.TrailingSlashMode
  
  @js.native
  sealed trait query extends js.Object
  
  @js.native
  sealed trait strict
    extends routeDashNodeLib.routeDashNodeMod.QueryParamsMode
  
  @js.native
  sealed trait url extends js.Object
  
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def loose: loose = "loose".asInstanceOf[loose]
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  @scala.inline
  def url: url = "url".asInstanceOf[url]
}

