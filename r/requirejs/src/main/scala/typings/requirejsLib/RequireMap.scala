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
    val __obj = js.Dynamic.literal(fullName = fullName, name = name, originalName = originalName, parentMap = parentMap, prefix = prefix, url = url)
  
    __obj.asInstanceOf[RequireMap]
  }
}

