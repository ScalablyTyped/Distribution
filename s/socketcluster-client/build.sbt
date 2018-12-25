organization := "org.scalablytyped"
name := "socketcluster-client"
version := "13.0-dt-20181130Z-0c1167"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180414Z-b0a434",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-96f59f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-1922e9",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-ef3744",
  "org.scalablytyped" %%% "socketcluster-server" % "13.1-dt-20181218Z-f3a25d",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-790def")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        