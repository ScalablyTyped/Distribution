package typings
package scDashBrokerDashClusterLib.scDashBrokerDashClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-broker-cluster", "AbstractDataClient")
@js.native
class AbstractDataClient protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(dataClient: scDashBrokerDashClusterLib.clientclusterMod.ClientCluster) = this()
  def add(keyChain: fleximapLib.fleximapMod.KeyChain, value: js.Any): scala.Unit = js.native
  def add(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    value: js.Any,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def add(keyChain: fleximapLib.fleximapMod.KeyChain, value: js.Any, getValue: scala.Boolean): scala.Unit = js.native
  def add(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    value: js.Any,
    getValue: scala.Boolean,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def count(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def exec(query: js.Function1[/* datamap */ fleximapLib.fleximapMod.FlexiMap, scala.Unit]): scala.Unit = js.native
  def exec(
    query: js.Function1[/* datamap */ fleximapLib.fleximapMod.FlexiMap, scala.Unit],
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def exec(
    query: js.Function1[/* datamap */ fleximapLib.fleximapMod.FlexiMap, scala.Unit],
    options: scDashBrokerLib.scDashBrokerMod.QueryOptions
  ): scala.Unit = js.native
  def exec(
    query: js.Function1[/* datamap */ fleximapLib.fleximapMod.FlexiMap, scala.Unit],
    options: scDashBrokerLib.scDashBrokerMod.QueryOptions,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def expire(keys: expirymanagerLib.expirymanagerMod.Keys, seconds: scala.Double): scala.Unit = js.native
  def expire(
    keys: expirymanagerLib.expirymanagerMod.Keys,
    seconds: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def extractKeys(keyChain: fleximapLib.fleximapMod.KeyChain): js.Array[java.lang.String] = js.native
  def extractValues(keyChain: fleximapLib.fleximapMod.KeyChain): js.Array[_] = js.native
  def get(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getAll(
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ js.Array[_] | js.Object, scala.Unit]
  ): scala.Unit = js.native
  def getRange(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    fromIndex: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getRange(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    fromIndex: scala.Double,
    toIndex: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def hasKey(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def pop(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def remove(keyChain: fleximapLib.fleximapMod.KeyChain): scala.Unit = js.native
  def remove(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def remove(keyChain: fleximapLib.fleximapMod.KeyChain, getValue: scala.Boolean): scala.Unit = js.native
  def remove(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    getValue: scala.Boolean,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def removeAll(): scala.Unit = js.native
  def removeAll(callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def removeRange(keyChain: fleximapLib.fleximapMod.KeyChain, fromIndex: scala.Double): scala.Unit = js.native
  def removeRange(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    fromIndex: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def removeRange(keyChain: fleximapLib.fleximapMod.KeyChain, fromIndex: scala.Double, toIndex: scala.Double): scala.Unit = js.native
  def removeRange(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    fromIndex: scala.Double,
    toIndex: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def removeRange(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    fromIndex: scala.Double,
    toIndex: scala.Double,
    getValue: scala.Boolean
  ): scala.Unit = js.native
  def removeRange(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    fromIndex: scala.Double,
    toIndex: scala.Double,
    getValue: scala.Boolean,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def set(keyChain: fleximapLib.fleximapMod.KeyChain, value: js.Any): scala.Unit = js.native
  def set(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    value: js.Any,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def set(keyChain: fleximapLib.fleximapMod.KeyChain, value: js.Any, getValue: scala.Boolean): scala.Unit = js.native
  def set(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    value: js.Any,
    getValue: scala.Boolean,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def splice(keyChain: fleximapLib.fleximapMod.KeyChain): scala.Unit = js.native
  def splice(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def splice(keyChain: fleximapLib.fleximapMod.KeyChain, options: scDashBrokerLib.scDashBrokerMod.SpliceOptions): scala.Unit = js.native
  def splice(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    options: scDashBrokerLib.scDashBrokerMod.SpliceOptions,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def unexpire(keys: expirymanagerLib.expirymanagerMod.Keys): scala.Unit = js.native
  def unexpire(
    keys: expirymanagerLib.expirymanagerMod.Keys,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
}

