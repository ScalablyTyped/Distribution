package typings.rascal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createBroker(config: typings.rascal.mod.BrokerConfig, components: js.Any, next: typings.rascal.mod.CreateCb): scala.Unit = (typings.rascal.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBroker")(config.asInstanceOf[js.Any], components.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def createBroker(config: typings.rascal.mod.BrokerConfig, next: typings.rascal.mod.CreateCb): scala.Unit = (typings.rascal.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBroker")(config.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def createBrokerAsPromised(config: typings.rascal.mod.BrokerConfig): js.Promise[typings.rascal.mod.BrokerAsPromised] = typings.rascal.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBrokerAsPromised")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.rascal.mod.BrokerAsPromised]]
inline def createBrokerAsPromised(config: typings.rascal.mod.BrokerConfig, components: js.Any): js.Promise[typings.rascal.mod.BrokerAsPromised] = (typings.rascal.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBrokerAsPromised")(config.asInstanceOf[js.Any], components.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.rascal.mod.BrokerAsPromised]]

inline def withDefaultConfig(config: typings.rascal.mod.BrokerConfig): typings.rascal.mod.BrokerConfig = typings.rascal.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withDefaultConfig")(config.asInstanceOf[js.Any]).asInstanceOf[typings.rascal.mod.BrokerConfig]

inline def withTestConfig(config: typings.rascal.mod.BrokerConfig): typings.rascal.mod.BrokerConfig = typings.rascal.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withTestConfig")(config.asInstanceOf[js.Any]).asInstanceOf[typings.rascal.mod.BrokerConfig]

type AckOrNack = js.Function2[
/* err */ js.UndefOr[typings.std.Error], 
/* recovery */ js.UndefOr[typings.rascal.mod.Recovery | js.Array[typings.rascal.mod.Recovery]], 
scala.Unit]

type Cb[E, A] = js.Function1[/* x */ js.Tuple2[E | scala.Null, A | scala.Nothing], scala.Unit]

type ConnectCb = js.Function1[
/* x */ js.Tuple2[typings.std.Error | scala.Null, typings.amqplib.mod.Connection | scala.Null], 
scala.Unit]

type CreateCb = js.Function1[
/* x */ js.Tuple2[typings.std.Error | scala.Null, typings.rascal.mod.Broker], 
scala.Unit]

type ErrorCb = js.Function1[/* x */ typings.std.Error | scala.Null, scala.Unit]
