package typings
package siestaLib.SiestaNs.TestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * @mixin
         */
@js.native
trait IExtJSComponent extends js.Object {
  def destroysOk(components: js.Any): scala.Unit = js.native
  def destroysOk(components: js.Any, description: java.lang.String): scala.Unit = js.native
  def hasPosition(component: js.Any, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def hasPosition(component: js.Any, x: scala.Double, y: scala.Double, description: java.lang.String): scala.Unit = js.native
  def hasSize(component: js.Any, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def hasSize(component: js.Any, width: scala.Double, height: scala.Double, description: java.lang.String): scala.Unit = js.native
  def waitForCQ(query: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForCQ(query: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForCQ(query: java.lang.String, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForCQ(query: java.lang.String, root: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForCQ(query: java.lang.String, root: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForCQ(query: java.lang.String, root: js.Any, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForCQNotFound(query: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForCQNotFound(query: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForCQNotFound(query: java.lang.String, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForCQNotVisible(query: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForCQNotVisible(query: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForCQNotVisible(query: java.lang.String, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForCQVisible(query: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForCQVisible(query: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForCQVisible(query: java.lang.String, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForComponent(component: java.lang.String, rendered: scala.Boolean, callback: js.Function): scala.Unit = js.native
  def waitForComponent(component: java.lang.String, rendered: scala.Boolean, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForComponent(
    component: java.lang.String,
    rendered: scala.Boolean,
    callback: js.Function,
    scope: js.Any,
    timeout: scala.Double
  ): scala.Unit = js.native
  def waitForComponentNotVisible(component: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForComponentNotVisible(component: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForComponentNotVisible(component: js.Any, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForComponentQuery(query: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForComponentQuery(query: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForComponentQuery(query: java.lang.String, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForComponentQuery(query: java.lang.String, root: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForComponentQuery(query: java.lang.String, root: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForComponentQuery(query: java.lang.String, root: js.Any, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForComponentQueryNotFound(query: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForComponentQueryNotFound(query: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForComponentQueryNotFound(query: java.lang.String, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForComponentQueryNotFound(query: java.lang.String, root: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForComponentQueryNotFound(query: java.lang.String, root: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForComponentQueryNotFound(query: java.lang.String, root: js.Any, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForComponentQueryNotVisible(query: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForComponentQueryNotVisible(query: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForComponentQueryNotVisible(query: java.lang.String, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForComponentQueryNotVisible(query: java.lang.String, root: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForComponentQueryNotVisible(query: java.lang.String, root: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForComponentQueryNotVisible(query: java.lang.String, root: js.Any, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForComponentQueryVisible(query: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForComponentQueryVisible(query: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForComponentQueryVisible(query: java.lang.String, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForComponentQueryVisible(query: java.lang.String, root: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForComponentQueryVisible(query: java.lang.String, root: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForComponentQueryVisible(query: java.lang.String, root: js.Any, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForComponentVisible(component: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForComponentVisible(component: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForComponentVisible(component: js.Any, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForCompositeQuery(query: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForCompositeQuery(query: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForCompositeQuery(query: java.lang.String, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForCompositeQuery(query: java.lang.String, root: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForCompositeQuery(query: java.lang.String, root: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForCompositeQuery(query: java.lang.String, root: js.Any, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForCompositeQueryNotFound(query: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForCompositeQueryNotFound(query: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForCompositeQueryNotFound(query: java.lang.String, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForCompositeQueryNotFound(query: java.lang.String, root: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForCompositeQueryNotFound(query: java.lang.String, root: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForCompositeQueryNotFound(query: java.lang.String, root: js.Any, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForXType(xtype: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForXType(xtype: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForXType(xtype: java.lang.String, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
  def waitForXType(xtype: java.lang.String, root: js.Any, callback: js.Function): scala.Unit = js.native
  def waitForXType(xtype: java.lang.String, root: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForXType(xtype: java.lang.String, root: js.Any, callback: js.Function, scope: js.Any, timeout: scala.Double): scala.Unit = js.native
}

