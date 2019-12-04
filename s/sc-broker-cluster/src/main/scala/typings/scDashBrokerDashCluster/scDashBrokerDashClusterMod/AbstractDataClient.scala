package typings.scDashBrokerDashCluster.scDashBrokerDashClusterMod

import typings.expirymanager.expirymanagerMod.Keys
import typings.fleximap.fleximapMod.FlexiMap
import typings.fleximap.fleximapMod.KeyChain
import typings.node.eventsMod.EventEmitter
import typings.scDashBrokerDashCluster.clientclusterMod.ClientCluster
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-broker-cluster", "AbstractDataClient")
@js.native
class AbstractDataClient protected () extends EventEmitter {
  def this(dataClient: ClientCluster) = this()
  def add(keyChain: KeyChain, value: js.Any): Unit = js.native
  def add(keyChain: KeyChain, value: js.Any, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def add(keyChain: KeyChain, value: js.Any, getValue: Boolean): Unit = js.native
  def add(
    keyChain: KeyChain,
    value: js.Any,
    getValue: Boolean,
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def count(keyChain: KeyChain, callback: js.Function2[/* err */ Error | Null, /* value */ Double, Unit]): Unit = js.native
  def exec(query: js.Function1[/* datamap */ FlexiMap, Unit]): Unit = js.native
  def exec(
    query: js.Function1[/* datamap */ FlexiMap, Unit],
    callback: js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit]
  ): Unit = js.native
  def exec(
    query: js.Function1[/* datamap */ FlexiMap, Unit],
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify QueryOptions */ js.Any
  ): Unit = js.native
  def exec(
    query: js.Function1[/* datamap */ FlexiMap, Unit],
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify QueryOptions */ js.Any,
    callback: js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit]
  ): Unit = js.native
  def expire(keys: Keys, seconds: Double): Unit = js.native
  def expire(keys: Keys, seconds: Double, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def extractKeys(keyChain: KeyChain): js.Array[String] = js.native
  def extractValues(keyChain: KeyChain): js.Array[_] = js.native
  def get(keyChain: KeyChain, callback: js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit]): Unit = js.native
  def getAll(callback: js.Function2[/* err */ Error | Null, /* value */ js.Array[_] | js.Object, Unit]): Unit = js.native
  def getRange(
    keyChain: KeyChain,
    fromIndex: Double,
    callback: js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit]
  ): Unit = js.native
  def getRange(
    keyChain: KeyChain,
    fromIndex: Double,
    toIndex: Double,
    callback: js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit]
  ): Unit = js.native
  def hasKey(keyChain: KeyChain, callback: js.Function2[/* err */ Error | Null, /* data */ Boolean, Unit]): Unit = js.native
  def pop(keyChain: KeyChain, callback: js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit]): Unit = js.native
  def remove(keyChain: KeyChain): Unit = js.native
  def remove(keyChain: KeyChain, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def remove(keyChain: KeyChain, getValue: Boolean): Unit = js.native
  def remove(keyChain: KeyChain, getValue: Boolean, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def removeAll(): Unit = js.native
  def removeAll(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def removeRange(keyChain: KeyChain, fromIndex: Double): Unit = js.native
  def removeRange(keyChain: KeyChain, fromIndex: Double, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def removeRange(keyChain: KeyChain, fromIndex: Double, toIndex: Double): Unit = js.native
  def removeRange(
    keyChain: KeyChain,
    fromIndex: Double,
    toIndex: Double,
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def removeRange(keyChain: KeyChain, fromIndex: Double, toIndex: Double, getValue: Boolean): Unit = js.native
  def removeRange(
    keyChain: KeyChain,
    fromIndex: Double,
    toIndex: Double,
    getValue: Boolean,
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def set(keyChain: KeyChain, value: js.Any): Unit = js.native
  def set(keyChain: KeyChain, value: js.Any, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def set(keyChain: KeyChain, value: js.Any, getValue: Boolean): Unit = js.native
  def set(
    keyChain: KeyChain,
    value: js.Any,
    getValue: Boolean,
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def splice(keyChain: KeyChain): Unit = js.native
  def splice(keyChain: KeyChain, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def splice(
    keyChain: KeyChain,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpliceOptions */ js.Any
  ): Unit = js.native
  def splice(
    keyChain: KeyChain,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpliceOptions */ js.Any,
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def unexpire(keys: Keys): Unit = js.native
  def unexpire(keys: Keys, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
}

