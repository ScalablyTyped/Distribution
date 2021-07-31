package typings.remarkable.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Useful helper functions for custom rendering.
  */
/* static member */
object utils {
  
  @JSImport("remarkable/lib", "utils")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def assign(target: js.Any, sources: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def escapeHtml(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHtml")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def fromCodePoint(c: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCodePoint")(c.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def has(`object`: js.Any, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isString(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")().asInstanceOf[Boolean]
  @scala.inline
  def isString(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidEntityCode(c: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidEntityCode")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def replaceEntities(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceEntities")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def unescapeMd(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeMd")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
