package typings.requirejs

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
  var fullName: String
  /**
  	*
  	**/
  var name: String
  /**
  	*
  	**/
  var originalName: String
  /**
  	*
  	**/
  var parentMap: RequireMap
  /**
  	*
  	**/
  var prefix: String
  /**
  	*
  	**/
  var url: String
}

object RequireMap {
  @scala.inline
  def apply(
    fullName: String,
    name: String,
    originalName: String,
    parentMap: RequireMap,
    prefix: String,
    url: String
  ): RequireMap = {
    val __obj = js.Dynamic.literal(fullName = fullName, name = name, originalName = originalName, parentMap = parentMap, prefix = prefix, url = url)
  
    __obj.asInstanceOf[RequireMap]
  }
}

