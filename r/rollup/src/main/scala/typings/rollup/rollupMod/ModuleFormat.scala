package typings.rollup.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rollup.rollupStrings.amd
  - typings.rollup.rollupStrings.cjs
  - typings.rollup.rollupStrings.commonjs
  - typings.rollup.rollupStrings.es
  - typings.rollup.rollupStrings.esm
  - typings.rollup.rollupStrings.iife
  - typings.rollup.rollupStrings.module
  - typings.rollup.rollupStrings.system
  - typings.rollup.rollupStrings.umd
*/
trait ModuleFormat extends js.Object

object ModuleFormat {
  @scala.inline
  def amd: typings.rollup.rollupStrings.amd = this.cast("amd")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cjs: typings.rollup.rollupStrings.cjs = this.cast("cjs")
  @scala.inline
  def commonjs: typings.rollup.rollupStrings.commonjs = this.cast("commonjs")
  @scala.inline
  def es: typings.rollup.rollupStrings.es = this.cast("es")
  @scala.inline
  def esm: typings.rollup.rollupStrings.esm = this.cast("esm")
  @scala.inline
  def iife: typings.rollup.rollupStrings.iife = this.cast("iife")
  @scala.inline
  def module: typings.rollup.rollupStrings.module = this.cast("module")
  @scala.inline
  def system: typings.rollup.rollupStrings.system = this.cast("system")
  @scala.inline
  def umd: typings.rollup.rollupStrings.umd = this.cast("umd")
}

