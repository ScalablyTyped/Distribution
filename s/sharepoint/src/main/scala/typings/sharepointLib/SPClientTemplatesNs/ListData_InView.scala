package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListData_InView extends js.Object {
  var FilterFields: java.lang.String
  var FilterLink: java.lang.String
  var FirstRow: scala.Double
  /** Either "0" or "1" */
  var ForceNoHierarchy: java.lang.String
  var HierarchyHasIndention: java.lang.String
  var LastRow: scala.Double
  /** Link to the next page  (not defined if not available) */
  var NextHref: java.lang.String
  /** Link to the previous page (not defined if not available) */
  var PrevHref: java.lang.String
  var Row: js.Array[Item]
  var SortDir: java.lang.String
  var SortField: java.lang.String
}

