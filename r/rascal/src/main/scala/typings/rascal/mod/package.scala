package typings.rascal.mod

import typings.amqplib.mod.Connection
import typings.rascal.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createBroker(config: BrokerConfig, components: Any, next: CreateCb): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createBroker")(config.asInstanceOf[js.Any], components.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def createBroker(config: BrokerConfig, next: CreateCb): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createBroker")(config.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def createBrokerAsPromised(config: BrokerConfig): js.Promise[BrokerAsPromised] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrokerAsPromised")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BrokerAsPromised]]
inline def createBrokerAsPromised(config: BrokerConfig, components: Any): js.Promise[BrokerAsPromised] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBrokerAsPromised")(config.asInstanceOf[js.Any], components.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BrokerAsPromised]]

inline def withDefaultConfig(config: BrokerConfig): BrokerConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("withDefaultConfig")(config.asInstanceOf[js.Any]).asInstanceOf[BrokerConfig]

inline def withTestConfig(config: BrokerConfig): BrokerConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("withTestConfig")(config.asInstanceOf[js.Any]).asInstanceOf[BrokerConfig]

type AckOrNack = js.Function2[
/* err */ js.UndefOr[js.Error], 
/* recovery */ js.UndefOr[Recovery | js.Array[Recovery]], 
Unit]

type Cb[E, A] = js.Function1[/* x */ js.Tuple2[E | Null, A | scala.Nothing], Unit]

type ConnectCb = js.Function1[/* x */ js.Tuple2[js.Error | Null, Connection | Null], Unit]

type CreateCb = js.Function1[/* x */ js.Tuple2[js.Error | Null, Broker], Unit]

type ErrorCb = js.Function1[/* x */ js.Error | Null, Unit]
