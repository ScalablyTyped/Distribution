organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "6.1-dt-20181218Z-f458b5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-7389a9",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180414Z-b0a434",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-74ffd8",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-544dbb",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-7196b1",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-ef3744",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        