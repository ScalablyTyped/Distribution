organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "6.1-dt-20190415Z-c3fcda"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20190604Z-3ce62e",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-631ab6",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-eba1ea",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-39325e",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-eaf893",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-2b97f8",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-9142ec",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-2d92d8",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        