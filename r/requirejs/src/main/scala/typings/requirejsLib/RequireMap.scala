package typings
package requirejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
*
**/
trait RequireMap extends js.Object {
  /**
  	*
  	**/
  var fullName: java.lang.String
  /**
  	*
  	**/
  var name: java.lang.String
  /**
  	*
  	**/
  var originalName: java.lang.String
  /**
  	*
  	**/
  var parentMap: RequireMap
  /**
  	*
  	**/
  var prefix: java.lang.String
  /**
  	*
  	**/
  var url: java.lang.String
}

object RequireMap {
  @scala.inline
  def apply(
    fullName: java.lang.String,
    name: java.lang.String,
    originalName: java.lang.String,
    parentMap: RequireMap,
    prefix: java.lang.String,
    url: java.lang.String
  ): RequireMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fullName")(fullName)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("originalName")(originalName)
    __obj.updateDynamic("parentMap")(parentMap)
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RequireMap]
  }
}

