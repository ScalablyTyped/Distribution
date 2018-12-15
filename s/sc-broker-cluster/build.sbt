organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "6.1-dt-20181205Z-1798b5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-6ba948",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180910Z-39a9cc",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181205Z-ce80de",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-dc3293",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181205Z-d0edd8",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181205Z-47c53d",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        