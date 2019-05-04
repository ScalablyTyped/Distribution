organization := "org.scalablytyped"
name := "react-router-bootstrap"
version := "0.24-dt-20190322Z-68b84a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-0e3323",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-66be5f",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190504Z-19278e",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190228Z-c482d2",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20190404Z-dced13",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        